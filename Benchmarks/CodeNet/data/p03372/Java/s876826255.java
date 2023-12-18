import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		long C = reader.nextLong();
		long ans1 = 0;
		long ans2 = 0;
		long current = 0;
		long[] X = new long[N];
		long[] Y = new long[N];
		for (int i = 0; i < N; i ++) {
			X[i] = reader.nextLong();
			Y[i] = reader.nextLong();
			long move = Math.min(X[i] - current, Math.abs(C - X[i] + current));
			if (Y[i] > move) {
				ans1 += Y[i];
				ans1 -= move;
				current = X[i];
			}
		}
		current = C;
		for (int i = N-1; i >= 0; i--) {
			long move = Math.min(Math.abs(X[i] - current), Math.abs(C - X[i] + current));
			if (Y[i] > move) {
				ans2 += Y[i];
				ans2 -= move;
				current = X[i];
			}
		}
		System.out.print(Math.max(ans1, ans2));
		reader.close();
	}
}

