import java.util.Scanner;

public class Main {
	
	static int h;
	static int w;
	static int cnt = 0;
	static char[][] g;
	static boolean[][] v;
	static boolean wbool;
	static boolean bbool;
	
	static void dfs(int i, int j) {
		if(v[i][j]) return;
		if(g[i][j] == 'W') {
			wbool = true;
			return;
		}
		if(g[i][j] == 'B') {
			bbool = true;
			return;
		}
		if(g[i][j] != '.') return;
		v[i][j] = true;
		cnt++;
		if(i > 0) dfs(i-1, j);
		if(i < h-1) dfs(i+1, j);
		if(j > 0) dfs(i, j-1);
		if(j < w-1) dfs(i, j+1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			w = sc.nextInt();
			h = sc.nextInt();
			if(w + h == 0) break;
			g = new char[h+1][w+1];
			v = new boolean[h+1][w+1];
			for(int i = 0; i < h; i++) {
				g[i] = sc.next().toCharArray();
			}
			
			int hcnt = 0;
			int bcnt = 0;
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					if(g[i][j] == '.' && v[i][j] == false) {
						wbool =false;
						bbool = false;
						cnt = 0;
						dfs(i, j);
						if(wbool && !bbool) {
							hcnt += cnt;
						}
						if(bbool && !wbool) {
							bcnt += cnt;
						}
					}
				}
			}
			System.out.println(bcnt + " " + hcnt);
		}

	}

}

