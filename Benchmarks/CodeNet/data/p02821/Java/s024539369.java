import java.util.*;

class Main {
	Scanner sc;
	int N, M;
	int[] A;
	long[] s;
	
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		A = new int[N+1];
		for (int i = 1; i <= N; i++) A[i] = sc.nextInt();
		Arrays.sort(A, 1, N+1);
		for (int i = 0; i < N/2; i++) {
			int tmp = A[i+1]; A[i+1] = A[N-i]; A[N-i] = tmp;
		}
		s = new long[N+1];
		s[0] = A[0];
		for (int i = 1; i <= N; i++) s[i] = s[i-1] + A[i];
		System.out.println(binSearch());
	}
	
	private long[] ansOfSum(int sum) {
		long ans = 0;
		long cnt = 0;
		
		int b = N;
		for (int a = 1; a <= N; a++) {
			while (A[a] + A[b] < sum && b > 0) b--;
			if (b == 0) break;
			ans += b*A[a] + s[b];
			cnt += b;
		}
		return new long[] { ans, cnt };
	}
	
	private long binSearch() {
		int l = 0;
		int r = 200000;
		long[] mv = null;
		
		while (l <= r) {
			int m = (l + r) >>> 1;
			mv = ansOfSum(m);
			
			if (mv[1] > M) l = m+1;
			else if (mv[1] < M) r = m-1;
			else {
				return mv[0];
			}
		}
		return mv[0] + (l-1)*(M-mv[1]);
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}