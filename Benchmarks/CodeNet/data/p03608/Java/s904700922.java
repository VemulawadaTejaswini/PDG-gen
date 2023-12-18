import java.util.*;

public class Main {
	static long dist[][];
	static int ans_len;
	static long r[];
	static String str[];
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int R = sc.nextInt();
		r = new long[R];
		
		int t = 1;
		for(int i = 0; i < R; i++) {
			r[i] = sc.nextInt() - 1;
			t *= (i + 1);
		}
		str = new String[t];
		
		int A[] = new int[M];
		int B[] = new int[M];
		int C[] = new int[M];
		dist = new long[N][N];
		for(int i = 0; i < N; i++) {
			Arrays.fill(dist[i], Long.MAX_VALUE / 2);
		}
		for(int i = 0; i < M; i++) {
			A[i] = sc.nextInt() - 1;
			B[i] = sc.nextInt() - 1;
			C[i] = sc.nextInt();
			dist[A[i]][B[i]] = C[i];
			dist[B[i]][A[i]] = C[i];
		}
		
		int perm[] = new int[R];
		boolean flag[] = new boolean[R];
		makePerm(0, perm, flag);
		String[][] str2 = new String[ans_len][R];
		for(int i = 0; i < ans_len; i++) {
			str2[i] = str[i].split(",", 0);
		}
		WarshallFloyd(N);
		long temp[] = new long[ans_len];
		Arrays.fill(temp, 0);
		long ans = Long.MAX_VALUE / 2;
		for(int a = 0; a < ans_len; a++) {
			for(int i = 0; i < R - 1; i++) {
				temp[a] += dist[Integer.parseInt(str2[a][i])][Integer.parseInt(str2[a][i + 1])];
			}
			ans = Math.min(ans, temp[a]);
		}
		System.out.println(ans);
	}
	
	static void WarshallFloyd(int N) {
		for(int k = 0; k < N; k++) {
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
				}
			}
		}
	}
	
	static void makePerm(int n, int perm[], boolean flag[]) {
		if(n == perm.length) {
			str[ans_len] = "";
			for(int i = 0; i < perm.length; i++) {
				str[ans_len] = str[ans_len] + r[perm[i]] + ",";
			}
			ans_len++;
		} else {
			for(int i = 0; i < perm.length; i++) {
				if(flag[i]) {
					continue;
				} else {
					perm[n] = i;
					flag[i] = true;
					makePerm(n + 1, perm, flag);
					flag[i] = false;
				}
			}
		}
	}
}
