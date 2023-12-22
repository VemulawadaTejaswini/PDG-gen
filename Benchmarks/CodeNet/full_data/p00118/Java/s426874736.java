import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		while(true) {
			int H = in.nextInt();
			int W = in.nextInt();
			if(H == 0) return;

			in.nextLine();

			String[] map = new String[H + 2];
			String str = "";
			for (int i = 0; i < W + 2; i++) {
				str += ".";
			}
			map[0] = str;
			map[H + 1] = str;

			for (int i = 1; i <= H; i++) {
				String s = in.nextLine();
				map[i] = "." + s + ".";
			}
			solve(H, W, map);
		}
	}

	public static void solve(int H, int W, String[] map) {
//		for(int i=0;i<H+2;i++) {
//			for(int j=0;j<W+2;j++) {
//				System.out.print(map[i].charAt(j));
//			}
//			System.out.println("");
//		}
		boolean visited[][] = new boolean[H+2][W+2];
		int ans = 0;
		for(int i=1;i<=H;i++) {
			for(int j=1;j<=W;j++) {
				if(!visited[i][j]) {
					dfs(visited, map, ""+map[i].charAt(j), i, j);
					ans++;
				}
			}
		}
		System.out.println(ans);
	}

	public static void dfs(boolean[][] visited, String[] map, String key, int h, int w) {
		visited[h][w] = true;
		int di[] = {0, 0, -1, +1};
		int dj[] = {+1, -1, 0, 0};
		for(int i=0;i<4;i++) {
			int ni = h + di[i];
			int nj = w + dj[i];
			if(visited[ni][nj] == false && (""+map[ni].charAt(nj)).equals(key)) {
				dfs(visited, map, key, ni, nj);
			}
		}
	}

}