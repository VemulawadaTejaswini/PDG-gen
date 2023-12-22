
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main {

	int INF = 1 << 28;
	//long INF = 1L << 62;
	double EPS = 1e-10;

	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt();
		
		int[][] t = new int[m][m], c = new int[m][m];
		
		for (int i=0;i<m;i++) {
			fill(t[i], INF);
			fill(c[i], INF);
			t[i][i] = c[i][i] = 0;
		}
		
		for (int i=0;i<n;i++) {
			int a = sc.nextInt()-1, b = sc.nextInt()-1, cost = sc.nextInt(), time = sc.nextInt();
			t[a][b] = t[b][a] = min(t[a][b], time);
			c[a][b] = c[b][a] = min(c[a][b], cost);
		}
		
		for (int k=0;k<m;k++) for (int i=0;i<m;i++) for (int j=0;j<m;j++) {
			t[i][j] = min(t[i][j], t[i][k] + t[k][j]);
			c[i][j] = min(c[i][j], c[i][k] + c[k][j]);
		}
		
		int k = sc.nextInt();
		
		for (int i=0;i<k;i++) {
			int p = sc.nextInt()-1, q = sc.nextInt()-1, r = sc.nextInt();
			System.out.println((r == 0 ? c[p][q] : t[p][q]));
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}