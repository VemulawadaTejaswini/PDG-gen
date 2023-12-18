import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N, K;
	int[] P;
	double[] ave;
	double result = 0.0;

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
		K = Integer.parseInt(tokens[1]);
		P = new int[N];
		tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			P[i] = Integer.parseInt(tokens[i]);
		}
		// それぞれの期待値を求めておく
		ave = new double[N];
		for (int i = 0; i < N; ++i) {
			ave[i] = getAve(P[i]);
		}

	}

	double getAve(int p) {
		return (double) (1 + p) / 2.0;
	}

	void calc() {
		double sum = 0.0;
		// 初期解
		for (int i = 0; i < K; ++i) {
			sum += ave[i];
		}
		result = sum;
		// 順にずらしながら探す
		for (int i = K; i < N; ++i) {
			sum -= ave[i - K];
			sum += ave[i];
			result = Math.max(sum, result);
		}
	}

	void showResult() {
		System.out.println(result);
	}
}
