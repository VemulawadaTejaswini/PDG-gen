import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(fact(n));
	}

	public static int fact(int n)
	{
		if(n<=1)
			return 1;
		n = n*fact(n-1);
		return n;
	}

}