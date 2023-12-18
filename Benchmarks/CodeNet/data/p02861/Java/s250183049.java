import java.util.*;

class Main {
	Scanner sc;
	int[] x, y;
	void calc() {
		sc = new Scanner(System.in);
		int N = sc.nextInt();
		x = new int[N];
		y = new int[N];
		for (int i = 0; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		double sum = 0d;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (i == j) continue;
				int dx = x[i]-x[j];
				int dy = y[i]-y[j];
				sum += Math.sqrt(dx*dx+dy*dy);
			}
		}
		for (int i = 2; i <= N; i++) sum /= i;
		System.out.println(sum*(N-1));
	}

	public static void main(String[] args) {
		new Main().calc();
	}
}