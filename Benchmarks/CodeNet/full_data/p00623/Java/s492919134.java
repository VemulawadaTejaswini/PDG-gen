import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static int[] leaf;

	public static void main(String[] args) throws Exception {
		while (true) {
			String tree = sc.nextLine();
			if (tree.equals("END")) break;
			int N = sc.nextInt();
			leaf = new int[N];
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < 4; ++j) {
					leaf[i] += (sc.nextInt() << j);
				}
			}
			sc.nextLine();
			Node root = new Parser(tree).parse();
			root.process();
			System.out.println(root.count[0xF]);
		}
	}

	static class Parser {
		String val;
		int pos = 0;

		Parser(String tree) {
			this.val = tree;
		}

		Node parse() {
			Node ret = new Node();
			++pos;
			if (val.charAt(pos) == '(') {
				ret.left = parse();
			} else {
				int index = parseInt();
				ret.left = new Node();
				ret.left.count[leaf[index - 1]] = 1;
			}
			++pos;
			if (val.charAt(pos) == '(') {
				ret.right = parse();
			} else {
				int index = parseInt();
				ret.right = new Node();
				ret.right.count[leaf[index - 1]] = 1;
			}
			++pos;
			return ret;
		}

		int parseInt() {
			int ret = 0;
			while ('0' <= val.charAt(pos) && val.charAt(pos) <= '9') {
				ret *= 10;
				ret += val.charAt(pos) - '0';
				++pos;
			}
			return ret;
		}

	}

	static class Node {
		Node left;
		Node right;
		int[] count = new int[16];

		void process() {
			if (left == null) return;
			left.process();
			right.process();
			for (int i = 0; i < 16; ++i) {
				for (int j = 0; j < 16; ++j) {
					count[i & j] += left.count[i] * right.count[j];
					count[i | j] += left.count[i] * right.count[j];
					count[i ^ j] += left.count[i] * right.count[j];
				}
			}
		}
	}

}