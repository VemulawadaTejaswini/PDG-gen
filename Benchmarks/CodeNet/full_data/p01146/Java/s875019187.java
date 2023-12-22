import java.util.*;

public class Main{
	private static final int MAX = 1000000;

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			int N = sc.nextInt();
			int M = sc.nextInt();
			int L = sc.nextInt();
			int K = sc.nextInt();
			int A = sc.nextInt();
			int H = sc.nextInt();
			if(N == 0) break;

			boolean[] f = new boolean[N];
			f[A] = f[H] = true;
			for(int i=0;i<L;i++){
				f[sc.nextInt()] = true;
			}

			int[][] map = new int[N][N];
			for(int i=0;i<K;i++){
				int from = sc.nextInt();
				int to = sc.nextInt();
				int cost = sc.nextInt();
				map[from][to] = map[to][from] = cost;
			}

			floyd(map);

			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					if(!f[i] || !f[j] || map[i][j] > M){
						map[i][j] = MAX;
					}
				}
			}

			floyd(map);

			System.out.println(map[A][H]==MAX ? "Help!" : map[A][H]+Math.max(0,map[A][H]-M));
		}
	}

	private static void floyd(int[][] map){
		int n = map.length;

		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(map[i][j] == 0) map[i][j] = MAX;
			}
		}

		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if(i == j) continue;
					map[i][j] = Math.min(map[i][j],map[i][k]+map[k][j]);
				}
			}
    }
	}
}