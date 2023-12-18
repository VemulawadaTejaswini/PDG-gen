import java.util.*;
import static java.lang.Math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		// 入力
		int h = sc.nextInt();
		int w = sc.nextInt();
		int d = sc.nextInt();
		int[][] p = new int[h*w][2];
		for(int i = 0; i < h; i++){
		    for(int j = 0; j < w; j++){
		        int a = sc.nextInt() - 1;
		        p[a][0] = i;
		        p[a][1] = j;
		    }
		}
		int q = sc.nextInt();
		int[][] lr = new int[q][2];
		for(int i = 0; i < q; i++){
		    lr[i][0] = sc.nextInt()-1;
		    lr[i][1] = sc.nextInt()-1;
		}
		
		// 計算
		long result = 0;
		int[] dist = new int[h*w];
		for(int a = 0; a < h*w; a++){
		    if(a - d >= 0){
		        dist[a] = dist[a-d] + abs(p[a-d][0] - p[a][0]) + abs(p[a-d][1] - p[a][1]);
		    }
		}
		
		// 出力
		for(int i = 0; i < q; i++){
		    System.out.println(dist[lr[i][1]] - dist[lr[i][0]]);
		}
	}
}


