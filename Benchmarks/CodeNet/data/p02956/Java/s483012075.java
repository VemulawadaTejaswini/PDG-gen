import java.util.*;

public class Main {
	Scanner sc;
	final int MOD = 998244353;
	int N;
	int[][] p;
	int[] pow2;
	
	int[] ylist;
	int ylistSize;
	
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
		ylist = new int[N];
		ylistSize = 0;
		
		Arrays.sort(p, (a,b) -> Integer.compare(a[1], b[1]));
		for (int i = 0; i < N; i++) p[i][1] = i;
		Arrays.sort(p, (a,b) -> Integer.compare(a[0], b[0]));
		for (int i = 0; i < N; i++) p[i][0] = i;
		
		int sum = (int) (((long)N-4)*(pow2[N]-1)%MOD);
		
		for (int i = 0; i < N; i++) {
			if (i == N/2) ylistSize = 0;
			boolean former = (i < N/2);
			int j = (former)?i:N-1+N/2-i;
			
			int yi = insertYPos(p[j][1]);
			int a1 = yi;
			int a2 = p[j][1] - a1;
			int a3 = (former)?p[j][0] - a1 : p[j][0] - a2;
			int a4 = N-1-p[j][1] - a3;
			
			int s = (pow2[a1] + pow2[a2])%MOD;
			s = (s + pow2[a3])%MOD;
			s = (s + pow2[a4])%MOD;
			sum = (sum + s)%MOD;
		}
		
		out(sum);
	}
	
	private int insertYPos(int y) {
		int yi = -1;
		int l = -1;
		int r = ylistSize;
		while (true) {
			yi = (l+r+2)/2-1;
			if (l == yi) break;
			if (ylist[yi] > y) r = yi;
			else l = yi;
		}
		if (yi < ylistSize) yi++;
		System.arraycopy(ylist, yi, ylist, yi+1, ylistSize - yi);
		ylist[yi] = y;
		ylistSize++;
		return yi;
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
