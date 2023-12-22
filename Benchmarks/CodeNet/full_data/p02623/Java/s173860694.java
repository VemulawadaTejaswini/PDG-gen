import java.util.*;
import java.math.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int k = in.nextInt();
		long[] a = new long[n];
		long[] b = new long[m];
		for(int i = 0; i < n; i++) {
			a[i] = in.nextLong();
		}
		for(int i = 0; i < m; i++) {
			b[i] = in.nextLong();
		}
		int nn = 0;
		int mm = 0;
		int ans = 0;
		while((nn >= 0) || (mm >= 0)) {
			long aa = (nn < n) ? a[nn] : Long.MAX_VALUE;
			long bb = (mm < m) ? b[mm] : Long.MAX_VALUE;
			if(aa <= bb) {
				if(aa <= k) {
					ans += 1;
					k -= aa;
					nn += 1;
				}else {
					break;
				}
			}else {
				if(bb <= k) {
					ans += 1;
					k -= bb;
					mm += 1;
				}else {
					break;
				}
			}
		}
		System.out.println(ans);
	}
}