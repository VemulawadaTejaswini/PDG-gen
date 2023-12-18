import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int n = sc.nextInt();
		long[][] dist = new long[n][n];
		long[][] distWF = new long[n][n];
		int[][] edge = new int[n*(n-1)/2][3];
		long r = 0;
		for(int i = 0; i < n; i++){
		    for(int j = 0; j < n; j++){
		        dist[i][j] = sc.nextLong();
		        distWF[i][j] = dist[i][j];
		        r += dist[i][j];
		    }
		}
		
		// 計算
		long result = wf(distWF, r);
		if(!Arrays.deepEquals(dist, distWF)) result = -1;
		
		// 出力
		System.out.println(result);
		
	}
	
	static long wf(long[][] dist, long r) {
		int n = dist[0].length;
		long INF = 1001001001001001L;
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(dist[i][j] == 0) dist[i][j] = INF;
				if(i == j) dist[i][j] = 0;
			}
		}
		
		boolean[][] visited = new boolean[n][n];
		for(int k = 0; k < n; k++){
			for(int i = 0; i < n; i++){
				for(int j = 0; j < n; j++){
				    if(dist[i][j] >= dist[i][k] + dist[k][j]){
				        if(!visited[i][j] && i != k && j != k){
				            r -= dist[i][j];
				            visited[i][j] = true;
				            //System.out.println("r:" + r + " i:" + i + " k:" + k + " j:" + j + " d:" + dist[i][j]);
				        }
				        dist[i][j] = dist[i][k] + dist[k][j];
				    }
				}
			}
		}
		
		return r/2;
	}
}
