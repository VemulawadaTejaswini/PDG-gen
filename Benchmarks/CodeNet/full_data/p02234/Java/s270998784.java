import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
	public void run() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(reader.readLine());
		int[] p = new int[n+1];
		StringTokenizer st;
		for (int i = 0; i < n-1; i++) {
			st = new StringTokenizer(reader.readLine());
			int p1 = Integer.parseInt(st.nextToken());
			p[i] = p1;
		}
		st = new StringTokenizer(reader.readLine());
		p[n-1] = Integer.parseInt(st.nextToken());
		p[n] = Integer.parseInt(st.nextToken());
		reader.close();
		System.out.println(mcm(p,n));
	}
	private int mcm(int[] p, int n) {
		int[][] m = new int[n+1][n+1];
		for (int s = 0; s < n; s++) {
			for (int i=1,j=s+2;j<=n;i++,j++) {
				m[i][j] = 1 << 30;
				for (int k = i; k < j; k++) {
					m[i][j]=Math.min(m[i][j], m[i][k]+m[k+1][j]+p[i-1]*p[k]*p[j]);
				}
			}
		}
		return m[1][n];
	}
}

