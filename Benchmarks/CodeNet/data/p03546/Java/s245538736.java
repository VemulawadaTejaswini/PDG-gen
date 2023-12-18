import java.util.Arrays;
import java.util.Scanner;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int[][] c = new int[10][10];
		int[][] A = new int[H][W];
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				c[i][j] = sc.nextInt();	
			}		
		}
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		/*	ワーシャル フロイド 
		 *	int[] dist = new int[n][n];
		 *	dist[i][j]は頂点i→頂点jの距離を入力しておく 
		 *	ただし、i,j間がつながっていないときはdist[i][j] = ∞
		 *
		 *	処理後、dist[i][j]はij間の最短経路となる
		 *
		 *	計算量 : O(V^3)
		 */

		for (int k = 0; k < 10; k++) {
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					c[i][j] = Math.min(c[i][j], c[i][k] + c[k][j]);
				}
			}
		}
		int sum = 0;
		for(int i = 0; i < H; i++) {
			for(int j = 0; j < W; j++) {
				if(A[i][j] == -1) continue;
				else sum += c[A[i][j]][1];
			}
		}
		System.out.println(sum);
		sc.close();
	}

	void debug(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}