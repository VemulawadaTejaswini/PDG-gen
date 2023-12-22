import java.math.BigInteger;
import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner sc =new Scanner(System.in);
		while(sc.hasNext())
		{
			BigInteger ans = sc.nextBigInteger().gcd(sc.nextBigInteger());
			System.out.println(ans);
		}
	}
}