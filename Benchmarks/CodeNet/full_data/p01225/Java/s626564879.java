
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;
	
	int[] c, n;
	boolean[] used;
	void run() {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (;t>0;t--) {
			c = new int[9]; n = new int[9];
			for (int i=0;i<9;i++) n[i] = sc.nextInt();
			for (int i=0;i<9;i++) {
				char color = sc.next().charAt(0);
				c[i] = color == 'R' ? 0 : ( color == 'G' ? 1 : 2);
			}
			ok = new int[1<<9]; fill(ok, -1);
			System.out.println(solve(0));
		}
	}
	
	int[] ok;
	int solve(int S) {
		if (S == (1<<9)-1) return 1;
		if (ok[S] >= 0) return ok[S];
		
		int ret = 0;
		for (int i=0;i<9;i++) if (((S>>i)&1) == 0)
		for (int j=i+1;j<9;j++) if (((S>>j)&1) == 0) 
		for (int k=j+1;k<9;k++) if (((S>>k)&1) == 0)
			if (is_set(i, j, k)) {
				ret |= solve(S | (1<<i) | (1<<j) | (1<<k));
				if (ret == 1) return ok[S] = ret;
			}
		
		return ok[S] = ret;
	}
	
	boolean is_set(int i, int j, int k) {
		if (c[i] != c[j] || c[j] != c[k]) return false;
		if (n[i] == n[j] && n[j] == n[k]) return true;
		int[] a = {n[i], n[j], n[k]}; sort(a);
		return a[0] + 1 == a[1] && a[1] +1 == a[2];
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}