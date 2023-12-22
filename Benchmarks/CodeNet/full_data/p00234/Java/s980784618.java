import java.util.Arrays;
import java.util.Scanner;

//Aizu Buried Treasure
public class Main{

	int w, h, f, m, o;
	int[][][] pre;
	int[][][] dp;
	int[][] map;

	int get(int height, int s, int j, int r){
		if(dp[s][j][r]!=1<<29)return dp[s][j][r];
		if(r==0)return dp[s][j][r] = 1<<29;
		int cost = 0;
		int nr = r-1;
		if((s&(1<<j))==0){
			if(map[height][j]<0){
				cost = -map[height][j];
			}
			else {
				nr = Math.min(r+map[height][j], m)-1;
			}
		}
		int min = 1<<29;
		int ns = s | 1<<j;
		if(j+1<w){
			int nc = cost + get(height, ns, j+1, nr);
			min = Math.min(min, nc);
		}
		if(j-1>=0){
			int nc = cost + get(height, ns, j-1, nr);
			min = Math.min(min, nc);
		}
		int nc = cost + pre[0][j][nr];
		min = Math.min(min, nc);
		return dp[s][j][r] = min;
	}

	void run(){
		Scanner sc = new Scanner(System.in);
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			if((w|h)==0)break;
			f = sc.nextInt();
			m = sc.nextInt();
			o = sc.nextInt();
			map = new int[h][w];
			for(int i=0;i<h;i++)for(int j=0;j<w;j++)map[i][j]=sc.nextInt();
			dp = new int[1<<w][w][m];
			for(int i=0;i<1<<w;i++){
				for(int j=0;j<w;j++){
					for(int k=0;k<m;k++){
						if(k==0){
							dp[i][j][k] = 1<<29;
							continue;
						}
						if(map[h-1][j]<0){
							dp[i][j][k] = -map[h-1][j];
						}
					}
				}
			}
			pre = dp;
			for(int i=h-2;i>=0;i--){
				dp = new int[1<<w][w][m];
				for(int a[][]:dp)for(int b[]:a)Arrays.fill(b, 1<<29);
				for(int s=0;s<1;s++)for(int j=0;j<w;j++)for(int k=0;k<m;k++)get(i, s, j, k);
				pre = dp;
			}
			int min = 1<<29;
			for(int j=0;j<w;j++)min = Math.min(min, pre[0][j][o-1]);
			System.out.println(f<min?"NA":min);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}