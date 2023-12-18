import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static int M = 10;
	public static void main(String[] args) {
		int i,j,k;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		long h = parseLong(sc.next());
		long[] a = new long[n];
		long[] b = new long[n];
		for (i = 0; i < n; i++) {
			a[i] = parseLong(sc.next());
			b[i] = parseLong(sc.next());
		}
		sc.close();
		Arrays.parallelSort(a);
		Arrays.parallelSort(b);
		long cnt=0;
		for (i = n-1; i >= 0; i--) {
			if(b[i]<=a[n-1]) {
				break;
			}
			cnt++;
			h-=b[i];
			if(h<=0) {
				break;
			}
		}
		if(h>0) {
			cnt+=ceil((double)h/a[n-1]);
		}
		out.println(cnt);
	}
}
