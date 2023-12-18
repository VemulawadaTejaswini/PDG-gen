
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long INF = 10000000000L;
		long g[][] = new long[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				g[i][j]=INF;
			}
		}
		for(int i=0; i<n-1; i++) {
			int a=sc.nextInt(); a--;
			int b=sc.nextInt(); b--;
			long c=sc.nextLong();
			g[a][b]=c;
		}

		long d[] = new long[n];
		boolean used[] = new boolean[n];
		int q = sc.nextInt();
		int k = sc.nextInt(); k--;
		for(int i=0; i<n; i++) {
			d[i]=INF;
		}
		d[k]=0;


		while(true){
			long minv = INF;
			int u = -1;
			for(int i=0; i<n; i++) {
				if(used[i]) continue;
				if(d[i] == INF) continue;
				if(d[i] < minv) {
					minv = d[i];
					u = i;
				}
			}
			if(u == -1) break;
			used[u]=true;
			for(int i=0; i<n; i++) {
				if(used[i]) continue;
				if(g[u][i] == INF)continue;
				if(d[i] > d[u] + g[u][i]) {
					d[i] = d[u] + g[u][i];
				}
			}
		}

		for(int i=0; i<q; i++) {
			int x = sc.nextInt(); x--;
			int y = sc.nextInt(); y--;
			System.out.println(d[x] + d[y]);
		}
		sc.close();
	}

}
