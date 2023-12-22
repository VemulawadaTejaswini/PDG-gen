import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		long[] a = new long[n];
		for ( int i=0; i<n; i++ ) {
			a[i] = sc.nextLong();
		}
		Arrays.sort(a);

		LinkedList<Long> ll = new LinkedList<Long>();
		ll.add(a[n-1]);

		long[] dp = new long[n];
		Arrays.fill(dp, -1L);
		dp[n-1] = 0;

		for ( int i=n-2; i>=0; i-- ) {
			int m = getFvalue(ll, dp, i);
			ll.add(m, a[i]);
		}

		System.out.println(dp[0]);
	}

	private static int getFvalue(LinkedList<Long> lst, long[] dp, int pos) {
		int sz = lst.size();
		int m = -1;
		long v = 0;
		for ( int i=0; i<sz; i++ ) {
			long v1 = Math.min(lst.get(i), lst.get((i+1)%sz));
			if ( v1>v ) {
				v = v1;
				m = i;
			}
		}
		dp[pos] = dp[pos+1] + v;
		return m;
	}
}
