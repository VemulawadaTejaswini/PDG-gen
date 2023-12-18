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

	int N;
	int[] t, v;
	double dist = 0.0;

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		t = new int[N];
		v = new int[N + 1];
		String[] tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			t[i] = Integer.parseInt(tokens[i]);
		}
		tokens = in.readLine().split(" ");
		for (int i = 0; i < N; ++i) {
			v[i] = Integer.parseInt(tokens[i]);
		}
		v[N] = 0;

	}

	int sub(int startV, int endV, int maxV, int t) {
		double dist = 0.0;
		int prevV = startV;
		int v = -1;
		for (int i = 1; i <= t; ++i) {
			v = startV + i;
			v = Math.min(v, endV + (t - i));
			v = Math.min(v, maxV);
			dist += ((double) prevV + (double) v) / 2.0;
			if (prevV == v && v < maxV) {
				dist += 0.25;
			}
			prevV = v;
		}
		this.dist += dist;
		return v;
	}

	void calc() {
		int currentV = sub(0, v[1], v[0], t[0]);
		for (int i = 1; i < N; ++i) {
			currentV = sub(currentV, v[i + 1], v[i], t[i]);
		}

	}

	void showResult() {
		System.out.println(dist);
	}
}