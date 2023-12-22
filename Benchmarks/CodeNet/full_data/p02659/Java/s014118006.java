import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		double b = sc.nextDouble();
		sc.close();
		long d = (long)(b *100);
		long c = a*d;
		c = c /100;
		System.out.println(c);
	}
}