package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 裁判
 *
 * @author 
 * @email
 */
@TableName("caipan")
public class CaipanEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public CaipanEntity() {

	}

	public CaipanEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @TableField(value = "password")

    private String password;


    /**
     * 裁判姓名
     */
    @TableField(value = "caipan_name")

    private String caipanName;


    /**
     * 裁判手机号
     */
    @TableField(value = "caipan_phone")

    private String caipanPhone;


    /**
     * 裁判身份证号
     */
    @TableField(value = "caipan_id_number")

    private String caipanIdNumber;


    /**
     * 裁判头像
     */
    @TableField(value = "caipan_photo")

    private String caipanPhoto;


    /**
     * 性别
     */
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 电子邮箱
     */
    @TableField(value = "caipan_email")

    private String caipanEmail;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：裁判姓名
	 */
    public String getCaipanName() {
        return caipanName;
    }


    /**
	 * 获取：裁判姓名
	 */

    public void setCaipanName(String caipanName) {
        this.caipanName = caipanName;
    }
    /**
	 * 设置：裁判手机号
	 */
    public String getCaipanPhone() {
        return caipanPhone;
    }


    /**
	 * 获取：裁判手机号
	 */

    public void setCaipanPhone(String caipanPhone) {
        this.caipanPhone = caipanPhone;
    }
    /**
	 * 设置：裁判身份证号
	 */
    public String getCaipanIdNumber() {
        return caipanIdNumber;
    }


    /**
	 * 获取：裁判身份证号
	 */

    public void setCaipanIdNumber(String caipanIdNumber) {
        this.caipanIdNumber = caipanIdNumber;
    }
    /**
	 * 设置：裁判头像
	 */
    public String getCaipanPhoto() {
        return caipanPhoto;
    }


    /**
	 * 获取：裁判头像
	 */

    public void setCaipanPhoto(String caipanPhoto) {
        this.caipanPhoto = caipanPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：电子邮箱
	 */
    public String getCaipanEmail() {
        return caipanEmail;
    }


    /**
	 * 获取：电子邮箱
	 */

    public void setCaipanEmail(String caipanEmail) {
        this.caipanEmail = caipanEmail;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Caipan{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", caipanName=" + caipanName +
            ", caipanPhone=" + caipanPhone +
            ", caipanIdNumber=" + caipanIdNumber +
            ", caipanPhoto=" + caipanPhoto +
            ", sexTypes=" + sexTypes +
            ", caipanEmail=" + caipanEmail +
            ", createTime=" + createTime +
        "}";
    }
}
