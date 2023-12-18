import java.util.*;
public class Main {
	static long dist[][];
	static long dist2[][];
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int L = sc.nextInt();
		int A[] = new int[M];
		int B[] = new int[M];
		int C[] = new int[M];
		dist = new long[N][N];
		dist2 = new long[N][N];
		for(int i = 0; i < N; i++) {
			Arrays.fill(dist[i], Long.MAX_VALUE / 2);
			Arrays.fill(dist2[i], Long.MAX_VALUE / 2);
		}
		for(int i = 0; i < M; i++) {
			A[i] = sc.nextInt() - 1;
			B[i] = sc.nextInt() - 1;
			C[i] = sc.nextInt();
			dist[A[i]][B[i]] = C[i];
			dist[B[i]][A[i]] = C[i];
			dist2[A[i]][B[i]] = 1;
			dist2[B[i]][A[i]] = 1;
		}
		
		WarshallFloyd(N, L);
		WarshallFloyd2(N);
		
		int Q = sc.nextInt();
		int s[] = new int[Q];
		int t[] = new int[Q];
		for(int i = 0; i < Q; i++) {
			s[i] = sc.nextInt() - 1;
			t[i] = sc.nextInt() - 1;
		}
		for(int i = 0; i < Q; i++) {
			System.out.println(dist2[s[i]][t[i]] > Long.MAX_VALUE / 3 ? -1 : dist2[s[i]][t[i]] - 1);
		}
	}
	
	static void WarshallFloyd(int N, int L) {
		for(int k = 0; k < N; k++) {
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
					if(dist[i][j] <= L) {
						dist2[i][j] = 1;
					}
				}
			}
		}
	}
	
	static void WarshallFloyd2(int N) {
		for(int k = 0; k < N; k++) {
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					dist2[i][j] = Math.min(dist2[i][j], dist2[i][k] + dist2[k][j]);
				}
			}
		}
	}
}
