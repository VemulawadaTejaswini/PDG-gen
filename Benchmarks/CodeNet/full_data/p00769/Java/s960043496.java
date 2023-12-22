import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		new Main().run();
	}

	void run() throws Exception {
		int n = sc.nextInt();
		for (int t = 0; t < n; t++) {
			char[] str = sc.next().toCharArray();
			Parser p = new Parser(str);
			System.out.println(p.parse().min());
		}
	}
}

class Node {
	List<Node> ns;

	Node() {
		ns = new ArrayList<Node>();
	}

	public void add(Node n) {
		ns.add(n);
	}

	public int min() {
		int[] is = new int[ns.size()];
		for (int i = 0; i < ns.size(); i++) {
			is[i] = ns.get(i).min();
		}
		Arrays.sort(is);
		int sum = 0;
		for (int i = 0; i < Math.ceil((1.0 * ns.size()) / 2); i++) {
			sum += is[i];
		}
		return sum;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (Node n : ns) {
			if (n instanceof Leaf) {
				n = (Leaf) n;
			}
			sb.append(n.toString());
		}
		sb.append("]");
		return sb.toString();
	}
}

class Leaf extends Node {
	int i;

	Leaf(int i) {
		this.i = i;
	}

	public int min() {
		return (i + 1) / 2;
	}

	public String toString() {
		return "Leaf(" + i + ")";
	}
}

class Parser {
	int pos;
	char str[];

	Parser(char[] str) {
		this.str = str;
		pos = 0;
	}

	public Node parse() throws Exception {
		if (str[pos] == '[') {
			pos++;
		} else {
			throw new Exception();
		}
		if (str[pos] == '[') {
			Node n = new Node();
			while (str[pos] != ']') {
				n.add(parse());
			}
			pos++;
			return n;
		} else {
			StringBuilder sb = new StringBuilder();
			while (str[pos] != ']') {
				sb.append(str[pos]);
				pos++;
			}
			pos++;
			int i = Integer.parseInt(sb.toString());
			return new Leaf(i);
		}
	}
}