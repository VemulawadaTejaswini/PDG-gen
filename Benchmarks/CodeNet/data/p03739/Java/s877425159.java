import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt(), t=n, i=0;
		long[] a = new long[n];
		long o = 0, s = 0;
		while (t-->0) a[i++] = sc.nextLong();
		for (i=0; i<n; i++) {
			long k=a[i];
			if (s+a[i]==0) a[i]=(-s<0) ? s+1 : 1-s;
			else if ((s<0 && s+a[i]<0)||(s>0 && s+a[i]>0)) a[i]=(s+a[i]<0) ? -s+1 : -s-1;
			o+=Math.abs(k-a[i]);
			s+=a[i];
		}
		System.out.println(o);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}