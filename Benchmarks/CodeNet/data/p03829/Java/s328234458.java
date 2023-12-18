import java.util.*;
import java.text.DecimalFormat;
// warm-up
// Removed BigInteger. Dont think it will give a big hike in terms of speedup
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), A=sc.nextInt(), B=sc.nextInt(), t=n, i=0;
		double s = 0;
		int[] T = new int[n];
		long[] b = new long[n-1];
		long[] c = new long[n-1];
		while (t-->0) T[i++] = sc.nextInt();
		b[0] = c[0] = (T[1]-T[0])*A;
		for (i=1; i<n-1; i++) {
			b[i] = (T[i+1]-T[i])*A;
			c[i] = b[i]+c[i-1];
		}
		for (i=0; i<n-1; i++) {
			s+=(Math.min(B,b[i]));
			s = Math.min(c[i],s);
		}
		System.out.println(new DecimalFormat("#").format(s));
		sc.close();			
	}

	public static void main(String args[]) {
		solve();
	}

}