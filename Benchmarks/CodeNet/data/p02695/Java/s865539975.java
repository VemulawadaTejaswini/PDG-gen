import java.util.Scanner;


public class Main {


//	final int MOD = 1000000007;

	public static int max = 0;

	public static void dfs(int ma[], int a[], int b[], int c[], int d[], int count, int get[], int n, int m, int q) {
		if(count >= n) {
			int tmp = 0;
			for(int i = 0; i < q; i++) {
				if(get[b[i] - 1] - get[a[i] - 1] == c[i]) {
					tmp += d[i];
				}
			}
			if(max < tmp) {
				max = tmp;
			}
			return;
		}

		for(int i = 1; i <= m; i++) {
			get[count] = i;
			int cnt = count + 1;
			dfs(ma, a, b, c, d, cnt, get, n, m, q);
		}

		return;
	}

	public static void main(String[] args) {

		int ans = 0;
		Scanner sc = new Scanner(System.in);
		boolean f = false;

		int n = sc.nextInt();
		int m = sc.nextInt();
		int q = sc.nextInt();

		int[] a = new int[q];
		int[] b = new int[q];
		int[] c = new int[q];
		int[] d = new int[q];
		int[] ma = new int[m];
		int[] get = new int[n];

		for (int i = 0; i < q; i++) {
			a[i]= sc.nextInt();
			b[i]= sc.nextInt();
			c[i]= sc.nextInt();
			d[i]= sc.nextInt();
		}

//		for(int i = 1; i <= m; i++) {
//			ma[i-1] = i;
//
//		}
		for(int i = 0; i < 0; i++) {
			get[i] = 0;

		}

		//-------------------------------------------------------------------------------------

		dfs(ma, a, b, c, d, 0, get, n, m, q);
		ans = max;
		//-------------------------------------------------------------------------------------

//		for(int i = 0; i < n; i++) {
//			System.out.println(ans[i]);
//		}

//		if(f) {
//			System.out.println("OK");
//		} else {
//			System.out.println("NG");
//		}

		System.out.println(ans);

		sc.close();
	}
}