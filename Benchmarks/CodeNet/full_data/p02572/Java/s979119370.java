import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		Long[] array = new Long[N];
		Long total = 0L;

		int MOD = 1000000007;

		for (int i = 0; i < N; i++) {
			array[i] = sc.nextLong();
		}

		for (int i = 0; i < N - 1; i++) {
			for (int j = i + 1; j < N; j++) {

				total += array[i] * array[j];

				if (total > MOD) {
					total = total % MOD;
				}
			}
		}

		System.out.println(total);

	}

}