import java.util.*;
public class Main {
	
	static int dh[] = {-1, 0,1, 0};
	static int dw[] = {0, 1,0, -1};
	static char field[][];
	static int memo[][];
	static int H;
	static int W;
	static int max = Integer.MAX_VALUE;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		H = sc.nextInt();
		W = sc.nextInt();
		field= new char[H][W];
		for(int i=0;i<H;i++) {
			String tmp = sc.next();
			for(int j=0;j<W;j++) {
				field[i][j]=tmp.charAt(j);
			}	
		}
		sc.close();
		
		memo = new int[H][W];
		for(int t[]:memo) {
			Arrays.fill(t, max);
		}
		
		int ans = dfs(0,0,1, -1, -1);
		if(ans == max) {
			System.out.println(-1);
			return;
		}
		
		int wcnt = 0; 
		for(int i=0;i<H;i++) {
			for(int j=0;j<W;j++) {
				if(field[i][j]=='.') {
					wcnt ++;
				}
			}	
		}
		
		System.out.println(wcnt - ans);
		
	}
	
	static int dfs(int h, int w, int cnt, int bh, int bw) {
		if(field[h][w]=='#') return max;
		if(memo[h][w]<=cnt) return max; //すでに探索済みで、自分より短ければもう探索しない。
		memo[h][w]=cnt;
		if(h==H-1&&w==W-1) return cnt;
		int minD = max;
		for(int i=0;i<4;i++) {
			int nh = h + dh[i];
			int nw = w + dw[i];
			if(0<=nh&&nh<H&&0<=nw&&nw<W) {
				if(nh == bh && nw == bw)continue;
				minD = Math.min(minD, dfs(nh, nw, cnt+1, h, w));
			}
		}
		return minD;
	}
	
}

