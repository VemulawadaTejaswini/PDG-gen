import java.util.Scanner;

public class Main
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = 100;
		for(int i=0;i<n;i++)
		{
			m = (int)Math.ceil(m*1.05);
		}
		System.out.println(m*1000);
	}
}