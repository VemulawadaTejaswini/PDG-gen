import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		HashMap<Integer, HashMap<Integer, Integer>> edge = new HashMap();
		for (int i=0 ;i<n-1; i++) {
			String[] arr = sc.nextLine().split(" ");
			int u = Integer.parseInt(arr[0]);
			int v = Integer.parseInt(arr[1]);
			int w = Integer.parseInt(arr[2]);

			if (! edge.containsKey(u-1)) {
				edge.put(u-1, new HashMap<Integer, Integer>());
			}
			edge.get(u-1).put(v-1, w);
			if (! edge.containsKey(v-1)) {
				edge.put(v-1, new HashMap<Integer, Integer>());
			}
			edge.get(v-1).put(u-1, w);
		}
		sc.close();

		int[] res = new int[n];
		Arrays.fill(res, -1);
		LinkedList<Integer> stack = new LinkedList<Integer>();
		stack.push(0);
		res[0] = 0;

		while(! stack.isEmpty()) {
			int target = stack.pop();
			for(int key: edge.get(target).keySet()) {
				if (res[key] != -1) {
					continue;
				}
				stack.push(key);
				if (edge.get(target).get(key) % 2 == 0) {
					res[key] = res[target];
				} else {
					res[key] = res[target] == 0 ? 1 : 0;
				}
			}
		}
		for(int i=0; i<n; i++) {
			System.out.println(res[i]);
		}
	}
}
