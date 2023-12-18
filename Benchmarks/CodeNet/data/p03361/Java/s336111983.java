import java.util.*;
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt(), W = sc.nextInt(), no = H, i = 0, j = 0, k = 0;
		char[][] g = new char[H][W];
		boolean[][] c = new boolean[H][W];
		int[] row = {-1,1,0,0};
		int[] col = {0,0,-1,1};
		boolean ok = true;
		while (no-->0) {
			for (char ch : sc.next().toCharArray()) g[i][j++] = ch;
			i++; j=0;
		}
		for (i=0; i<H; i++) {
			for (j=0; j<W; j++) {
				if (g[i][j]=='#') {
					boolean canPaint=false;
					no=4; k=0; 
					while (no-->0) {
						if (i+row[k]>=0 && i+row[k]<H && j+col[k]>=0 && j+col[k]<W) {
							if (g[i+row[k]][j+col[k]]=='#'){
								c[i+row[k]][j+col[k]]=true; canPaint = true;
							}
						}
						k++;
					}
					if (canPaint) c[i][j]=true;
				}
			}
		}
		for (i=0; i<H; i++) for (j=0; j<W; j++) if (g[i][j]=='#' && !c[i][j]) ok=false;
		System.out.println(ok ? "Yes" : "No");
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}