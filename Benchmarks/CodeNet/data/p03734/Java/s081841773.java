import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	void run() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int w = sc.nextInt();
			ArrayList<Integer> ws = new ArrayList<Integer>();
			List<Integer>[] vs = new ArrayList[4];
			for (int i = 0; i < 4; i++) {
				vs[i] = new ArrayList<Integer>();
			}

			for (int i = 0; i < n; i++) {
				int ww = sc.nextInt();
				int vv = sc.nextInt();
				int id = ws.indexOf(ww);
				if (id == -1) {
					vs[ws.size()].add(vv);
					ws.add(ww);
				} else {
					vs[id].add(vv);
				}
			}

			for (int i = 0; i < 4; i++) {
				Collections.sort(vs[i]);
			}

			while (ws.size() < 4) {
				ws.add(0);
			}

			long[][] vSum = new long[4][n + 1];
			for (int i = 0; i < 4; i++) {
				for (int j = 1; j <= vs[i].size(); j++) {
					vSum[i][j] = vSum[i][j - 1] + vs[i].get(j - 1);
				}
			}

			long max = 0;
			for (int a = 0; a <= vs[0].size(); a++) {
				for (int b = 0; b <= vs[1].size(); b++) {
					for (int c = 0; c <= vs[2].size(); c++) {
						for (int d = 0; d <= vs[3].size(); d++) {
							long nSum = ws.get(0) * a + ws.get(1) * b + ws.get(2) * c + ws.get(3) * d;
							if (nSum > w) {
								break;
							}

							max = Math.max(max, vSum[0][a] + vSum[1][b] + vSum[2][c] + vSum[3][d]);
						}
					}
				}
			}

			System.out.println(max);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
