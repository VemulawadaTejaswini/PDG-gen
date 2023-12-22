
import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


public class Main {
	
	public static int dfs(int cur, int bit, int count, int[] pos, int[][] adj, int[][] memo){
		//System.out.println(cur + " " + Integer.toBinaryString(bit));
		if(memo[cur][bit] >= 0){
			return memo[cur][bit];
		}
		
		//System.out.println(count);
		if(bit == (1 << count) - 1){
			return 0;
		}
		
		int min = Integer.MAX_VALUE / 400;
		for(int next = 0; next < count; next++){
			if((bit & (1 << next)) != 0){
				continue;
			}
			
			//System.out.println(pos[cur] + " " + pos[next] + " = " + adj[pos[cur]][pos[next]]);
			final int cost = adj[pos[cur]][pos[next]] + dfs(next, bit | (1 << next), count, pos, adj, memo);
			
			//System.out.println(cost);
			min = Math.min(min, cost);
		}
		
		return memo[cur][bit] = min;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int w = sc.nextInt();
			final int h = sc.nextInt();
			
			if(w == 0 && h == 0){
				break;
			}
			
			int count = 1;
			int[] pos = new int[11];
			
			boolean[][] is_block = new boolean[h][w];
			for(int i = 0; i < h; i++){
				char[] input = sc.next().toCharArray();
				
				for(int j = 0; j < w; j++){
					if(input[j] == 'x'){
						is_block[i][j] = true;
					}else if(input[j] == '*'){
						pos[count++] = i * w + j;
					}else if(input[j] == 'o'){
						pos[0] = i * w + j;
					}
				}
			}
			
			final int size = h * w;
			final int INF = Integer.MAX_VALUE / 400;
			int[][] adj = new int[size][size];
			for(int i = 0; i < size; i++){
				Arrays.fill(adj[i], INF);
			}
			
			for(int i = 0; i < h; i++){
				for(int j = 0; j < w; j++){
					if(i == j){
						adj[i * w + j][i * w + j] = 0;
						continue;
					}else if(is_block[i][j]){
						continue;
					}
					
					final int cur = i * w + j;
					if(i != 0 && !is_block[i-1][j]){
						adj[(i - 1) * w + j][cur] = 1;
						adj[cur][(i - 1) * w + j] = 1;
					}
					if(i != h - 1 && !is_block[i+1][j]){
						adj[(i + 1) * w + j][cur] = 1;
						adj[cur][(i + 1) * w + j] = 1;
					}
					if(j != 0 && !is_block[i][j-1]){
						adj[i * w + j - 1][cur] = 1;
						adj[cur][i * w + j - 1] = 1;
					}
					if(j != w - 1 && !is_block[i][j+1]){
						adj[i * w + j + 1][cur] = 1;
						adj[cur][i * w + j + 1] = 1;
					}
				}
			}
			/*
			for(int i = 0; i < size; i++){
				for(int j = 0; j < size; j++){
					System.out.print(adj[i][j] + " ");
				}
				System.out.println();
			}
			*/
			for(int k = 0; k < size; k++){
				for(int i = 0; i < size; i++){
					for(int j = 0; j < size; j++){
						adj[i][j] = Math.min(adj[i][j], adj[i][k] + adj[k][j]);
					}
				}
			}
			/*
			System.out.println("-------------------------------------------------------------------");
			for(int i = 0; i < size; i++){
				for(int j = 0; j < size; j++){
					System.out.print(adj[i][j] + " ");
				}
				System.out.println();
			}
			*/
			int[][] memo = new int[count][1 << count];
			for(int i = 0; i < count; i++){
				Arrays.fill(memo[i], -1);
			}
			final int cost = dfs(0, 1 << 0, count, pos, adj, memo);
			
			System.out.println(cost >= INF ? -1 : cost);
		}
		
	}

}