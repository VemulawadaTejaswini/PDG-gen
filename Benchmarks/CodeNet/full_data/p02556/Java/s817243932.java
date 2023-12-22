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
		long x, y;

		Node(String line) {
			String[] tokens = line.split(" ");
			x = Long.parseLong(tokens[0]);
			y = Long.parseLong(tokens[1]);
		}

		Node(long x, long y) {
			this.x = x;
			this.y = y;
		}

		long getDist(Node other) {
			return Math.abs(other.x - x) + Math.abs(other.y - y);
		}
	}

	int N;
	Node[] nodes;
	long[] x, y;
	long xMax, xMin, yMax, yMin;

	long getMaxDistance(long[] X, long[] Y) {
		Node[] nodes = new Node[N];
		for (int i = 0; i < N; ++i) {
			nodes[i] = new Node(X[i], Y[i]);
		}
		Arrays.sort(nodes, new Comparator<Node>() {
			@Override
			public int compare(Node o1, Node o2) {
				if (o1.x + o1.y != o2.x + o2.y) {
					return Long.compare(o1.x + o1.y, o2.x + o2.y);
				} else {
					return Long.compare(o1.x, o2.x);
				}
			}
		});

		return nodes[N - 1].getDist(nodes[0]);
	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		x = new long[N];
		y = new long[N];
		xMax = -1;
		yMax = -1;
		xMin = Long.MAX_VALUE / 2;
		yMin = Long.MAX_VALUE / 2;
		for (int i = 0; i < N; ++i) {
			String[] tokens = in.readLine().split(" ");
			x[i] = Long.parseLong(tokens[0]);
			y[i] = Long.parseLong(tokens[1]);
			xMin = Math.min(xMin, x[i]);
			xMax = Math.max(xMax, x[i]);
			yMin = Math.min(yMin, y[i]);
			yMax = Math.max(yMax, y[i]);
		}

		long maxDist = getMaxDistance(x, y);
		long[] invX = new long[N];
		for (int i = 0; i < N; ++i) {
			invX[i] = -1L * x[i] + xMax + 1L;
		}
		maxDist = Math.max(maxDist, getMaxDistance(invX, y));
		long[] invY = new long[N];
		for (int i = 0; i < N; ++i) {
			invY[i] = -1L * y[i] + yMax + 1L;
		}
		maxDist = Math.max(maxDist, getMaxDistance(x, invY));
		System.out.println(maxDist);
	}

	void calc() {
	}

	void showResult() {
	}
}