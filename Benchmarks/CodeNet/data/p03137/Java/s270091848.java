
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.next());
		int M = Integer.parseInt(scan.next());
		if (N >= M) {
			System.out.println(0);
			return;
		}
		int[] X = new int[M];
		for (int i = 0; i < M; i++) {
			X[i] = Integer.parseInt(scan.next());
		}
		Arrays.sort(X);
		int[] dis = new int[M - 1];
		for (int i = 0; i < M - 1; i++) {
			dis[i] = X[i + 1] - X[i];
		}
		Arrays.sort(dis);
		int sum = 0;
		for (int i = 0; i < M - N; i++) {
			sum += dis[i];
		}
		System.out.println(sum);
	}
}
