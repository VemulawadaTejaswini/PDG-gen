
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	int N = 8;
	int[] row = new int[N];
	boolean[] col = new boolean[N];
	boolean[] dpos = new boolean[2 * N - 1];
	boolean[] dneg = new boolean[2 * N - 1];
	boolean[][] map = new boolean[N][N];

	void initialize() {
		Arrays.fill(row, -1);
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Arrays.fill(row, -1);
		while (n-- > 0) {
			int i = scanner.nextInt();
			int j = scanner.nextInt();
			row[i] = j;
			col[j] = dpos[i + j] = dneg[i - j + N - 1] = true;
		}
		slove(0);
	}

	boolean flag = false;

	private void slove(int i) {
		if (i == N) {
			flag = true;
			print();
			return;
		}
		if (row[i] != -1)
			slove(i + 1);

		for (int j = 0; j < N; j++) {
			if (flag)
				return;
			if (row[i] != -1)
				return;
			if (col[j] || dpos[i + j] || dneg[i - j + N - 1])
				continue;
			row[i] = j;
			col[j] = dpos[i + j] = dneg[i - j + N - 1] = true;
			slove(i + 1);
			row[i] = -1;
			col[j] = dpos[i + j] = dneg[i - j + N - 1] = false;

		}
	}

	private void print() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print(row[i] == j ? 'Q' : '.');
			}
			System.out.println();
		}
	}
}