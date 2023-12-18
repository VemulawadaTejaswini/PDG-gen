import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int M = in.nextInt();
		int[] X = new int[M];
		for (int i = 0; i < M; i++) {
			X[i] = in.nextInt();
		}
		Arrays.sort(X);
		int[] d = new int[M - 1];
		for (int i = 0; i < M - 1; i++) {
			d[i] = X[i + 1] - X[i];
		}
		Arrays.sort(d);
		int ans = 0;
		for (int i = 0; i < d.length - (N - 1); i++) {
			ans += d[i];
		}
		System.out.println(ans);
		in.close();
	}
}