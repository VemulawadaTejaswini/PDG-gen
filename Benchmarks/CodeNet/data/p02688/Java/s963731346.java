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
		int k = parseInt(sc.next());
		int[] d = new int[k];
		int[][] a = new int[k][];
		boolean[] f = new boolean[n];
		for (i = 0; i < k; i++) {
			d[i] = parseInt(sc.next());
			a[i] = new int[d[i]];
			for (j = 0; j < d[i]; j++) {
				a[i][j] = parseInt(sc.next());
				f[j] = true;
			}
		}
		sc.close();
		int cnt=0;
		for (i = 0; i < f.length; i++) {
			if(!f[i])cnt++;
		}
		out.println(cnt);
	}
}
