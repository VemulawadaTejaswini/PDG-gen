import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		sc.close();
		int ans = 11;
		for (long i=1; i<=n; i++) {
			if (n % i == 0) {
				long j = n / i;
				int buf = 0;
				int a = keta(i);
				int b = keta(j);
				if (a>=b) {
					buf = a;
				} else {
					buf = b;
				}
				if (ans > buf) ans = buf;
				if (a == b) break;
			}
		}
		System.out.println(ans);
	}

	private static int keta(long n)
	{
		int ans = 1;
		long index = 10;
		for (int i=0; i<10; i++) {
			if (n <index) return ans;
			index *=10;
			ans +=1;
		}
		return ans;
	}
}
