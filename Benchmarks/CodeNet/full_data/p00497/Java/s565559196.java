import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(), M = sc.nextInt();

		int[][] g = new int[N+1][];
		for (int i = 0 ; i <= N ; i++) {
			g[i] = new int[i+2];
		}

		for (int m = 0 ; m < M ; m++) {
			int a = sc.nextInt(),
				b = sc.nextInt(),
				x = sc.nextInt();
			g[a][b] = Math.max(g[a][b], x+1);
		}

		for (int x = 1 ; x <= N ; x++) {
			for (int y = 1 ; y <= x ; y++) {
				g[x][y] = Math.max(g[x][y], Math.max(g[x-1][y]-1, g[x-1][y-1]-1));
			}
		}

		long count = 0;
		for (int x = 0 ; x <= N ; x++) {
			for (int y = 0 ; y <= x ; y++) {
				if (g[x][y] > 0) count++;
				//System.out.print(g[x][y]);
			}
			//System.out.print("\n");
		}
		//System.out.print("\n");

		System.out.println(count);

	}

}