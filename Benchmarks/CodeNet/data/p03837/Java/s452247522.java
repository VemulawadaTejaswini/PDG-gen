import java.util.*;
public class Main {
	static long dist[][];
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int a[] = new int[M];
		int b[] = new int[M];
		int c[] = new int[M];
		
		dist = new long[N][N];
		for(int i = 0; i < N; i++) {
			Arrays.fill(dist[i], Integer.MAX_VALUE);
		}
		
		for(int i = 0; i < M; i++) {
			a[i] = sc.nextInt() - 1;
			b[i] = sc.nextInt() - 1;
			c[i] = sc.nextInt();
			dist[a[i]][b[i]] = c[i];
			dist[b[i]][a[i]] = c[i];
		}
		
		WarshallFloyd(N);
		int ans = M;
		for(int i = 0; i < M; i++) {
			boolean shortest = false;
			for(int j = 0; j < N; j++) {
				for(int k = 0; k < N; k++) {
					if(j == k) continue;
					if(dist[j][a[i]] + c[i] + dist[k][b[i]] == dist[j][k]) {
						shortest = true;
					}
				}
			}
			if(shortest) ans--;
		}
		
		System.out.println(ans);
	}
	
	static void WarshallFloyd(int N) {
		for(int k = 0; k < N; k++) {
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(i == j) {
						dist[i][j] = 0;
					} else {
						dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
					}
				}
			}
		}
	}
}
