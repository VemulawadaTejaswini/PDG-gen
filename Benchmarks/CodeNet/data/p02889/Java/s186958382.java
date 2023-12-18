

import java.util.*;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		int Q = Integer.parseInt(in.readLine());
		for (int i = 0; i < Q; ++i) {
			String[] tokens = in.readLine().split(" ");
			int S = Integer.parseInt(tokens[0]);
			int T = Integer.parseInt(tokens[1]);
			int times = ins.getTimes(S - 1, T - 1);
			if (times > ins.N) {
				System.out.println("-1");
			} else {
				System.out.println((times - 1));

			}
		}
	}

	int N, M;
	long L;
	long[][] connMatrix;
	int[][] distMatrix;

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		M = Integer.parseInt(tokens[1]);
		L = Long.parseLong(tokens[2]);
		connMatrix = new long[N][N];
		for (int i = 0; i < N; ++i) {
			Arrays.fill(connMatrix[i], Long.MAX_VALUE / 2);
		}
		for (int i = 0; i < M; ++i) {
			tokens = in.readLine().split(" ");
			int A = Integer.parseInt(tokens[0]);
			int B = Integer.parseInt(tokens[1]);
			long C = Long.parseLong(tokens[2]);
			if (C <= L) {
				// 燃料タンクより長い道は使えない
				connMatrix[A - 1][B - 1] = C;
				connMatrix[B - 1][A - 1] = C;
			}
		}
		for (int i = 0; i < N; ++i) {
			connMatrix[i][i] = 0;
		}

		calcDistMatrix();

		this.distMatrix = new int[N][N];
		for (int i = 0; i < N; ++i) {
			for (int j = i + 1; j < N; ++j) {
				if (connMatrix[i][j] <= L) {
					distMatrix[i][j] = 1;
					distMatrix[j][i] = 1;
				} else {
					distMatrix[i][j] = Integer.MAX_VALUE / 2;
					distMatrix[j][i] = Integer.MAX_VALUE / 2;
				}
			}
		}
		for (int i = 0; i < N; ++i) {
			distMatrix[i][i] = 0;
		}
		calcDistMatrix2();
	}

	int getTimes(int src, int dst) {
		return distMatrix[src][dst];
	}

	void calcDistMatrix() {
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				for (int k = j + 1; k < N; ++k) {
					this.connMatrix[j][k] = Math.min(connMatrix[j][k], connMatrix[j][i] + connMatrix[i][k]);
					this.connMatrix[k][j] = connMatrix[j][k];
				}
			}
		}
	}

	void calcDistMatrix2() {
		for (int i = 0; i < N; ++i) {
			for (int j = 0; j < N; ++j) {
				for (int k = j + 1; k < N; ++k) {
					this.distMatrix[j][k] = Math.min(distMatrix[j][k], distMatrix[j][i] + distMatrix[i][k]);
					this.distMatrix[k][j] = distMatrix[j][k];
				}
			}
		}
	}

}
