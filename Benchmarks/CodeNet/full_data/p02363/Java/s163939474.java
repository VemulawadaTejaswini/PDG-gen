import java.util.Scanner;

public class Main {
	static final int MAX = 100;
	static final long INF = (1L << 32);
	static int n;
	static long[][]d = new long[MAX][MAX];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		int q = scan.nextInt();
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i != j) d[i][j] = INF;
			}
		}
		for(int i = 0; i < q; i++) {
			int u = scan.nextInt();
			int v = scan.nextInt();
			int c = scan.nextInt();
			d[u][v] = c;
		}
		scan.close();
		warshallFloyd();
		boolean negative = false;
		for(int i = 0; i < n; i++){
			if(d[i][i] < 0) negative = true;
		}
		if(negative) {
			System.out.println("NEGATIVE CYCLE");
		}else {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(j == n - 1) {
						if(d[i][j] == INF) System.out.println("INF");
						else System.out.println(d[i][j]);
					}
					else {
						if(d[i][j] == INF) System.out.print("INF ");
						else System.out.print(d[i][j] + " ");
					}
				}
			}
		}
	}
	static void warshallFloyd() {
		for(int k = 0; k < n; k++) {
			for(int i = 0; i < n; i++) {
				if(d[i][k] == INF) continue;
				for(int j = 0; j < n; j++) {
					if(d[k][j] == INF) continue;
					d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
				}
			}
		}
	}
}
