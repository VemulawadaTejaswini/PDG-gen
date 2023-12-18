import java.io.*;
import java.util.*;

class Graph {
	public List<Node> nodes;
}

class Node {
	public int n;
	public List<Node> nodes;
	public Node(int name) {
		this.n = name;
		nodes = new ArrayList<>();
	}
}

class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int M = in.nextInt();

		List<Node> nodes = new ArrayList<Node>();
		for(int i=0;i<=N;i++) {
			nodes.add(new Node(i));
		}
		for(int i=0;i<M;i++) {
			int frm = in.nextInt();
			int to = in.nextInt();
			nodes.get(frm).nodes.add(nodes.get(to));
			nodes.get(to).nodes.add(nodes.get(frm));
		}

        List<Integer> ans = traverse(nodes);
		print(ans);
	}

	public static void print(List<Integer> ans) {
		System.out.println(ans.size());
		for(int i=0;i<ans.size();i++) {
			System.out.print(ans.get(i)+" ");
		}
		System.out.println("");
	}

	public static List<Integer> traverse(List<Node> nodes) {
		for(int i=1;i<nodes.size();i++) {
			List<Integer> ans = new ArrayList<>();
			int ret = trav(nodes, i, ans, new HashSet<Integer>());
			if(ret == 1) {
				return ans;
			}
		}
		return null;
	}

	public static int trav(List<Node> nodes, int i, List<Integer> ans, Set<Integer> aset) {
		Node node = nodes.get(i);
		ans.add(i);
		aset.add(i);
		for(int k=0;k<node.nodes.size();k++) {
			if (aset.contains(node.nodes.get(k).n) == false) { // 未訪問
				int ret = trav(nodes, node.nodes.get(k).n, ans, aset);
				if (ret == 1) {
					return 1;
				}
			}
			// check answer
			boolean ok = true;
			for (int l = 0; l < nodes.get(ans.get(0)).nodes.size(); l++) {
				if (!aset.contains(nodes.get(ans.get(0)).nodes.get(l).n)) {
					ok = false;
					break;
				}
			}
			boolean okr = true;
			for (int l = 0; l < nodes.get(ans.get(ans.size()-1)).nodes.size(); l++) {
				if (!aset.contains(nodes.get(ans.get(ans.size() -1)).nodes.get(l).n)) {
					okr = false;
					break;
				}
			}
			if (ok && okr) return 1;
		}
		ans.remove(ans.size()-1);
		aset.remove(i);
		return 0;
	}
}