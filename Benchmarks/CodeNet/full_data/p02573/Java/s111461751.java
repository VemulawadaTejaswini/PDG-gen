import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static int[] par;
	public static int[] rank;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in);) {
			int n = sc.nextInt();
			int m = sc.nextInt();

			par = new int[n];
			rank = new int[n];
			for (int i = 0; i < n; i++) {
				par[i] = i;
				rank[i] = 0;
			}

			for (int i = 0; i < m; i++) {
				int a = sc.nextInt() - 1;
				int b = sc.nextInt() - 1;
				unit(a, b);
			}
			for (int i = 0; i < n; i++) {
				find(i);
			}

			//			for(int i = 0; i < n ; i++) {
			//				System.out.println(par[i]);
			//			}

			Arrays.sort(par);
			int max_num = 1;
			int num = 1;
			for (int i = 1; i < n; i++) {
				if (par[i - 1] == par[i]) {
					num++;
				} else {
					max_num = Math.max(max_num, num);
					num = 1;
				}
			}
			max_num = Math.max(max_num, num);

			System.out.println(max_num);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static int find(int x) {
		if (par[x] == x) {
			return x;
		} else {
			return par[x] = find(par[x]);
		}
	}

	public static void unit(int x, int y) {
		x = find(x);
		y = find(y);
		if (x == y) {
			return;
		}
		if (rank[x] < rank[y]) {
			par[x] = y;
		} else {
			par[y] = x;
			if (rank[x] == rank[y]) {
				rank[x]++;
			}
		}
	}

}