import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
		int ans = 0;
		boolean canDiv = false;

		for (long i = 2; i <= N / 2; i++) {
			if(N%i == 0) {
				canDiv = true;
				if (countDigits(i)>=countDigits(N/i)) {
					ans = countDigits(i);
					break;
				}
			}
		}
		if (!canDiv) {
			System.out.println(countDigits(N));
		} else {
			System.out.println(ans);
		}
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
