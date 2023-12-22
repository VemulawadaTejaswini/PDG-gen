import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static boolean[] isPrime = new boolean[10001];

	public static void main(String[] args) {
		for (int i = 2; i <= 10000; ++i) {
			isPrime[i] = isPrime(i);
		}
		while (sc.hasNext()) {
			int N = sc.nextInt();
			int ans = 0;
			for (int i = 1; i <= N; ++i) {
				if (isPrime[i] && isPrime[N - i + 1]) ++ans;
			}
			System.out.println(ans);
		}
	}

	static boolean isPrime(int v) {
		for (int i = 2; i * i <= v; ++i) {
			if (v % i == 0) return false;
		}
		return true;
	}
}