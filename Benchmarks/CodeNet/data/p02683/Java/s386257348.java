import java.util.Scanner;


public class Main {


//	final int MOD = 1000000007;

	public static int min = 3000000;

	public static int[] a = {1, 2};

	public static void main(String[] args) {

		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();


		int[] c = new int[n];
		int[] tmp = new int[n];
		int[] xnum = new int[m];
		int[][] a = new int[n][m];
		for (int i = 0; i < n; i++) {
			c[i] = sc.nextInt();
			for(int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
				xnum[j] = 0;
			}
		}

//		String s = sc.next();

//		int[] ans = new int[n];

//		ArrayList<Integer> list = new ArrayList<>();


		//-------------------------------------------------------------------------------------

		dfs(n, m, x, xnum, c, a, 0, 0, tmp);
		ans = min;
		if(min == 3000000) {
			ans = -1;
		}
		//-------------------------------------------------------------------------------------

//		for(int i = 0; i < n; i++) {
//			System.out.println(ans[i]);
//		}

//		if(!f) {
//			System.out.println("Yes");
//		} else {
//			System.out.println("No");
//		}

		System.out.println(ans);

		sc.close();
	}

	public static void dfs(int n, int m, int x, int[] xnu, int[] c, int[][] a, int count, int maney, int[] index) {

		if(maney > min) {
			return;
		}

		int[] xnum = new int[m];
		for(int i = 0; i < m; i++) {
			xnum[i] = xnu[i];
		}
		if(count != 0) {
			for(int i = 0; i < m; i++) {
				xnum[i] += a[index[count-1]][i];
			}
		}

		boolean f = true;
		for(int i = 0; i < m; i++) {
//			System.err.print(xnum[i] + " ");
			if(xnum[i] < x) {
				f = false;
				break;
			}
		}
//		System.err.println(maney + " " + count);
		if(f) {

			if(min > maney) min = maney;
			return;
		}

		if(count >= n) {
			return;
		}

		for(int i = 0; i < n; i++) {

			boolean forf = true;
			for(int j = 0; j < count; j++) {
				if(index[j] == i) {
					forf = false;
					break;
				}
			}
			if(!forf) continue;


			index[count] = i;
			dfs(n, m, x, xnum, c, a, count + 1, maney + c[i], index);
		}

	}

}