import java.util.*;
import static java.lang.Math.*;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int h = sc.nextInt();
		int w = sc.nextInt();
		int[][] c = new int[10][10];
		for(int i = 0; i < 10; i++){
		    for(int j = 0; j < 10; j++){
		        c[i][j] = sc.nextInt();
		    }
		}
		wf(c);
		int sum = 0;
		for(int i = 0; i < h; i++){
		    for(int j = 0; j < w; j++){
		        int a = sc.nextInt();
		        if(a > -1) sum += c[a][1];
		    }
		}
		
		// 計算
		int result = sum;
		
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

