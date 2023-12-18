import java.util.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
		int m = sc.nextInt();
		boolean[][] edges = new boolean[n][n];
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt() - 1;
			int b = sc.nextInt() - 1;
			edges[a][b] = true;
			edges[b][a] = true;
		}

		// Generate all permutations by queue
		List<List<Integer>> permutations = new ArrayList<List<Integer>>();
		Queue<List<Integer>> queue = new LinkedList<List<Integer>>();
		queue.add(new ArrayList<Integer>());

		int[] nodes = new int[n];
		for (int i = 0; i < n; i++) {
			nodes[i] = i;
		}

		while (queue.size() > 0) {
			List<Integer> perm = queue.poll();
			for (int i = 0; i < nodes.length; i++) {
				if (!perm.contains(nodes[i])) {
					// Deep copy the perm
					List<Integer> nPerm = new ArrayList<Integer>();
					for (int j = 0; j < perm.size(); j++) {
						nPerm.add(perm.get(j));
					}

					nPerm.add(nodes[i]);
					if (nPerm.size() == nodes.length) {
						permutations.add(nPerm);
					} else {
						queue.add(nPerm);
					}
				}
			}
		}

		int cnt = 0;
		for (int i = 0; i < permutations.size(); i++) {
			List<Integer> perm = permutations.get(i);
			if (perm.get(0) != 0) {
				continue;
			}
			boolean oneStroke = true;
			for (int j = 0; j < perm.size() - 1; j++) {
				int nodeA = perm.get(j);
				int nodeB = perm.get(j + 1);
				if (!edges[nodeA][nodeB]) {
					oneStroke = false;
					break;
				}
			}
			if (oneStroke) {
				cnt++;
			}
		}

		out.println(cnt);
	}
}
