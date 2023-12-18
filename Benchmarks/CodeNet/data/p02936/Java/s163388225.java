import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int Q = sc.nextInt();

		//int[] P = new int[Q];
		//int[] X = new int[Q];
		Map<Integer, ArrayList<Integer>> tree = new HashMap<>();
		for (int i = 0; i < N-1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			ArrayList<Integer> array;
			if (tree.containsKey(a)) {
				array = tree.get(a);
			} else {
				array = new ArrayList<>();
			}
			array.add(b);
			tree.put(a,  array);
		}
		int[] value = new int[N+1];
		Arrays.fill(value, 0);
		for (int i = 0; i < Q; i++) {
			int p = sc.nextInt();
			int x = sc.nextInt();
			value[p] += x;
			solve(tree, p ,x, value);
		}
		for (int i = 1; i < N; i++) {
			System.out.print(value[i] + " ");
		}
		System.out.println(value[N]);
	}

	static void solve(Map<Integer, ArrayList<Integer>> tree, int p, int x, int[] value) {

		if (!tree.containsKey(p))
			return;

		ArrayList<Integer> leafs = tree.get(p);
		for (int i = 0; i < leafs.size(); i++) {
			value[leafs.get(i)] += x;
			if (tree.containsKey(leafs.get(i)))
				solve(tree, leafs.get(i), x, value);
		}
	}

}