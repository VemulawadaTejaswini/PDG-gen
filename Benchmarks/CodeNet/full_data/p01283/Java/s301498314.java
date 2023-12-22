import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Main {

	static FastScanner sc = new FastScanner();

	public static void main(String[] args) throws Exception {
		int[] I = new int[256];
		double[] en = new double[257];
		StringBuilder sb = new StringBuilder();
		while (true) {
			int N = sc.nextInt();
			if (N == 0) break;
			for (int i = 0; i < N; ++i) {
				double v = 1.0 * (i + 1) / N;
				en[i + 1] = -v * Math.log(v);
				I[i] = sc.nextInt();
			}
			double best = Double.MAX_VALUE;
			int bs = 0;
			int ba = 0;
			int bc = 0;
			for (int s = 0; s < 16; ++s) {
				for (int a = 0; a < 16; ++a) {
					OUT: for (int c = 0; c < 16; ++c) {
						int[] hist = new int[256];
						int r = s;
						for (int i = 0; i < N; ++i) {
							r = (a * r + c) & 0xFF;
							hist[(I[i] + r) & 0xFF]++;
						}
						double e = 0;
						for (int i = 0; i < 256; ++i) {
							if (hist[i] != 0) {
								e += en[hist[i]];
								if (e >= best) continue OUT;
							}
						}
						if (e < best - 1e-10) {
							best = e;
							bs = s;
							ba = a;
							bc = c;
						}
					}
				}
			}
			sb.append(bs + " " + ba + " " + bc + "\n");
		}
		System.out.print(sb);
	}

	static class FastScanner {
		Reader input;

		FastScanner() {
			this.input = new BufferedReader(new InputStreamReader(System.in));
		}

		int nextInt() throws IOException {
			int sign = 1;
			int b = input.read();
			while ((b < '0' || '9' < b) && b != '-' && b != '+') {
				b = input.read();
			}
			if (b == '-') {
				sign = -1;
				b = input.read();
			} else if (b == '+') {
				b = input.read();
			}
			int ret = b - '0';
			while (true) {
				b = input.read();
				if (b < '0' || '9' < b) return ret * sign;
				ret *= 10;
				ret += b - '0';
			}
		}
	}

}