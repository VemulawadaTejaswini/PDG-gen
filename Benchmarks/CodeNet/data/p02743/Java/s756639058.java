import java.util.*;
import java.math.*;
public class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
long a=sc.nextLong();
long b=sc.nextLong();
long c=sc.nextLong();
BigDecimal as,bs,cs;
BigDecimal a1 = new BigDecimal(a);
BigDecimal b1 = new BigDecimal(b);
BigDecimal c1 = new BigDecimal(c);
as=sqrt(a1);
bs=sqrt(b1);
cs=sqrt(c1);
if((as.add(bs)).compareTo(cs)==1)
System.out.println("No");
else
System.out.println("Yes");

}
public static BigDecimal sqrt(BigDecimal x) {
	return BigDecimal.valueOf(StrictMath.sqrt(x.doubleValue()));
}
}