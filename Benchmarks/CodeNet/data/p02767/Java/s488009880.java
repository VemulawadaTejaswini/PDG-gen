import java.util.*;
import java.util.stream.Collectors;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
	int N;
	int[] X;

	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		Main ins = new Main(in);
		ins.calc();
		ins.showResult();
	}

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		String[] tokens = in.readLine().split(" ");
		X = new int[N];
		for (int i = 0; i < N; ++i) {
			X[i] = Integer.parseInt(tokens[i]);
		}
	}

	void calc() {
		// まず平均値を求める
		double ave = 0.0;
		for (Integer x : X) {
			ave += x;
		}
		ave /= N;
		int ave0 = (int) Math.floor(ave);
		int ave1 = ave0 + 1;
		// 分散を求める
		double var0 = 0.0;
		for (Integer x : X) {
			var0 += (x - ave0) * (x - ave0);
		}
		double var1 = 0.0;
		for (Integer x : X) {
			var1 += (x - ave1) * (x - ave1);
		}
		var0 = Math.min(var0, var1);
		System.out.println((int)(var0));
	}

	void showResult() {

	}
}
