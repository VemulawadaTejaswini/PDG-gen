import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}


	public void run() {
		Scanner sc = new Scanner(System.in);
		final long INF = 100000000000001L;
		int n = sc.nextInt();
		long d[][] = new long[n][n];

		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				d[i][j]=INF;
				if(i==j) {
					d[i][j]=0;
				}
			}
		}

		for(int i=0; i<n-1; i++) {
			int a=sc.nextInt(); a--;
			int b=sc.nextInt(); b--;
			long c=sc.nextLong();
			d[a][b]=c;
			d[b][a]=c;
		}

		for(int k=0; k<n; k++) {
			for(int i=0; i<n; i++) {
				if(d[i][k] == INF) continue;
				for(int j=0; j<n; j++) {
					if(d[k][j]==INF) continue;
					d[i][j] = Math.min(d[i][j], d[i][k]+d[k][j]);
				}
			}
		}

		int q = sc.nextInt();
		int k = sc.nextInt(); k--;

		for(int i=0; i<q; i++) {
			int x = sc.nextInt(); x--;
			int y = sc.nextInt(); y--;
			System.out.println(d[x][k] + d[k][y]);
		}

		sc.close();
	}

}
