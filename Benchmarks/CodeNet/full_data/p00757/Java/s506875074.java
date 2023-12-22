import java.util.BitSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
	public static int[][] cost;
	public static int allcost;
	public static int[][][][] dp;
	public static int[][][][] max;
	public static int[][][][] min;
	public static int h, w, s;
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		while(true){
			h = in.nextInt();
			w = in.nextInt();
			s = in.nextInt();
			if(h == 0) return;
			cost = new int[h][w];
			dp = new int[h][w][h][w];
			max = new int[h][w][h][w];
			min = new int[h][w][h][w];
			allcost = 0;
			for(int i=0; i<h; i++){
				for(int j=0; j<w; j++){
					cost[i][j] = in.nextInt();
					allcost += cost[i][j];
					dp[i][j][i][j] = cost[i][j];
					max[i][j][i][j] = 1;
				}
			}
			for(int i=0; i<h; i++){
				for(int j=0; j<w-1; j++){
					for(int k=j+1; k<w; k++){
						dp[i][j][i][k] = dp[i][j][i][k-1] + cost[i][k];
					}
				}
			}
			for(int i=0; i<h; i++){
				for(int j=0; j<w; j++){
					min[i][j][i][j] = s - allcost + cost[i][j];
					for(int k=j; k<w; k++){
						for(int l=i+1; l<h; l++){
							dp[i][j][l][k] = dp[i][j][l-1][k] + dp[l][j][l][k];
						}
					}
				}
			}
			dfs(0, 0, w-1, h-1);
			System.out.println(max[0][0][h-1][w-1]+" "+min[0][0][h-1][w-1]);
		}
	}
	
	public static int dfs(int x1, int y1, int x2, int y2){
		if(max[y1][x1][y2][x2] != 0) return min[y1][x1][y2][x2];
		if(s - allcost + dp[y1][x1][y2][x2] < 0){
			max[y1][x1][y2][x2] = -1;
			return -1;
		}
		int mincand = s;
		int maxcand = 0;
		for(int x=x1; x<x2; x++){
			int tmp = Math.min(dfs(x1, y1, x, y2), dfs(x+1, y1, x2, y2));
			if(tmp < 0) continue;
			if(maxcand == max[y1][x1][y2][x] + max[y1][x+1][y2][x2]){
				mincand = Math.max(mincand, tmp);
			}else if(maxcand < max[y1][x1][y2][x] + max[y1][x+1][y2][x2]){
				maxcand = max[y1][x1][y2][x] + max[y1][x+1][y2][x2];
				mincand = tmp;
			}
		}
		for(int y=y1; y<y2; y++){
			int tmp = Math.min(dfs(x1, y1, x2, y), dfs(x1, y+1, x2, y2));
			if(tmp < 0) continue;
			if(maxcand == max[y1][x1][y][x2] + max[y+1][x1][y2][x2]){
				mincand = Math.max(mincand, tmp);
			}else if(maxcand < max[y1][x1][y][x2] + max[y+1][x1][y2][x2]){
				maxcand = max[y1][x1][y][x2] + max[y+1][x1][y2][x2];
				mincand = tmp;
			}
		}
		if(maxcand == 0){
			maxcand = 1;
			mincand = s - allcost + dp[y1][x1][y2][x2];
		}
		max[y1][x1][y2][x2] = maxcand;
		return min[y1][x1][y2][x2] = mincand;
	}
	
	public static String dump(int[][] map, int h, int w){
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<h; i++){
			for(int j=0; j<w; j++){
				sb.append(map[i][j]+" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
}