import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MainD {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int h = Integer.parseInt(sa[0]);
		int w = Integer.parseInt(sa[1]);
		char[][] s = new char[h][w];
		for (int i = 0; i < h; i++) {
			s[i] = br.readLine().toCharArray();
		}
		br.close();

		int[][] val1 = new int[h][w];
		for (int i = 0; i < h; i++) {
			int idx = -1;
			int cnt = 0;
			for (int j = 0; j < w; j++) {
				if (s[i][j] == '.') {
					cnt++;
				} else {
					for (int k = idx + 1; k < j; k++) {
						val1[i][k] = cnt;
					}
					idx = j;
					cnt = 0;
				}
			}
			if (cnt > 0) {
				for (int k = idx + 1; k < w; k++) {
					val1[i][k] = cnt;
				}
			}
		}

		int[][] val2 = new int[h][w];
		for (int j = 0; j < w; j++) {
			int idx = -1;
			int cnt = 0;
			for (int i = 0; i < h; i++) {
				if (s[i][j] == '.') {
					cnt++;
				} else {
					for (int k = idx + 1; k < i; k++) {
						val2[k][j] = cnt;
					}
					idx = i;
					cnt = 0;
				}
			}
			if (cnt > 0) {
				for (int k = idx + 1; k < h; k++) {
					val2[k][j] = cnt;
				}
			}
		}

		int ans = 0;
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (s[i][j] != '#') {
					int val = val1[i][j] + val2[i][j] - 1;
					ans = Math.max(ans, val);
				}
			}
		}
		System.out.println(ans);
	}
}
