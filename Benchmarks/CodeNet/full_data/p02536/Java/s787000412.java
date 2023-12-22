import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	static class Node {
		int id;
		int group;
		Set<Integer> conns;

		Node(int id) {
			this.id = id;
			this.group = -1;
			this.conns = new HashSet<>();
		}
	}

	int N, M;
	Node[] nodes;

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		M = Integer.parseInt(tokens[1]);
		nodes = new Node[N];
		for (int i = 0; i < N; ++i) {
			nodes[i] = new Node(i);
		}
		for (int i = 0; i < M; ++i) {
			tokens = in.readLine().split(" ");
			int A = Integer.parseInt(tokens[0]) - 1;
			int B = Integer.parseInt(tokens[1]) - 1;
			nodes[A].conns.add(B);
			nodes[B].conns.add(A);
		}
	}

	void mark(int current, int group, int parent) {
		if (nodes[current].group >= 0) {
			return;
		}
		nodes[current].group = group;
		for (Integer next : nodes[current].conns) {
			if (!next.equals(parent)) {
				mark(next, group, current);
			}
		}
	}

	void calc() {
		int group = 0;
		for (int i = 0; i < N; ++i) {
			if (nodes[i].group < 0) {
				mark(i, group, -1);
				++group;
			}
		}
		System.out.println((group - 1));
	}

	void showResult() {
	}
}
