import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] dist = new int[h*w][h*w];
		char[][] grid = new char[h][w];
		for(int i = 0; i < h; i++){
		    grid[i] = sc.next().toCharArray();
		    for(int j = 0; j < w; j++){
		        if(grid[i][j] == '#') continue;
		        int index = i*w + j;
		        int u = (i-1)*w + j;
		        int l = i*w + j-1;
		        if(i > 0 && grid[i-1][j] == '.'){
		            dist[index][u] = 1;
		            dist[u][index] = 1;
		        }
		        if(j > 0 && grid[i][j-1] == '.'){
		            dist[index][l] = 1;
		            dist[l][index] = 1;
		        }
		    }
		}
		
		// 計算
		int result = 0;
		wf(dist);
		for(int i = 0; i < h*w; i++){
		    for(int j = i+1; j < h*w; j++){
		        if(dist[i][j] == 1001001001) continue;
		        result = max(result, dist[i][j]);
		    }
		}
		
		// 出力
		System.out.println(result);
	}

	static void wf(int[][] dist) {
		int n = dist[0].length;
		int INF = 1001001001;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(dist[i][j] == 0) dist[i][j] = INF;
				if(i == j) dist[i][j] = 0;
			}
		}

		for(int k = 0; k < n; k++){
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
					dist[i][j] = min(dist[i][j], dist[i][k] + dist[k][j]);
				}
			}
		}
	}
}


