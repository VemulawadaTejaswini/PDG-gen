import java.util.*;

class Main {
	Scanner sc;
	int N, D, A;
	int[][] M;
	int[] B;
	
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		D = sc.nextInt();
		A = sc.nextInt();
		M = new int[N+1][2];
		for (int i = 1; i <= N; i++) {
			M[i][0] = sc.nextInt();
			M[i][1] = (sc.nextInt()+A-1)/A;
		}
		M[0][0] = -1;
		M[0][1] = 0;
		Arrays.sort(M, Comparator.comparingInt(m -> m[0]));
		B = new int[N+1];
		int l = 0;
		long as = 0;
		long ans = 0;
		for (int i = 1; i <= N; i++) {
			as += B[i-1];
			while (M[l][0] + 2*D < M[i][0]) as -= B[l++];
			B[i] = (int)Math.max(0L, M[i][1] - as);
			ans += B[i];
		}
		
		System.out.println(ans);
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}
