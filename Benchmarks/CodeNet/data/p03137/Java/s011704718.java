import java.util.Arrays;
import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int N = sc.nextInt();
	static int M = sc.nextInt();
	static int X[] = new int[M];
	static int ans = 0;

	public static void main(String[] args) {
		if(N >= M) {
			System.out.println(ans);
			return;
		}

		for(int i = 0; i < M; i++) {
			X[i] = sc.nextInt();
		}
		Arrays.sort(X);
		ans = X[M - 1] - X[0];
		int dif[] = new int[M - 1];
		for(int i = 0; i < M - 1; i++) {
			dif[i] = X[i + 1] - X[i];
		}
		Arrays.sort(dif);
		for(int i = 0; i < N - 1; i++) {
			ans -= dif[M - 2 - i];
		}
		System.out.println(ans);
	}
}