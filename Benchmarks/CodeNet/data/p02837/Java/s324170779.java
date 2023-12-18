import java.util.*;

class Main {
	Scanner sc;
	int N;
	int[][] stmt;
	
	private void calc() {
		sc = new Scanner(System.in);
		N = sc.nextInt();
		stmt = new int[N][2];
		
		for (int i = 0; i < N; i++) {
			int A = sc.nextInt();
			for (int j = 0; j < A; j++) {
				int x = 1 << (sc.nextInt()-1);
				int y = sc.nextInt();
				stmt[i][y] |= x;
			}
		}
		int max = 0;
		int n = 1 << N;
		for (int b = 0; b < n; b++) {
			int i = 0;
			for (; i < N; i++) {
				if ( (b&(1<<i))==0 ) continue;
				if ((stmt[i][1] & ~b) != 0) break;
				if ((stmt[i][0] & b) != 0) break;
			}
			if (i == N) max = Math.max(max, Integer.bitCount(b));
		}
		
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}