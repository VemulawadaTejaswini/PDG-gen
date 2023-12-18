import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力

		// スペース区切りの整数の入力
		int n = sc.nextInt();
		int m = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[m];
		for (int i = 0; i < m; i++) {
			a[i] = sc.nextInt();
		}

		int r = 0;
		if (n - x <= x) {
			for (int j = x; j < n; j++) {
				int add = 0;
				for (int k : a) {
					if (k == j) {
						add = 1;
						break;
					}
				}
				r = r + add;
			}
		} else {

			for (int j = x; j > 1; j--) {
				int add = 0;
				for (int k : a) {
					if (k == j) {
						add = 1;
						break;
					}
				}
				r = r + add;
			}
		}

		System.out.println(String.valueOf(r));
		// 出力
	}
}