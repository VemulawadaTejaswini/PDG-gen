import java.util.*;
import java.math.*;
public class Main {
     public static String mul(String v1, String v2, int scale) {
        if (scale < 0) {
            throw new IllegalArgumentException(
                    "The scale must be a positive integer or zero");
        }
        BigDecimal b1 = new BigDecimal(v1);
        BigDecimal b2 = new BigDecimal(v2);
        return b1.multiply(b2).setScale(scale, BigDecimal.ROUND_DOWN).toString();
    }
    public static void main(String[] args)
    {
       Scanner input =new Scanner(System.in);
String str1=input.next();
        String str2=input.next();//会从控制5261台读入一4102个字符串，1653以空格版为标志权
        Main c=new Main();
        System.out.println(c.mul(str1,str2,0));

    }
}
