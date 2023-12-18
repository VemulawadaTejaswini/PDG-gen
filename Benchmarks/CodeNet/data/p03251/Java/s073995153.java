import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int Y = sc.nextInt();

		int[] x = new int[N];
		int[] y = new int[N];
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
		}
		for (int i = 0; i < M; i++) {
			y[i] = sc.nextInt();
		}

		int XMAX = X;
		int YMIN = Y;

		for (int i = 0; i < N; i++) {
			XMAX = Math.max(XMAX, x[i]);
		}
		for (int i = 0; i < M; i++) {
			YMIN = Math.min(YMIN, y[i]);
		}

		if (XMAX < YMIN) System.out.println("No War");
		else System.out.println("War");
	}
}