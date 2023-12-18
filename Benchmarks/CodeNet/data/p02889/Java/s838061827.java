import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		long L = sc.nextLong();

		final long INF = (long)1e13;
		long[][] d = new long[N][N];
		for(int i=0; i<N; i++) {
			Arrays.fill(d[i], INF);
			d[i][i] = 0;
		}
		for(int i=0; i<M; i++) {
			int A = sc.nextInt()-1;
			int B = sc.nextInt()-1;
			long C = sc.nextLong();
			d[A][B] = d[B][A] = C;
		}
		
		for(int k=0; k<N; k++) {
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
				}
			}
		}
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(0<d[i][j] && d[i][j]<=L)
					d[i][j] = 1;
				if(d[i][j]!=d[j][i])
					return;
			}
		}
		for(int k=0; k<N; k++) {
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					d[i][j] = Math.min(d[i][j], d[i][k] + d[k][j]);
				}
			}
		}
		
		int Q = sc.nextInt();
		for(int i=0; i<Q; i++) {
			int s = sc.nextInt()-1;
			int t = sc.nextInt()-1;
			System.out.println(d[s][t]<INF ? d[s][t]-1 : -1);
		}
		
		sc.close();
	}
}

