import java.util.*;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
	
	static int N;
	static int M;
	static int R;
	static int[] r;
	static int[] A;
	static int[] B;
	static int[] C;
	static int[][] d;
	static int INF = 2 << 28;
	
	static int dfs(int now, boolean[] visit, int cost) {
		boolean ok = true;
		for(int i = 0; i < visit.length; i++) {
			if(!visit[i]) ok = false;
		}
		if(ok) {
			return cost;
		}
		int ret = INF;
		for(int i = 0; i < visit.length; i++) {
			if(!visit[i]) {
				visit[i] = true;
				ret = Math.min(ret, dfs(r[i],visit,cost + d[now][r[i]]));
				visit[i] = false;
			}
		}
		return ret;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		N = sc.nextInt();
		M = sc.nextInt();
		R = sc.nextInt();
		r = new int[R];
		for(int i = 0; i < R; i++) {
			r[i] = sc.nextInt()-1;
		}
		A = new int[M];
		B = new int[M];
		C = new int[M];
		d = new int[N][N];
		
		for(int i = 0; i < M; i++) {
			A[i] = sc.nextInt()-1;
			B[i] = sc.nextInt()-1;
			C[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				d[i][j] = INF;
			}
		}
		for(int i = 0; i < M; i++) {
			d[A[i]][B[i]] = C[i];
			d[B[i]][A[i]] = C[i];
		}
		for(int k = 0; k < N; k++) {
			for(int i = 0; i < N; i++) {
				for(int j  = 0; j < N; j++) {
					d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
				}
			}
		}
		
		int ans = INF;
		
		for(int i = 0; i < R; i++) {
			boolean[] a = new boolean[R];
			a[i] = true;
			ans = Math.min(dfs(r[i],a,0),ans);
		}
		
		System.out.println(ans);
		
	}
}