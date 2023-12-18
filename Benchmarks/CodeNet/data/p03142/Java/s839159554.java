import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Node {
	int num;
	int parent = 0;
	int level = 0;
	List<Integer> childList = new ArrayList<Integer>();
}
public class Main {
	static List<Node> list = new ArrayList<Node>();

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		String[] split = line.trim().split("\\s+");
		int n = Integer.parseInt(split[0]);
		int m = Integer.parseInt(split[1]);
		for (int i = 1 ; i <= n ; i++) {
			Node node = new Node();
			node.num = i;
			list.add(node);
		}
		for (int i = 0 ; i < (n + m - 1) ; i++) {
			line = in.nextLine();
			split = line.trim().split("\\s+");
			int p = Integer.parseInt(split[0]);
			int c = Integer.parseInt(split[1]);
			list.get(p-1).childList.add(c);
			list.get(c-1).parent = -1;
		}
		in.close();

		Node rootNode = list.get(0);
		for (Node node : list) {
			if (node.parent == 0) {
				rootNode = node;
				break;
			}
		}

		retrieve(rootNode, 1);

		for (Node node : list) {
			System.out.println(node.parent);
		}
	}

	private static void retrieve(Node node, int level) {
		for (int i : node.childList) {
			Node child = list.get(i-1);
			if (child.level > level) break;
			child.parent = node.num;
			child.level = level;
			retrieve(child, level + 1);
		}
	}
}