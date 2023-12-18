import java.util.Scanner;

public class Main {
	static final int MOD = 1000000007;

	static long x = 0;
	static long y = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());

		int[] a = new int[n];
		int[] mae = new int[n];
		int[] ato = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(sc.next());
		}

		long cnt = 0;

		count(k);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (a[i] < a[j]) {
					mae[i]++;
				}
			}
			for (int j = i + 1; j < n; j++) {
				if (a[i] < a[j]) {
					ato[i]++;
				}
			}

			cnt += (x * mae[i]) % MOD;
			cnt += (y * ato[i]) % MOD;

		}

		System.out.println(cnt);
		sc.close();
	}

	static void count(int k) {

		for (int i = 1; i < k; i++) {
			y += i;
			y %= MOD;
		}
		x += k;
		x %= MOD;
	}
}