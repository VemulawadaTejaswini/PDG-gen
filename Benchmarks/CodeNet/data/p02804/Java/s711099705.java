import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static final long MOD = 1000000007;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		long[] combination = new long[n];

		combination[k - 1] = 1;
		for (int i = k; i < n; i++) {
			combination[i] = (combination[i - 1] * i / (i - k + 1)) % MOD;
		}

		long[] array = new long[n];
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		Arrays.sort(array);

		long max = 0;
		long min = 0;

		for (int i = k; i <= n; i++) {
			max = (max + array[i - 1] * combination[i - 1]) % MOD;
		}

		for (int i = k; i <= n; i++) {
			min = (min + array[n - i] * combination[i - 1]) % MOD;
		}

		print((max + MOD - min) % MOD);
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}