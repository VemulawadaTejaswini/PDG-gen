import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N, M, R;
	int[] r, A, B, C;
	long[][] distMat;

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
		R = Integer.parseInt(tokens[2]);
		r = new int[R];
		tokens = in.readLine().split(" ");
		for (int i = 0; i < R; ++i) {
			r[i] = Integer.parseInt(tokens[i]) - 1;
		}
		A = new int[M];
		B = new int[M];
		C = new int[M];
		for (int i = 0; i < M; ++i) {
			tokens = in.readLine().split(" ");
			A[i] = Integer.parseInt(tokens[0]) - 1;
			B[i] = Integer.parseInt(tokens[1]) - 1;
			C[i] = Integer.parseInt(tokens[2]);
		}
		distMat = new long[N][N];
		for (int i = 0; i < N; ++i) {
			Arrays.fill(distMat[i], Long.MAX_VALUE / 2);
		}
		for (int i = 0; i < M; ++i) {
			distMat[A[i]][B[i]] = C[i];
			distMat[B[i]][A[i]] = C[i];
		}
	}

	void calcDistMat() {
		for (int k = 0; k < N; ++k) {
			for (int i = 0; i < N; ++i) {
				for (int j = 0; j < N; ++j) {
					distMat[i][j] = Math.min(distMat[i][j], distMat[i][k] + distMat[k][j]);
					distMat[j][i] = distMat[i][j];
				}
			}
		}
	}

	long calcDist(int current, Set<Integer> remain) {
		if (remain.size() == 1) {
			int next = remain.stream().findFirst().get();
			return distMat[current][next];
		} else {
			long min = Long.MAX_VALUE / 2;
			for (Integer next : remain) {
				Set<Integer> nextRemain = new HashSet<>();
				nextRemain.addAll(remain);
				nextRemain.remove(next);
				min = distMat[current][next] + Math.min(min, calcDist(next, nextRemain));
			}
			return min;
		}
	}

	void calc() {
		calcDistMat();
		long min = Integer.MAX_VALUE / 2;
		Set<Integer> nodes = new HashSet<>();
		for (int i = 0; i < R; ++i) {
			nodes.add(r[i]);
		}
		for (int i = 0; i < R; ++i) {
			Set<Integer> nextRemain = new HashSet<>();
			nextRemain.addAll(nodes);
			nextRemain.remove(r[i]);
			min = Math.min(min, calcDist(r[i], nextRemain));
		}
		System.out.println(min);
	}

	void showResult() {
	}
}