import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long k = sc.nextLong();
		double  org = 100;
		sc.close();
		double a = 1.01;
		int i  = 1;
		while (true) {
			org = Math.floor(org*a);
			if (org >= k) break;
			i= i+1;
		}
		System.out.println(i);
	}
}
