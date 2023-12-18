import java.util.*;
import java.util.stream.Collectors;
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

	static class Tuple {
		int h, w;

		Tuple(int h, int w) {
			this.h = h;
			this.w = w;
		}
	}

	int H, W, D;
	int[][] A;
	int Q;
	int[] L, R;
	int[] distMat;
	Map<Integer, Tuple> map;

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		H = Integer.parseInt(tokens[0]);
		W = Integer.parseInt(tokens[1]);
		D = Integer.parseInt(tokens[2]);
		A = new int[H][W];
		for (int i = 0; i < H; ++i) {
			tokens = in.readLine().split(" ");
			for (int j = 0; j < W; ++j) {
				A[i][j] = Integer.parseInt(tokens[j]) - 1;
			}
		}
		Q = Integer.parseInt(in.readLine());
		L = new int[Q];
		R = new int[Q];
		for (int i = 0; i < Q; ++i) {
			tokens = in.readLine().split(" ");
			L[i] = Integer.parseInt(tokens[0]) - 1;
			R[i] = Integer.parseInt(tokens[1]) - 1;
		}
		map = new HashMap<>();
		for (int i = 0; i < H; ++i) {
			for (int j = 0; j < W; ++j) {
				Tuple tuple = new Tuple(i, j);
				map.put(A[i][j], tuple);
			}
		}

		distMat = new int[H * W];
		for (int i = 0; i < D; ++i) {
			int prev = i;
			int next = i + D;
			distMat[i] = 0;

			while (next < H * W) {
				Tuple prevTuple = map.get(prev);
				Tuple nextTuple = map.get(next);
				distMat[next] = distMat[prev] + Math.abs(nextTuple.h - prevTuple.h)
						+ Math.abs(nextTuple.w - prevTuple.w);
				prev = next;
				next += D;
			}
		}
	}

	void calc() {
		for (int i = 0; i < Q; ++i) {
			int cost = distMat[R[i]] - distMat[L[i]];
			System.out.println(cost);
		}

	}

	void showResult() {
	}
}