import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N, M, X, Y;
		N = sc.nextInt();
		M = sc.nextInt();
		X = sc.nextInt();
		Y = sc.nextInt();
		int x[] = new int[N];
		int y[] = new int[M];
		int max = 0;
		int min = 101;
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			if (max < x[i]) {
				max = x[i];
			}
		}
		for (int i = 0; i < M; i++) {
			y[i] = sc.nextInt();
			if (min > y[i]) {
				min = y[i];
			}
		}
		sc.close();
		if (min - max > 0) {
			System.out.println("No War");
		} else {
			System.out.println("War");
		}
	}
}
