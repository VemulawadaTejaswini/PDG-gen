import static java.lang.Math.*;
import static java.util.Arrays.*;

import java.util.*;
import java.io.*;

public class Main {

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int n = sc.nextInt();
			if( n == 0 ) break;
			int W = sc.nextInt(), H = sc.nextInt();
			
			int[][] table = new int[W+1][H+1];
			
			for(int i=0;i<n;i++) {
				int x = sc.nextInt(), y = sc.nextInt();
				table[x][y] = 1;
			}
			
			for(int i=1;i<=W;i++) for(int j=1;j<=H;j++) { 
				table[i][j] += table[i-1][j] + table[i][j-1] - table[i-1][j-1];
			}
			int w = sc.nextInt()-1, h = sc.nextInt()-1;
			int max = 0;
			for(int i=1;i<=W-w;i++) for(int j=1;j<=H-h;j++) {
				max = max(max, table[i+w][j+h] + table[i-1][j-1] - table[i+w][j-1] - table[i-1][j+h]);
			}
			System.out.println(max);
		}
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}

	public static void main(String[] args) {
		new Main().run();
	}
}