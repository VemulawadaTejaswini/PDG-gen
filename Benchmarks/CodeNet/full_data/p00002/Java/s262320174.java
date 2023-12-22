import java.util.Scanner;


public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		int a,b,sum;
		while(sc.hasNext())
		{
			a = sc.nextInt();
			b = sc.nextInt();
			sum = a + b;
			System.out.println((int)Math.log10(sum) + 1);
		}
	}
}