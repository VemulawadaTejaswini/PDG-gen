
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Sample {

	public static void main(String[] args) throws IOException {

		Scanner in = new Scanner(System.in);

		int n = in.nextInt();
		int m = in.nextInt();
		int[] d = new int[n+1];

		List<List<Integer>> con = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			con.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < m; i++) {
			int v1 = in.nextInt();
			int v2 = in.nextInt();

			con.get(v1).add(v2);
			con.get(v2).add(v1);
		}

		int q = in.nextInt();
		for (int i = 0; i < q; i++) {
			Arrays.fill(d, -1);
			int from = in.nextInt();
			int to = in.nextInt();
			if (dfs2(con, d, from, to)) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}


	}

	public static boolean dfs2(List<List<Integer>> list, int[] d, int index, int target) {
		boolean flg = false;
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(index);

		while (!stack.isEmpty()) {
			int from = stack.pop();
			d[from] = 1;
			List<Integer> l = list.get(from);
			for (int i = 0; i < l.size(); i++) {
				int num = l.get(i);
				if (num == target) {
					flg = true;
					break;
				}
				if (d[num] == -1) {
					stack.push(num);
					break;
				}
			}
		}

		return flg;
	}

}


