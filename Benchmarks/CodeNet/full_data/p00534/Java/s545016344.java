import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();

		DoProb x = new DoProb(n, m);
		int r = x.result(0, 0);
		System.out.println(r);
		System.exit(0);
	}
}

class DoProb {
	private int town;
	private int day;
	private int[] nD;
	private int[] mW;
	private int[][] cost;

	DoProb(int n, int m) {
		town = n;
		day = m;
		nD = new int[n];
		mW = new int[m];
		cost = new int[n][m];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++)
				cost[i][j] = -1;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < n; i++)
			nD[i] = scan.nextInt();
		for (int i = 0; i < m; i++)
			mW[i] = scan.nextInt();

	}

	public int result(int start, int currday) {
		if (start >= town)
			return (0);

		if (cost[start][currday] > 0)
			return cost[start][currday];

		int r;
		int go = result(start + 1, currday + 1) + (nD[start] * mW[currday]);

		if (day - currday == town - start)
			r = go;
		else {
			int wait = result(start, currday + 1);
			if (wait < go)
				r = wait;
			else
				r = go;
		}
		
//		cost[start][currday] = r;
		return r;
	}

}