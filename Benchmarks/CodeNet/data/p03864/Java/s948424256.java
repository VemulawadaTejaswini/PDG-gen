import java.util.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Long.*;
import static java.lang.System.*;
import static java.lang.Math.*;
import java.io.PrintWriter;

public class Main {
	public static long MAX = (long)2e12;
	public static void main(String[] args) {
		int i, j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		long x = parseLong(sc.next());
		long[] a = new long[n];
		for (i = 0; i < n; i++) {
			a[i] = parseLong(sc.next());
		}
		sc.close();
		long[] b = new long[n];
		for (i = 0; i < n-1; i++) {
			b[i] =  a[i] + a[i+1];
		}
		for (i = 0; i < n-1; i++) {
			b[i] =  a[i] + a[i+1];
		}
		long cnt=0;
		for (i = 0; i < n-1; i++) {
			long tmp = Math.max(b[i] - x,0);
			cnt+=tmp;
			if(i==n-2) break;
			b[i+1] = Math.max(b[i+1] - tmp,0);
		}
		out.println(cnt);
	}
}
