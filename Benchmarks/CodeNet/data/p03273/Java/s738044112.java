import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int h = Integer.parseInt(sa[0]);
		int w = Integer.parseInt(sa[1]);
		char[][] a = new char[h][w];
		for (int i = 0; i < h; i++) {
			a[i] = br.readLine().toCharArray();
		}
		br.close();

		boolean[] r = new boolean[h];
		boolean[] c = new boolean[w];
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				if (a[i][j] == '#') {
					r[i] = true;
					c[j] = true;
				}
			}
		}

		char[][] ans = new char[h][w];
		for (int i = 0; i < h; i++) {
			Arrays.fill(ans[i], ' ');
		}
		int p = -1;
		for (int i = 0; i < h; i++) {
			if (r[i]) p++;
			int q = -1;
			for (int j = 0; j < w; j++) {
				if (c[j]) q++;
				if (r[i] && c[j]) {
					ans[p][q] = a[i][j];
				}
			}
		}

		for (int i = 0; i < h; i++) {
			if (ans[i][0] == ' ') {
				break;
			}
			for (int j = 0; j < w; j++) {
				if (ans[i][j] == ' ') {
					break;
				}
				System.out.print(ans[i][j]);
			}
			System.out.println();
		}
	}
}
