import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;

public class Main {

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	int N, M;
	Tuple[] edges;
	int[][] distMat;
	int result = 0;

	static class Tuple {
		int a, b, c;

		Tuple(String line) {
			String[] tokens = line.split(" ");
			a = Integer.parseInt(tokens[0]) - 1;
			b = Integer.parseInt(tokens[1]) - 1;
			c = Integer.parseInt(tokens[2]);
		}
	}

	Main(BufferedReader in) throws IOException {
		String[] tokens = in.readLine().split(" ");
		N = Integer.parseInt(tokens[0]);
		M = Integer.parseInt(tokens[1]);
		edges = new Tuple[M];
		for (int i = 0; i < M; ++i) {
			edges[i] = new Tuple(in.readLine());
		}
		distMat = new int[N][N];
		for (int i = 0; i < N; ++i) {
			Arrays.fill(distMat[i], Integer.MAX_VALUE / 2);
		}
		for (int i = 0; i < N; ++i) {
			distMat[i][i] = 0;
		}
		for (int i = 0; i < M; ++i) {
			Tuple edge = edges[i];
			int a = edge.a;
			int b = edge.b;
			distMat[a][b] = edge.c;
			distMat[b][a] = edge.c;
		}
	}

	void calc() {
		for (int k = 0; k < N; ++k) {
			for (int i = 0; i < N; ++i) {
				for (int j = i + 1; j < N; ++j) {
					distMat[i][j] = Math.min(distMat[i][j], distMat[i][k] + distMat[k][j]);
					distMat[j][i] = distMat[i][j];
				}
			}
		}
		for (int i = 0; i < M; ++i) {
			Tuple edge = edges[i];
			int a = edge.a;
			int b = edge.b;
			if (distMat[a][b] < edge.c) {
				++result;
			}
		}
	}

	void showResult() {
		System.out.println(result);
	}
}