import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int ans = 0;
		boolean canDiv = false;

		long search = (long)Math.sqrt(N);

		for (long i = 1; i <= search; i++) {
			if(N%i == 0) {
				canDiv = true;
				ans = countDigits(N/i);
			}
		}

		System.out.println(ans);
	}

	public static int countDigits(long n) {
		int cnt = 0;
		while (n > 0) {
			cnt++;
			n /=10;
		}
		return cnt;
	}
}
