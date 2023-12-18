import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int H[] = new int[N];
		long answer = 0;

		for (int i = 0; i < N; i++) {
			H[i] = sc.nextInt();
		}

		Arrays.sort(H);

		for (int i = N - 1 - K; 0 <= i; i--) {
			answer += H[i];
		}

		System.out.println(answer);
	}
}