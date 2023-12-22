import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		for (;;) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}

			int[][] map = new int[n][n];

			int MAX = 100000;
			int r[] = new int[n];
			int c[] = new int[n];
			Arrays.fill(r, MAX);

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					map[i][j] = sc.nextInt();
					c[j] = Math.max(map[i][j], c[j]);
					r[i] = Math.min(map[i][j], r[i]);
				}
			}
/*			
			System.out.println(Arrays.toString(c));
			System.out.println(Arrays.toString(r));
	*/		boolean m2[][] = new boolean[n][n];
			
			int ans = 0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					m2[i][j] = (map[i][j]== c[j]&&map[i][j]== r[i]);
					if(m2[i][j]){
						ans = Math.max(ans, map[i][j]);
					}
				}
			}
			System.out.println(ans);
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}