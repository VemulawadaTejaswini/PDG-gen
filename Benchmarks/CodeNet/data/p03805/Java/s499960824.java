import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();//tyouten
		int m = sc.nextInt();//hen
		List<List<Integer>> path = new ArrayList<>(n);
		for (int i = 0; i < n; i++) {
			path.add(new ArrayList<Integer>(n));
		}
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			path.get(a).add(b);
			path.get(b).add(a);
		}
		int cnt = 0;
		int bitMax = (int) Math.pow(2, n) - 1;
		Deque<int[]> check = new ArrayDeque<int[]>();
		int[] start = { 1, 0 };//bit,genzaiti-1
		check.addLast(start);
		while (!check.isEmpty()) {
			int[] tmp = check.removeFirst();
			int bit = tmp[0];
			int node = tmp[1];
	//		System.out.println(bit+","+node);
			for (int next : path.get(node)) {
//				System.out.println("next"+next);
//				System.out.println((1 << next) & bit);
				if (((1 << next) & bit) == 0) {
					if (bit + (1 << next) == bitMax) {
						cnt++;
					} else {
						int[] nextnode = { bit + (1 << next), next };
						check.addLast(nextnode);
					}
				}
			}
		}
		System.out.println(cnt);
	}
}
