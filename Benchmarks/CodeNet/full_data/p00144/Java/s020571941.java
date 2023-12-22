
import java.util.*;
import java.lang.*;
import java.math.*;

public class Main {
	Scanner sc = new Scanner(System.in);

	void run() {
		int n = sc.nextInt() + 1;

		int[][] d = new int[n][n];
		for (int i = 0; i < n; i++) {
			Arrays.fill(d[i], Integer.MAX_VALUE >> 3);
		}
		for (int i = 1; i < n; i++) {
			int r = sc.nextInt();
			int k = sc.nextInt();
			for (int j = 0; j < k; j++) {
				int z= sc.nextInt();
				d[r][z] = 1;
			}
		}

		boolean end = false;
		for (; !end;) {
			end = true;
			for (int i = 1; i < n; i++) {
				for (int j = 1; j < n; j++) {
					for (int k = 1; k < n; k++) {
						if (d[i][j] > d[i][k] + d[k][j]) {
							d[i][j] = d[i][k] + d[k][j];
							end = false;
						}
					}
				}
			}
		}
		
		int p = sc.nextInt();
		for(int i = 0; i < p ; i++){
			int s = sc.nextInt();
			int g = sc.nextInt();
			int v = sc.nextInt();
			
			
			System.out.println(d[s][g] + 1 > v ? "NA":(d[s][g]+1)  );
		}
	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
}