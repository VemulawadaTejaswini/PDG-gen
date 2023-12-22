import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Node {
		int id;
		long height;
		int group = -1;
		Set<Integer> conns = new HashSet<>();

		Node(int id, long height) {
			this.id = id;
			this.height = height;
		}
	}

	int N, M;
	Node[] nodes;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		M = Integer.parseInt(tokens[1]);
		nodes = new Node[N];
		tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			long height = Long.parseLong(tokens[i]);
			nodes[i] = new Node(i, height);
		}
		for (int i = 0; i < M; ++i) {
			tokens = in.readLine().split(" ");
			int A = Integer.parseInt(tokens[0]) - 1;
			int B = Integer.parseInt(tokens[1]) - 1;
			nodes[A].conns.add(B);
			nodes[B].conns.add(A);
		}
	}

	boolean isGood(int nodeId) {
		boolean result = true;
		for (Integer i : nodes[nodeId].conns) {
			if (nodes[nodeId].height <= nodes[i].height) {
				result = false;
				break;
			}
		}
		return result;
	}

	long getMaxHeight(int current, int parent, int groupId) {
		long maxHeight = nodes[current].height;
		if (nodes[current].group >= 0) {
			return maxHeight;
		}
		nodes[current].group = groupId;
		for (Integer i : nodes[current].conns) {
			if (parent != i) {
				maxHeight = Math.max(maxHeight, getMaxHeight(i, current, groupId));
			}
		}
		return maxHeight;
	}

	void calc() {
		int count = 0;
		for (int i = 0; i < N; ++i) {
			if (isGood(i)) {
				++count;
			}
		}
		System.out.println(count);
	}

	void showResult() {
	}

}
