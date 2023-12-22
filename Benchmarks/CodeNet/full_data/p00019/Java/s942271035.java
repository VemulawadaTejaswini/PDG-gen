import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		System.out.println(fact(n));
	}

	public static long fact(long n)
	{
		if(n<=1)
			return 1;
		n = n*fact(n-1);
		return n;
	}

}