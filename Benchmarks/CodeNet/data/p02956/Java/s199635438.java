import java.util.*;

public class Main {
	Scanner sc;
	final int MOD = 998244353;
	int N;
	int[][] p;
	int[] pow2;
	
	int[] st;
	int M;
	
	public Main() {
		sc = new Scanner(System.in);
	}
	
	private void calc() {
		N = sc.nextInt();
		p = new int[N][2];
		for (int i = 0; i < N; i++) {
			p[i][0] = sc.nextInt();
			p[i][1] = sc.nextInt();
		}
		pow2 = new int[N+1];
		pow2[0] = 1;
		for (int i = 1; i < N+1; i++)
			pow2[i] = (pow2[i-1]*2)%MOD;
		M = 1 << (Integer.toBinaryString(N-1).length());
		st = new int[2*M-1];
		
		Arrays.sort(p, (a,b) -> Integer.compare(a[1], b[1]));
		for (int i = 0; i < N; i++) p[i][1] = i;
		Arrays.sort(p, (a,b) -> Integer.compare(a[0], b[0]));
		for (int i = 0; i < N; i++) p[i][0] = i;
		
		int sum = (int) (((long)N-4)*(pow2[N]-1)%MOD);
		
		for (int j = 0; j < N; j++) {
			int a1 = insertYPos(p[j][1]);
			int a2 = p[j][1] - a1;
			int a3 = p[j][0] - a1;
			int a4 = N-1-p[j][1] - a3;
			
			int s = (pow2[a1] + pow2[a2])%MOD;
			s = (s + pow2[a3])%MOD;
			s = (s + pow2[a4])%MOD;
			sum = (sum + s)%MOD;
		}
		
		out(sum);
	}
	
	private int insertYPos(int y) {
		int r = getSegmentSum(0, y, 0, 0, M);
		updateYPos(y);
		return r;
	}
	
	private void updateYPos(int y) {
		int i = M-1+y;
		while (true) {
			st[i]++;
			if (i == 0) break;
			i = (i-1) >>> 1;
		}
	}
	
	private int getSegmentSum(int s, int e, int n, int l, int r) {
		if (r <= s || e <= l) return 0;
		if (s <= l && r <= e) return st[n];
		int vl = getSegmentSum(s, e, 2*n + 1, l, (l+r)/2);
		int vr = getSegmentSum(s, e, 2*n + 2, (l+r)/2, r);
		return vl+vr;
	}
	
	private void out(Object o) {
		System.out.println(o);
		System.out.flush();
	}
	
	public static void main(String[] args) {
		Main m = new Main();
		m.calc();
	}

}