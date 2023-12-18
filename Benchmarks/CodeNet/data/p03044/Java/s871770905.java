import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[][] edge = new int[n][n];
		for (int i = 0; i<n; i++) {
			Arrays.fill(edge[i], 0);
		}
		for (int i=0 ;i<n-1; i++) {
			String[] arr = sc.nextLine().split(" ");
			int u = Integer.parseInt(arr[0]);
			int v = Integer.parseInt(arr[1]);
			int w = Integer.parseInt(arr[2]);
			edge[u-1][v-1] = w;
			edge[v-1][u-1] = w;
		}
		sc.close();

		int[] res = new int[n];
		Arrays.fill(res, -1);
		LinkedList<Integer> stack = new LinkedList<Integer>();
		stack.push(0);
		res[0] = 0;

		while(! stack.isEmpty()) {
			int target = stack.pop();
			for(int i = 0; i<n; i++) {
				if (edge[target][i] > 0) {
					if (res[i] != -1) {
						continue;
					}
					stack.push(i);
					if (edge[target][i] % 2 == 0) {
						// 偶数なので同じグループ
						res[i] = res[target];
					} else {
						// 奇数なので別グループ
						res[i] = res[target] == 0 ? 1 : 0;
					}
				}
			}
		}
		for(int i=0; i<n; i++) {
			System.out.println(res[i]);
		}
	}
}