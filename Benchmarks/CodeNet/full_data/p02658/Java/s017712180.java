import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String str = sc.nextLine();
		long b = 0;
		long ans = 1;
		long  c = (long)Math.pow(10, 18);
		for (int i=0; i<n; i++) {
			b = sc.nextLong();
			ans *= b;
		}
		sc.close();
		if (ans > c) {
			ans = -1;
		}

		System.out.println(ans);
	}
}
