import java.math.BigInteger;
import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		long f[]=new long[90];
		f[0]=2;
		f[1]=1;
		for(int i=2;i<=86;i++)
			f[i]=f[i-1]+f[i-2];
		System.out.println(f[a]);
	}
}