package B;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	static final PrintStream out = System.out;
	static final Scanner sc = new Scanner(System.in);
	static final long Mod = 1000_000_007L;
	int N,M;

	public static void main(String[] args) {
		Main main = new Main();
		main.solve();
		System.exit(0);
	}

	void solve() {
		N = nextInt();
		long [][]LR = new long [N][3];
		long [][]l=new long[N][2],r=new long[N][2];
		for(int i=0;i<N;i++) {
			LR[i][0]=nextLong();
			LR[i][1]=nextLong();
			LR[i][2]=LR[i][1]-LR[i][0]+1;
			l[i][0] = LR[i][0];
			r[i][0] = LR[i][1];
			l[i][1] = i;
			r[i][1] = i;
		}
		Arrays.sort(l,(a1,a2)->Long.compare(a2[0],a1[0]));
		Arrays.sort(r,(a1,a2)->Long.compare(a1[0],a2[0]));

		long []onesum = new long[N];
		for(int i=0;i<N;i++) {
			out.println(l[i][0]+" "+r[i][0]);
			long L = l[0][0];
			long R = r[0][0];
			if(l[0][1]==i)L = l[1][0];
			if(r[0][1]==i)R = r[1][0];
			long abs = R-L+1;
			if(abs <= 0)abs = 0;
			onesum[i]=LR[i][2]+abs;
		}
		Arrays.sort(onesum);

		Arrays.sort(LR,(a1,a2)->MyComparator(a1[0],a2[0],a1[1],a2[1]));
		Arrays.sort(LR,(a1,a2)->absComp(a1[0],a2[0],a1[1],a2[1]));
		long L = LR[0][0];
		long R = LR[0][1];
		long Abs = R - L + 1;
		long []lrA = new long[N];
		lrA[0] = Abs;
		for(int i=1;i<N-1;i++) {
			L=Math.max(L,LR[i][0]);
			R=Math.min(R,LR[i][1]);
			long abs = R-L+1;
			if(abs <= 0)break;
			lrA[i] = abs;
		}
		long [] lrB = new long [N];
		L = LR[N-1][0];
		R = LR[N-1][1];
		for(int i=N-1;i>0;i--) {
			L=Math.max(L,LR[i][0]);
			R=Math.min(R,LR[i][1]);
			long abs = R-L+1;
			if(abs <= 0)break;
			lrB[i] = abs;
		}

		long max = onesum[N-1];
		for(int i=0;i<N-1;i++) {
			max = Math.max(max, lrA[i]+lrB[i+1]);
		}
		out.println(max);

	}


	private int absComp(long a1, long a2, long b1, long b2) {
		if(b1 - a1 < b2 - a2)return 1;
		if(b1 - a1 > b2 - a2)return -1;
		return 0;
	}

	private int MyComparator(long a1, long a2, long b1, long b2) {
		if(a1 > a2) return 1;
		else if(a1 < a2) return -1;
		if(b1 > b2) return 1;
		else if(b1 < b2) return -1;
		return 0;
	}


	public int[] nextIntArray(int n) {
		int[] a = new int[n];
		for (int i = 0; i < n; i++)a[i] = nextInt();
		return a;
	}
	public long[] nextLongArray(int n) {
		long[] a = new long[n];
		for (int i = 0; i < n; i++)a[i] = nextLong();
		return a;
	}
	public int nextInt() {
		return Integer.parseInt(next());
	}
	public long nextLong() {
		return Long.parseLong(next());
	}
	public String next() {
		return sc.next();
	}

	long gcd(long m,long n) {
		if (m<n) return gcd(n,m);
		if (n==0)return m;
		return gcd(n,m%n);
	}
}