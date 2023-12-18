import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class Main {
	Map<Integer, Long>[] tree;
	boolean[] result;

	Main(int N, List<String> lines) {
		this.tree = new Map[N];
		this.result = new boolean[N];
		Arrays.fill(this.result, true);
		for (int i = 0; i < N; ++i) {
			this.tree[i] = new HashMap<>();
		}
		for (String line : lines) {
			String[] tokens = line.split(" ");
			int u = Integer.parseInt(tokens[0]);
			int v = Integer.parseInt(tokens[1]);
			long w = Long.parseLong(tokens[2]);
			this.tree[u - 1].put(v - 1, w);
			this.tree[v - 1].put(u - 1, w);
		}
		calc(0);
	}

	void calc(int nodeIndex) {
		boolean color = result[nodeIndex];
		for (Integer key : this.tree[nodeIndex].keySet()) {
			long w = this.tree[nodeIndex].get(key);
			if (w % 2 == 0) {
				this.result[key] = color;
			} else {
				this.result[key] = !color;
			}
			this.tree[key].remove(nodeIndex);
			calc(key);
		}
	}

	void show() {
		for (int i = 0; i < result.length; ++i) {
			if (result[i]) {
				System.out.println("1");
			} else {
				System.out.println("0");
			}
		}
	}

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int N = Integer.parseInt(in.readLine());
		List<String> lines = new ArrayList<>(N);
		for (int i = 0; i < N - 1; ++i) {
			lines.add(in.readLine());
		}
		in.close();
		Main ins = new Main(N, lines);
		ins.show();
	}
}