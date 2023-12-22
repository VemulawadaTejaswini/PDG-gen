import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			if (n == 0 && m == 0)
				break;
			int[] h = new int[n];
			int[] x = new int[(n+1)*(m+1)];
			int[] w = new int[m];
			int[] y = new int[(n+1)*(m+1)];
			for (int i = 0; i < n; i++)
				h[i] = sc.nextInt();
			for (int i = 0; i < m; i++)
				w[i] = sc.nextInt();
			int ny = 0;
			int p = 0;
			for(int i=0;i<n;i++){
				int nx = 0;
				x[p]=nx;
				y[p]=ny;
				p++;
				for(int j=0;j<m;j++){
					nx+=w[j];
					x[p] = nx;
					y[p] = ny;
					p++;
				}
				ny+=h[i];
			}
		}
	}
}