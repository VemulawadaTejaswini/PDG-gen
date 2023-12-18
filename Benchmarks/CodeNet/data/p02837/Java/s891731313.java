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
		
		for (int i = 0; i < N; i++) {
			stmt[i] = saturate(0, 1<<i, i);
			if (stmt[i] != null) stmt[i][1] |= 1<<i;
		}
		int max = 0;
		int n = 1 << N;
		for (int b = 0; b < n; b++) {
			int stat0 = 0;
			int stat1 = 0;
			int i;
			for (i = 0; i < N; i++) {
				if ( (b&1<<i)==0 ) continue;
				if (stmt[i]==null) break;
				int[] s = saturate(stat0, stat1, i);
				if (s == null) break;
				stat0 |= s[0];
				stat1 |= s[1];
			}
			if (i == N) max = Math.max(max, Integer.bitCount(b));
		}
		System.out.println(max);
	}
	
	private int[] saturate(int stat0, int stat1, int i) {
		if (stmt[i] == null) return null;
		if ((stat0 & stmt[i][1]) > 0) return null;
		if ((stat1 & stmt[i][0]) > 0) return null;
		int s1 = stat1;
		stat0 |= stmt[i][0];
		stat1 |= stmt[i][1];
		int dif = s1^stat1;
		if (dif == 0) return new int[] {stat0, stat1};
		for (int j = 0; j < N; j++) {
			if ( ((1<<j)&dif) == 0) continue;
			if (saturate(stat0, stat1, j) == null) return null;
		}
		return new int[] {stat0, stat1};
	}
	
	public static void main(String[] args) {
		new Main().calc();
	}
}