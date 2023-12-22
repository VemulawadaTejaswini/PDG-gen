import java.math.BigInteger;
import java.util.Scanner;

public class Main
{
	static int num=1;
	static BigInteger one = BigInteger.valueOf(num);
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);

		int num2=0;
		BigInteger zero = BigInteger.valueOf(num2);

		while(scan.hasNext())
		{
			BigInteger n = scan.nextBigInteger();
			if(n.compareTo(zero)==0)
				System.exit(1);

			String str = String.valueOf(fact(n));
			//System.out.println(str);
			char a[] = new char[str.length()];

			for(int i=0; i<str.length(); i++) 
				a[i] = str.charAt(i);

			int ans=0;
			for(int i=str.length()-1; i>=0; i--)
			{
				if(a[i] == '0')
					ans++;
				else
					break;
			}
			System.out.println(ans);
		}

	}

	public static BigInteger fact(BigInteger n)
	{
		if(n.compareTo(one)<=0)
			return one;
		n = n.multiply((fact(n.subtract(one))));
		return n;
	}

}