import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long a = sc.nextLong();
		long b = sc.nextLong();
		sc.close();
		// aがnより大きいパタン
		if (a >= n) {
			System.out.println(a);
		}
		// bがnより大きいばたん
		else if (b >= n) {
			System.out.println(a);
		}
		// a+bがnより大きいパタン
		else if ((a + b) >= n) {
			System.out.println(a);
		}
		// a+nがn以下のパタン
		else {
			long ab = a + b;
			if (ab == 0) {
				System.out.println(0);
				return;
			}
			long count = n / ab;
			long remainder = n % ab;
			long ans = a * count;
			if (remainder >= a) {
				ans = ans + a;
			} else {
				ans = ans + remainder;
			}
			System.out.println(ans);
		}
	}
}
