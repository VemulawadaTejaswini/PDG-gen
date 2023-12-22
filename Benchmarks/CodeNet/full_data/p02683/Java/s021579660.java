import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;
	final int MAX = Integer.MAX_VALUE;
	final long LMAX = Long.MAX_VALUE;
	int len = (int)1e6 + 1;
	
	void doIt() {
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int C[] = new int[N];
		int A[][] = new int[N][M];
		for(int i = 0; i < N; i++) {
			C[i] = sc.nextInt();
			for(int j = 0; j < M; j++) {
				A[i][j] = sc.nextInt();
			}
		}
		int min = MAX;
		for(int i = 1; i < (1 << N); i++) {
			int num[] = new int[M];
			int p = 0;
			for(int j = 0; j < N; j++) {
				if(((i >> j) & 1) == 1) {
					p += C[j];
					for(int k = 0; k < M; k++) {
						num[k] += A[j][k];
					}
				}
			}
			boolean ok = true;
			for(int j = 0; j < M; j++) {
				if(num[j] < X) {
					ok = false;
				}
			}
			if(ok) min = Math.min(min, p);
			
		}
		
		System.out.println((min == MAX)?-1:min);
	}
	
	public static void main(String[] args) {
		new Main().doIt();
	}

}
