import java.util.*;
import java.math.*;
public class Main 
{
	static public void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		BigInteger a,b,x;
		a=in.nextBigInteger();
		b=in.nextBigInteger();
		x=in.nextBigInteger();
		a=a.subtract(BigInteger.ONE);
		a=a.divide(x);
		b=b.divide(x);
	    System.out.print(b.subtract(a));
	}
}
