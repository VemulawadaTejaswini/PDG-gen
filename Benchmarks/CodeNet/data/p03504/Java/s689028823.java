
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	class P implements Comparable<P>{
		int s;
		int t;
		P(int s,int t){
			this.s=s;
			this.t=t;
		}
		@Override
		public int compareTo(P arg0) {
			return Integer.compare(this.t, arg0.t);
		}
	}
	public void run() {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int C=sc.nextInt();

		int MAXT=100000;
		int tl[][] = new int[C][MAXT+1];


		for(int i=0; i<N; i++) {
			int s=sc.nextInt();
			int t=sc.nextInt();
			int c=sc.nextInt();
			c--;
			tl[c][s]=1;
			tl[c][t+1]=-1;
		}

		for(int i=0; i<C; i++) {
			for(int j=1; j<=MAXT; j++) {
				tl[i][j] += tl[i][j-1];
			}

		}
		int sum[] = new int[MAXT+1];
		for(int i=0; i<C; i++) {
			for(int j=0 ;j<=MAXT; j++) {
				sum[j] += tl[i][j];
			}
		}

		long ans = 0;
		for(int i=0; i<=MAXT; i++) {
			ans = Math.max(ans, sum[i]);
		}
		System.out.println(ans);
		sc.close();
	}
}
