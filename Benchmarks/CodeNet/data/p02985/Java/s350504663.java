import java.util.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	static class Node {
		int id;
		Set<Integer> connNodes;

		Node(int id) {
			this.id = id;
			this.connNodes = new HashSet<>();
		}

	}

	static long MOD = 1000000007L;
	static int K;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		String[] tokens = in.readLine().split(" ");
		int N = Integer.parseInt(tokens[0]);
		K = Integer.parseInt(tokens[1]);
		Node[] nodes = new Node[N];
		for (int i = 0; i < N; ++i) {
			nodes[i] = new Node(i);
		}
		for (int i = 0; i + 1 < N; ++i) {
			tokens = in.readLine().split(" ");
			int a = Integer.parseInt(tokens[0]) - 1;
			int b = Integer.parseInt(tokens[1]) - 1;
			nodes[a].connNodes.add(b);
			nodes[b].connNodes.add(a);
		}

		for (Integer i : nodes[0].connNodes) {
			nodes[i].connNodes.remove(0);
		}
		long result = count(nodes, 0, 1, K);
		System.out.println(result);
		in.close();
	}

	static long count(Node[] nodes, int index, int depth, long result) {
		if (depth >= 2) {
			for (int i = 0; i < nodes[index].connNodes.size(); ++i) {
				result *= (long) (K - 2 - i);
				result %= MOD;
			}
		} else {
			for (int i = 0; i < nodes[index].connNodes.size(); ++i) {
				result *= (long) (K - 1 - i);
				result %= MOD;
			}
		}
		for (Integer i : nodes[index].connNodes) {
			nodes[i].connNodes.remove(index);
		}
		for (Integer i : nodes[index].connNodes) {
			result = count(nodes, i, depth + 1, result);
		}
		return result;
	}

}