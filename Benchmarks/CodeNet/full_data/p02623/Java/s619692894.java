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
		long add = 0L;
		int i;
		for(i = 0; i < n; i++) {
			if(add + a[i] <= k) {
				add += a[i];
			}else {
				break;
			}
		}
		long ans = i;
		i -= 1;
		for(int j = 0; j < m; j++) {
			if(add + b[j] <= k) {
				add += b[j];
				ans = Math.max(ans, (i + 1) + (j + 1));
			}else {
				while(i >= 0) {
					add -= a[i];
					i -= 1;
					if(add + b[j] <= k) {
						ans = Math.max(ans, (i + 1) + (j + 1));
						break;
					}
				}
			}
		}
		System.out.println(ans);
	}
}