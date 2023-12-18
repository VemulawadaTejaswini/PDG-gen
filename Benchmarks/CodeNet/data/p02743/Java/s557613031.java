
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);


        BigInteger a=cin.nextBigInteger();
        BigInteger b=cin.nextBigInteger();
        BigInteger c=cin.nextBigInteger();
        BigInteger ab=myBigNumSqrt(a);
        BigInteger bb = myBigNumSqrt(b);
        BigInteger cb = myBigNumSqrt(c);
        BigInteger val = ab.add(bb);
        int res = val.compareTo(cb);

        System.out.println(res==1?"No":"Yes");
    }

    //大数开方
    public static BigInteger myBigNumSqrt(BigInteger xx)
    {
        BigDecimal x=new BigDecimal(xx);
        BigDecimal n1=BigDecimal.ONE;
        BigDecimal ans=BigDecimal.ZERO;

        while((n1.multiply(n1).subtract(x)).abs().compareTo(BigDecimal.valueOf(0.001))==1)
        {

            BigDecimal s1=x.divide(n1,2000,BigDecimal.ROUND_HALF_UP);
            BigDecimal s2=n1.add(s1);
            n1=s2.divide(BigDecimal.valueOf(2),2000,BigDecimal.ROUND_HALF_UP);

        }
        ans=n1;

        BigInteger rt =new BigInteger(ans.toString().split("\\.")[0]);
        return rt;
    }
}