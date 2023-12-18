import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		int[][] edge = new int[n+1][n+1];
		for (int i = 0; i<n+1; i++) {
			Arrays.fill(edge[i], 0);
		}
		for (int i=0 ;i<n-1; i++) {
			String[] arr = sc.nextLine().split(" ");
			int u = Integer.parseInt(arr[0]);
			int v = Integer.parseInt(arr[1]);
			int w = Integer.parseInt(arr[2]);
			edge[u][v] = w;
			edge[v][u] = w;
		}
		sc.close();

		int[] res = new int[n+1];
		Arrays.fill(res, -1);
		LinkedList<Integer> stack = new LinkedList<Integer>();
		stack.add(1);
		res[1] = 0;
		while(! stack.isEmpty()) {
			int target = stack.pollFirst();
			for(int i = 1; i<n+1; i++) {
				if (edge[target][i] > 0 && res[i] == -1) {
					stack.push(i);
					//System.out.println(target + " : " + i);
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
		for(int i=1; i<n+1; i++) {
			System.out.println(res[i]);
		}
	}
}
