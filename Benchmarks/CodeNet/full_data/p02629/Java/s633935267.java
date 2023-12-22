import java.util.Scanner;

public class Main {

	static long mod = 1000000007;
	static long INF = Long.MAX_VALUE;

	static long chmin(long a, long b) {
		return Math.min(a, b);
	}

	static long chmax(long a, long b) {
		return Math.max(a, b);
	}

	public static void main(String[] args) {
		// AtCoder_C
		Scanner sc = new Scanner(System.in);
		long N = sc.nextLong();
	    // Scannerクラスのインスタンスをクローズ
		sc.close();

		String ans = "";

		while (N>0) {
			N -= 1;
			ans = (char)('a'+(N%26)) + ans;
			N /= 26;
		}

		System.out.print(ans);
	}
}