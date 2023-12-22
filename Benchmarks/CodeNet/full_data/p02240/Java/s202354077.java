import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] d = new int[n+1];
		Arrays.fill(d, -1);

		List<List<Integer>> con = new ArrayList<>();
		for (int i = 0; i <= n-1; i++) {
			con.add(new ArrayList<Integer>());
		}

		for (int i = 0; i < m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();

			con.get(v1).add(v2);
			con.get(v2).add(v1);
		}

		int q = sc.nextInt();
		for (int i = 0; i < q; i++) {
			int from = sc.nextInt();
			int to = sc.nextInt();
			if (dfs(con, d, from, to)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}


	}
	public static boolean dfs(List<List<Integer>> list, int[] d, int index, int ser) {
		boolean flg = false;
		List<Integer> l = list.get(index);
		d[index] = 1;
		for (int i = 0; i < l.size(); i++) {
			int num = l.get(i);
			if (d[num] != -1) {
				continue;
			}
			d[num] = 1;
			if (num == ser) {
				return true;
			}
			flg = dfs(list, d, num, ser);
		}
		return flg;


	}

}


