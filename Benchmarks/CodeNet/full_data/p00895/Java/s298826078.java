import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static int[] DR = { 1, 1, 1, 0, -1, -1, -1, 0 };
	static int[] DC = { -1, 0, 1, 1, 1, 0, -1, -1 };

	public static void main(String[] args) {
		while (true) {
			int H = sc.nextInt();
			int W = sc.nextInt();
			if (H == 0) break;
			char[][] f = new char[H][];
			for (int i = 0; i < H; ++i) {
				f[i] = sc.next().toCharArray();
			}
			ArrayList<HashSet<String>> set = new ArrayList<HashSet<String>>();
			for (int i = 0; i <= H * W; ++i) {
				set.add(new HashSet<String>());
			}
			String ans = "";
			for (int i = 0; i < H; ++i) {
				for (int j = 0; j < W; ++j) {
					for (int k = 0; k < 8; ++k) {
						StringBuilder sb = new StringBuilder();
						sb.append(f[i][j]);
						int cr = i;
						int cc = j;
						boolean[][] visited = new boolean[H][W];
						visited[cr][cc] = true;
						while (true) {
							cr += DR[k];
							cc += DC[k];
							if (cr == -1) cr += H;
							if (cr == H) cr = 0;
							if (cc == -1) cc += W;
							if (cc == W) cc = 0;
							if (visited[cr][cc]) break;
							visited[cr][cc] = true;
							sb.append(f[cr][cc]);
							String str = sb.toString();
							if (str.length() > ans.length() || str.length() == ans.length() && str.compareTo(ans) < 0) {
								if (set.get(str.length()).contains(str)) {
									ans = str;
								} else {
									set.get(str.length()).add(str);
								}
							}
						}
					}
				}
			}
			System.out.println(ans.length() == 0 ? 0 : ans);
		}
	}
}