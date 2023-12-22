import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int n, s;
	int ans;
	int table[][] = new int[1000][11];
	boolean use[] = new boolean[10];
	int p[] = new int[10];

	void makeParm(int sum, int n, int[] p, boolean[] use) {
		table[sum][n]++;
		if (n == 10) {
			return;
		}
		for (int i = 0; i < 10; i++) {
			if (use[i]) {
				continue;
			}
			p[n] = i;
			use[i] = true;
			makeParm(sum + ((n + 1) * p[n]), n + 1, p, use);
			use[i] = false;
		}
	}

	void run() {
		makeParm(0, 0, p, use);
		while (sc.hasNext()) {
			n = sc.nextInt();
			s = sc.nextInt();
			System.out.println(table[s][n]);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}