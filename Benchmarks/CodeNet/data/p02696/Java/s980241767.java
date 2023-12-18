import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long b = sc.nextLong();
		long n = sc.nextLong();
		double bb = b;
		sc.close();
		double ans = 0;
		for (long i=1; i<=n; i++) {
			double inv = i / bb;
			double kai = Math.floor(a*inv)-a*Math.floor(inv);
			if (ans < kai) ans = kai;
		}
		ans = Math.floor(ans);
		System.out.println((int)ans);
	}
}
