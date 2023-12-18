import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		long sum = 0;
		Integer H[] = new Integer[N];

		for (int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}
		sc.close();

		Arrays.sort(H, Collections.reverseOrder());

		if (N <= K) {
			System.out.println(0);
		} else {

			for (int i = 0; i < K; i++) {
				H[i] = 0;
			}
			for (int i = 0; i < N; i++) {
				sum += H[i];
			}
			System.out.println(sum);
		}
	}
}
