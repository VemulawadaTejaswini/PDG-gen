import java.util.Scanner;

public class Main {
	
	static int N;
	static int M;
	static int X;
	
	static int[] C;
	static int[][] A;

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		N = stdIn.nextInt();
		M = stdIn.nextInt();
		X = stdIn.nextInt();
		
		C = new int[N];
		A = new int[N][M];
		
		int[] used = new int[N];
		
		for(int i = 0; i < N; i ++) {
			C[i] = stdIn.nextInt();
			for(int j = 0; j < M; j ++) {
				A[i][j] = stdIn.nextInt();
			}
			used[i] = 0;
		}
		
		int[] U = new int[M];
		for(int i = 0; i < M; i ++) {
			U[i] = 0;
		}
		
		System.out.println(dfs(U, 0, used));

	}
	
	public static int dfs(int[] U, int cost, int[] used) {
		if(judge(U)) {
			return cost;
		}else {
			if(sum(used) == N) {
				return -1;
			}else {
				int min = 1000000000;
				for(int i = 0; i < N; i ++) {
					if(used[i] == 0) {
						used[i] = 1;
						min = Math.min(min, dfs(add(A[i], U), cost + C[i], used));
						used[i] = 0;
					}
				}
				return min;
			}
		}
	}
	
	public static boolean judge(int[] U) {
		boolean j = true;
		for(int i = 0; i < M; i ++) {
			if(U[i] < X) {
				j = false;
				break;
			}
		}
		return j;
	}
	
	public static int[] add(int[] A, int[] U) {
		int[] dummyU = new int[M];
		for(int i = 0; i < M; i ++) {
			dummyU[i] = U[i];
		}
		for(int i = 0; i < M; i ++) {
			dummyU[i] += A[i];
		}
		return dummyU;
	}
	
	public static int sum(int[] used) {
		int s = 0;
		for(int i = 0; i < N; i ++) {
			s += used[i];
		}
		return s;
	}

}