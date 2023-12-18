import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static final long INF = 2000000000000l;


	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		long L = scn.nextLong();

		long[][] d = new long[N][N];
		for(int i = 0;i < N;i++) {
			Arrays.fill(d[i], INF);
		}
		for(int i = 0;i < M;i++) {
			int A = scn.nextInt()-1, B = scn.nextInt()-1;
			long C = scn.nextLong();
			if(C <= L) {
				d[A][B] = C;
				d[B][A] = C;
			}
		}

		warshall_floyd(d);

		for(int i = 0;i < N;i++) {
			for(int j = 0;j < N;j++) {
				if(d[i][j] <=L) {
					d[i][j] = (d[i][j]==0)?0:1;
				}else {
					d[i][j] = INF;
				}
			}
		}
		warshall_floyd(d);


		int Q = scn.nextInt();
		for(int i = 0;i < Q;i++) {
			int s = scn.nextInt()-1, t = scn.nextInt()-1;
			System.out.println((d[s][t]<INF)?d[s][t]-1:-1);
		}
	}

	public static void warshall_floyd(long[][] d) {//@param d[][]:最初の経路のコスト情報
		int V = d.length;
		for(int i = 0;i < V;i++) {
			d[i][i] = 0;
		}
		for(int k = 0;k < V;k++) {
			for(int i = 0;i < V;i++) {
				for(int j = 0;j < V;j++) {
					if(d[i][k]<INF && d[k][j]<INF)
					d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
				}
			}
		}
	}
}
