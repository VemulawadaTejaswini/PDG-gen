import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	final int MOD = 1000000007;

	void doIt() {
		int n = sc.nextInt();
		int e[][] = new int[n][n];
		for(int i = 0; i < n; i++) {
			Arrays.fill(e[i], -1);
		}
		for(int i = 1; i < n; i++) {
			int v = sc.nextInt() -1;
			int u = sc.nextInt() -1;
			int w = sc.nextInt();
			e[v][u] = w;
			e[u][v] = w;
		}
		int col[] = new int[n];
		Arrays.fill(col, -1);
		col[0] = 0;
		search(0, 0, e, n, col);
		for(int i = 0; i < n; i++) {
			System.out.println(col[i]);
		}
	}
	
	void search(int num, int idx, int e[][], int n ,int col[]) {
		for(int i = 0; i < n; i++) {
			if(e[idx][i] < 0) continue;
			else if(e[idx][i] % 2 == 0) {
				if(col[i] < 0) {
					col[i] = num;
					search(num, i, e, n, col);
				}
			}
			else {
				if(col[i] < 0) { 
					col[i] = num ^ 1;
					search(num, i, e, n, col);
				}
			}
		}
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
}
