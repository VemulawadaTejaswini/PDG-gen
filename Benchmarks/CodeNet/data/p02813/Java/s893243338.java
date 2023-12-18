import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] P = new int[N + 1];
		for (int i = 1; i <= N; i++)
			P[i] = sc.nextInt();
		int[] Q = new int[N + 1];
		for (int i = 1; i <= N; i++)
			Q[i] = sc.nextInt();
		int a = 0;
		for (int i = 1; i <= N; i++) {
			int count = 1;
			for (int j = 1; j < i; j++) {
				if (P[i] > P[j])
					count++;
			}
			a += fact(N - i) * (P[i] - count);
		}

		int b = 0;
		for (int i = 1; i <= N; i++) {
			int count = 1;
			for (int j = 1; j < i; j++) {
				if (Q[i] > Q[j])
					count++;
			}
			b += fact(N - i) * (Q[i] - count);
		}

		System.out.println(Math.abs(a - b));

	}

	public static int fact(int n) {
		if (n == 1 || n == 0)
			return 1;
		else
			return n * fact(n - 1);
	}
}
