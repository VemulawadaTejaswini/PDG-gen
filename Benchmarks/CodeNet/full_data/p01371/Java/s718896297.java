import java.util.*;
import static java.lang.System.*;

public class Main {

	/**
	 * @param args
	 */
	
	Scanner sc = new Scanner(in);
	int[][] t;
	boolean[] check;
	int n;
	int min, temp;
	
	void calc(int depth) {
		if (depth == n) {
			min = Math.min(min, temp);
		} else {
			for (int i = 0; i < n; i++) {
				if (!check[i]) {
					int m = t[i][0];
					for (int j = 1; j <= n; j++) {
						if (check[j-1])
							m = Math.min(m, t[i][j]);
					}
					temp += m;
					if (temp < min) {
						check[i] = true;
						calc(depth+1);
						check[i] = false;
					}
					temp -= m;
				}
			}
		}
	}
	
	void run() {
		while (true) {
			n = sc.nextInt();
			if (n == 0)
				break;
			check = new boolean[n];
			t = new int[n][n+1];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n+1; j++) {
					t[i][j] = sc.nextInt();
				}
			}
			min = Integer.MAX_VALUE;
			temp = 0;
			calc(0);
			out.println(min);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().run();
	}

}