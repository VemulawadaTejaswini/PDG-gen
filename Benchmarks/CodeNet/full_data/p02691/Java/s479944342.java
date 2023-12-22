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
		int[] a = new int[n+1];
		for (i = 1; i <= n; i++) {
			a[i] = parseInt(sc.next());
		}
		sc.close();
//		out.println(Arrays.toString(a));
		int ans=0;
		for (i = 1; i < n; i++) {
			for (j = i+a[i]+1; j <= n; j++) {
				if(a[i]+a[j]==j-i) {
					ans++;
//					out.printf("%d,%d%n", i,j);
				}
			}
		}
		out.println(ans);
	}
}
