
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
		for (;;) {
			int n = sc.nextInt();
			if ( n == 0) break;
			int[][] map = new int[10][10];
			for (int[] a: map) fill(a, INF);
			for (int i=0;i<10;i++) map[i][i] = 0;
			int max = 0;
			for (int i=0;i<n;i++) {
				int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
				map[a][b] = map[b][a] = min(map[a][b], c);
				max = max(max, max(a, b));
			}
			max++;
			for (int k=0;k<max;k++) for (int i=0;i<max;i++) for(int j=0;j<max;j++) 
				map[i][j] = min(map[i][j], map[i][k] + map[k][j]);
			
			int p = 0, c = INF;
			for (int i=0;i<max;i++) {
				int sum = 0;
				for (int j=0;j<max;j++) sum += map[i][j];
				if (c > sum) {
					p = i;
					c = sum;
				}
			}
			System.out.println(p + " " + c);
			
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}