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

	int N;
	int[][][] f;
	int[] counts;

	Main(BufferedReader in) throws IOException {
		N = Integer.parseInt(in.readLine());
		f = new int[101][101][101];

	}

	int f(int x, int y, int z) {
		return x * x + y * y + z * z + x * y + y * z + z * x;
	}

	void calc() {
		for (int x = 1; x <= 100; ++x) {
			for (int y = 1; y <= 100; ++y) {
				for (int z = 1; z <= 100; ++z) {
					f[z][y][x] = f(x, y, z);
				}
			}
		}
		counts = new int[N + 1];
		Arrays.fill(counts, 0);
		for (int x = 1; x <= 100; ++x) {
			for (int y = 1; y <= 100; ++y) {
				for (int z = 1; z <= 100; ++z) {
					int val = f[z][y][x];
					if (val <= N) {
						counts[val]++;
					}
				}
			}
		}

	}

	void showResult() {
		for (int i = 1; i <= N; ++i) {
			System.out.println(counts[i]);
		}
	}
}
