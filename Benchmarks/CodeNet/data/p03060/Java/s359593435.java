import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int X = 0, Y = 0;

		int N = sc.nextInt();
		if (N >= 1 && N <= 20) {
			int V[] = new int[N];
			for (int a = 0; a < N; a++) {
				if (V[a] <= 50 && V[a] >= 1)
					V[a] = sc.nextInt();
			}

			for (int i = 0; i < N; i++) {
				X = V[0] + V[N - 1];
			}

			int C[] = new int[N];
			for (int a = 0; a < N; a++) {
				if (C[a] <= 50 && V[a] >= 1)
				C[a] = sc.nextInt();
			}

			for (int i = 0; i < N; i++) {
				Y = C[0] + C[N - 1];
			}

		}

	}
}