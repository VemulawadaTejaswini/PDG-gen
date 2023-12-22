import java.util.Arrays;
import java.util.Scanner;

public class Main {
	Scanner in = new Scanner(System.in);
	int[] points;
	int[][][] schedule;
	int N, ans;

	void simulateDate(boolean[] hersSche, int startMan, int res) {
		for (int i = startMan; i < N; i++) {
			boolean[] temp = Arrays.copyOf(hersSche, 23);
			nextMan: for (int j = 0; j < schedule[i].length; j++) {
				int start = schedule[i][j][0];
				int end = schedule[i][j][1];
				for (int k = start; k < end; k++) {
					if (hersSche[k]) {
						break nextMan;
					} else {
						temp[k] = true;
					}
				}
				if (j == schedule[i].length - 1) 
					simulateDate(temp, i + 1, res + points[i]);
			}
		}
		ans = (res > ans) ? res : ans;
	}

	public void run() {
		while (true) {
			N = in.nextInt();
			if (N == 0)
				break;
			ans = -1;
			boolean[] hersSche = new boolean[23];
			schedule = new int[N][][];
			points = new int[N];
			Arrays.fill(hersSche, false);
			for (int i = 0; i < N; i++) {
				int scheNum = in.nextInt();
				points[i] = in.nextInt();
				schedule[i] = new int[scheNum][2];
				for (int k = 0; k < scheNum; k++) {
					schedule[i][k][0] = in.nextInt();
					schedule[i][k][1] = in.nextInt();
				}
			}
			simulateDate(hersSche, 0, 0);
			System.out.println(ans);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}