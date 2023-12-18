import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static final long MOD = 1000000007;
	public static void main(String[] args) {
		int i=0,j=0,k=0;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		long a = parseLong(sc.next());
		long b = parseLong(sc.next());
		long[] x = new long[n];
		for (i = 0; i < n; i++) {
			x[i] = parseLong(sc.next());
		}
		sc.close();
		long[] xd = new long[n-1];
		for (i = 0; i < n-1; i++) {
			xd[i] = x[i+1] - x[i];
		}
		long cnt=0;
		for (i = 0; i < n-1; i++) {
			cnt+=Math.min(xd[i]*a, b);
		}
		out.println(cnt);
	}
}
