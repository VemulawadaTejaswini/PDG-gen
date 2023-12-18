import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;


public class Main {
	public static BigInteger Big(int x)
	{
		return BigInteger.valueOf(x);
	}
	public static BigInteger Gcd(BigInteger a,BigInteger b)
	{
		while(!b.equals(Big(0)))
		{
			BigInteger t=b;
			b=a.mod(b);
			a=t;
		}
		return a;
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[100005];
		for(int i=1;i<=n;i++)
			a[i]=sc.nextInt();
		BigInteger ans=Big(1);
		for(int i=1;i<=n;i++)
			ans=ans.divide(Gcd(ans,Big(a[i]))).multiply(Big(a[i]));
		BigInteger res=Big(0);
		for(int i=1;i<=n;i++)
			res=res.add(ans.divide(Big(a[i])));
		System.out.println(res.mod(Big(1000000007)));
	}
}
