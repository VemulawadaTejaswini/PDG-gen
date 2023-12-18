import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final int MOD = 1000000007;
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		long k = parseLong(sc.next());
		int[] a = new int[n+1];
		for (i = 1; i <= n; i++) {
			a[i] = parseInt(sc.next());
		}
		sc.close();
		int[] b = new int[n+1];
		int[] c = new int[n+1];
		int apos=1;
		int bpos=1;
		int ans=0;
		for(;;) {
			if(c[apos]!=0) {
				ans=b[(int)((k-(c[apos]-1))%(bpos-c[apos]))+(c[apos]-1)];
				break;
			}
			b[bpos] = a[apos];
			if(bpos==k) {
				ans = b[bpos];
				break;
			}
			c[apos] = bpos;
			apos=a[apos];
			bpos++;
		}
//		out.println(Arrays.toString(b));
		out.println(ans);
	}
}
