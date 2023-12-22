import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.arraycopy;
import static java.lang.System.exit;
import static java.util.Arrays.copyOf;
import static java.util.Arrays.fill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Main {

	static class FFT1 {

		static final int MOD = 998244353;
		static final int IDENT = 503245988;
		static final int MAXBITS = 23;
		static final int GEN = 507547112;
		static final int MULFIX = 479173089;

		static final int mul(int a, int b) {
			long res = (long) a * b;
			long low = res & 0x7fffff;
			res = (res >> 23) + MOD + low + (low << 3) - (low << 7);
			low = res & 0x7fffff;
			res = (res >> 23) + low + (low << 3) - (low << 7);
			if (res < 0) {
				res += MOD;
			}
			return (int) res;
		}

		static int add(int a, int b) {
			int res = a + b;
			if (res - MOD >= 0) {
				res -= MOD;
			}
			return res;
		}

		static int sub(int a, int b) {
			int res = a - b;
			if (res < 0) {
				res += MOD;
			}
			return res;
		}

		static int GENPOWS[] = new int[0];
		static int GENPOWSI[] = new int[0];

		static void checkBits(int bits) {
			if (bits < 0 || bits > MAXBITS) {
				throw new AssertionError();
			}
			if (bits != 0 && GENPOWS.length < 1 << (bits - 1)) {
				GENPOWS = new int[1 << (bits - 1)];
				GENPOWSI = new int[1 << (bits - 1)];
				int gen = GEN;
				for (int i = bits; i != MAXBITS; i++) {
					gen = mul(gen, gen);
				}
				int pow = IDENT;
				for (int i = 0; i != 1 << (bits - 1); i++) {
					GENPOWS[Integer.reverse(i) >>> (32 - (bits - 1))] = pow;
					GENPOWSI[Integer.reverse(-i) >>> (32 - (bits - 1))] = MOD - pow;
					pow = mul(pow, gen);
				}
				GENPOWSI[0] = IDENT;
			}
		}

		static void fft(int arr[], int bits) {
			checkBits(bits);
			int n = 1 << bits, p[] = GENPOWS;
			for (int bit = bits - 1; bit > 1; bit -= 2) {
				for (int iStart = 0; iStart != n; iStart += 1 << (bit + 1)) {
					int iMid = iStart + (1 << (bit - 2)), iEnd = iStart + (1 << (bit - 1));
					int q = iStart >> bit, r = iStart >> (bit - 1);
					int u = p[q], v = p[q + 1], w = p[r], x = p[r + 1], y = p[r + 2], z = p[r + 3];
					for (int i = iStart; i != iMid; i++) {
						int j = i ^ (1 << (bit - 1)), k = i ^ (1 << bit), l = k ^ (1 << (bit - 1));
						int a = arr[i], b = arr[j], c = arr[k], d = arr[l];
						int e = add(a, c), f = mul(b + d, u), g = sub(a, c), h = mul(b - d + MOD, v);
						arr[i] = add(e, f); arr[j] = sub(e, f);
						arr[k] = add(g, h); arr[l] = sub(g, h);
					}
					for (int i = iMid; i != iEnd; i++) {
						int j = i ^ (1 << (bit - 1)), k = i ^ (1 << bit), l = k ^ (1 << (bit - 1));
						int a = arr[i], b = arr[j], c = arr[k], d = arr[l];
						int e = add(a, c), f = mul(b + d, u), g = sub(a, c), h = mul(b - d + MOD, v);
						arr[i] = mul(e + f, w); arr[j] = mul(e - f + MOD, x);
						arr[k] = mul(g + h, y); arr[l] = mul(g - h + MOD, z);
					}
				}
			}
			if ((bits & 1) != 0) {
				for (int i = 0; i != n; i += 2) {
					int a = arr[i], b = arr[i + 1];
					arr[i] = add(a, b); arr[i + 1] = sub(a, b);
				}
			} else if (bits != 0) {
				for (int i = 0; i != n; i += 4) {
					int q = i >> 1, u = p[q], v = p[q + 1];
					int a = arr[i], b = arr[i + 1], c = arr[i + 2], d = arr[i + 3];
					int e = add(a, c), f = mul(b + d, u), g = sub(a, c), h = mul(b - d + MOD, v);
					arr[i] = add(e, f); arr[i + 1] = sub(e, f);
					arr[i + 2] = add(g, h); arr[i + 3] = sub(g, h);
				}
			}
		}

		static void fftI(int arr[], int bits, int fixes) {
			checkBits(bits);
			int m = IDENT;
			int half = mul((MOD + 1) >>> 1, MULFIX);
			for (int i = 0; i != bits; i++) {
				m = mul(m, half);
			}
			for (int i = 0; i != fixes; i++) {
				m = mul(m, MULFIX);
			}
			int n = 1 << bits, p[] = GENPOWSI;
			for (int bit = 0; bit < bits - 2; bit += 2) {
				for (int iStart = 0; iStart != n; iStart += 1 << (bit + 2)) {
					int iEnd = iStart + (1 << bit);
					int q = iStart >> (bit + 1), r = iStart >> (bit + 2);
					int u = p[q], v = p[q + 1], w = p[r];
					for (int i = iStart; i != iEnd; i++) {
						int j = i ^ (1 << bit), k = i ^ (1 << (bit + 1)), l = k ^ (1 << bit);
						int a = arr[i], b = arr[j], c = arr[k], d = arr[l];
						int e = add(a, b), f = mul(a - b + MOD, u), g = add(c, d), h = mul(c - d + MOD, v);
						arr[i] = add(e, g); arr[j] = add(f, h);
						arr[k] = mul(e - g + MOD, w); arr[l] = mul(f - h + MOD, w);
					}
				}
			}
			if ((bits & 1) != 0) {
				for (int i = 0; i != 1 << (bits - 1); i++) {
					int j = i ^ (1 << (bits - 1));
					int a = arr[i], b = arr[j];
					arr[i] = mul(a + b, m); arr[j] = mul(a - b + MOD, m);
				}
			} else if (bits != 0) {
				int v = p[1];
				for (int i = 0; i != 1 << (bits - 2); i++) {
					int j = i ^ (1 << (bits - 2)), k = i ^ (1 << (bits - 1)), l = k ^ (1 << (bits - 2));
					int a = arr[i], b = arr[j], c = arr[k], d = arr[l];
					int e = add(a, b), f = sub(a, b), g = add(c, d), h = mul(c - d + MOD, v);
					arr[i] = mul(e + g, m); arr[j] = mul(f + h, m);
					arr[k] = mul(e - g + MOD, m); arr[l] = mul(f - h + MOD, m);
				}
			} else {
				arr[0] = mul(arr[0], m);
			}
		}

		static int tmpA[] = new int[0], tmpB[] = new int[0];

		static int[] convolve(int a[], int b[]) {
			if (a.length == 0 || b.length == 0) {
				return new int[0];
			}
			int size = a.length + b.length - 1;
			int size2 = (size & -size) == size ? size : Integer.highestOneBit(size) << 1;
			int bits = Integer.numberOfTrailingZeros(size2);
			if (tmpA.length < size2) {
				tmpA = new int[size2];
				tmpB = new int[size2];
			}
			arraycopy(a, 0, tmpA, 0, a.length);
			fill(tmpA, a.length, size2, 0);
			fft(tmpA, bits);
			arraycopy(b, 0, tmpB, 0, b.length);
			fill(tmpB, b.length, size2, 0);
			fft(tmpB, bits);
			for (int i = 0; i < size2; i++) {
				tmpA[i] = mul(tmpA[i], tmpB[i]);
			}
			fftI(tmpA, bits, 1);
			return copyOf(tmpA, size);
		}
	}

	static class FFT2 {

		static final int MOD = 2013265921;
		static final int IDENT = 1064793976;
		static final int MAXBITS = 27;
		static final int GEN = 721282566;
		static final int MULFIX = 1740615034;

		static final int mul(int a, int b) {
			long res = (a & 0xffffffffL) * (b & 0xffffffffL);
			long low = res & 0x7ffffff;
			res = (res >> 27) + MOD + low - (low << 4);
			low = res & 0x7ffffff;
			res = (res >> 27) + low - (low << 4);
			if (res < 0) {
				res += MOD;
			}
			return (int) res;
		}

		static int add(int a, int b) {
			int res = a + b;
			if (res - MOD >= 0) {
				res -= MOD;
			}
			return res;
		}

		static int sub(int a, int b) {
			int res = a - b;
			if (res < 0) {
				res += MOD;
			}
			return res;
		}

		static int GENPOWS[] = new int[0];
		static int GENPOWSI[] = new int[0];

		static void checkBits(int bits) {
			if (bits < 0 || bits > MAXBITS) {
				throw new AssertionError();
			}
			if (bits != 0 && GENPOWS.length < 1 << (bits - 1)) {
				GENPOWS = new int[1 << (bits - 1)];
				GENPOWSI = new int[1 << (bits - 1)];
				int gen = GEN;
				for (int i = bits; i != MAXBITS; i++) {
					gen = mul(gen, gen);
				}
				int pow = IDENT;
				for (int i = 0; i != 1 << (bits - 1); i++) {
					GENPOWS[Integer.reverse(i) >>> (32 - (bits - 1))] = pow;
					GENPOWSI[Integer.reverse(-i) >>> (32 - (bits - 1))] = MOD - pow;
					pow = mul(pow, gen);
				}
				GENPOWSI[0] = IDENT;
			}
		}

		static void fft(int arr[], int bits) {
			checkBits(bits);
			int n = 1 << bits, p[] = GENPOWS;
			for (int bit = bits - 1; bit > 1; bit -= 2) {
				for (int iStart = 0; iStart != n; iStart += 1 << (bit + 1)) {
					int iMid = iStart + (1 << (bit - 2)), iEnd = iStart + (1 << (bit - 1));
					int q = iStart >> bit, r = iStart >> (bit - 1);
					int u = p[q], v = p[q + 1], w = p[r], x = p[r + 1], y = p[r + 2], z = p[r + 3];
					for (int i = iStart; i != iMid; i++) {
						int j = i ^ (1 << (bit - 1)), k = i ^ (1 << bit), l = k ^ (1 << (bit - 1));
						int a = arr[i], b = arr[j], c = arr[k], d = arr[l];
						int e = add(a, c), f = mul(b + d, u), g = sub(a, c), h = mul(b - d + MOD, v);
						arr[i] = add(e, f); arr[j] = sub(e, f);
						arr[k] = add(g, h); arr[l] = sub(g, h);
					}
					for (int i = iMid; i != iEnd; i++) {
						int j = i ^ (1 << (bit - 1)), k = i ^ (1 << bit), l = k ^ (1 << (bit - 1));
						int a = arr[i], b = arr[j], c = arr[k], d = arr[l];
						int e = add(a, c), f = mul(b + d, u), g = sub(a, c), h = mul(b - d + MOD, v);
						arr[i] = mul(e + f, w); arr[j] = mul(e - f + MOD, x);
						arr[k] = mul(g + h, y); arr[l] = mul(g - h + MOD, z);
					}
				}
			}
			if ((bits & 1) != 0) {
				for (int i = 0; i != n; i += 2) {
					int a = arr[i], b = arr[i + 1];
					arr[i] = add(a, b); arr[i + 1] = sub(a, b);
				}
			} else if (bits != 0) {
				for (int i = 0; i != n; i += 4) {
					int q = i >> 1, u = p[q], v = p[q + 1];
					int a = arr[i], b = arr[i + 1], c = arr[i + 2], d = arr[i + 3];
					int e = add(a, c), f = mul(b + d, u), g = sub(a, c), h = mul(b - d + MOD, v);
					arr[i] = add(e, f); arr[i + 1] = sub(e, f);
					arr[i + 2] = add(g, h); arr[i + 3] = sub(g, h);
				}
			}
		}

		static void fftI(int arr[], int bits, int fixes) {
			checkBits(bits);
			int m = IDENT;
			int half = mul((MOD + 1) >>> 1, MULFIX);
			for (int i = 0; i != bits; i++) {
				m = mul(m, half);
			}
			for (int i = 0; i != fixes; i++) {
				m = mul(m, MULFIX);
			}
			int n = 1 << bits, p[] = GENPOWSI;
			for (int bit = 0; bit < bits - 2; bit += 2) {
				for (int iStart = 0; iStart != n; iStart += 1 << (bit + 2)) {
					int iEnd = iStart + (1 << bit);
					int q = iStart >> (bit + 1), r = iStart >> (bit + 2);
					int u = p[q], v = p[q + 1], w = p[r];
					for (int i = iStart; i != iEnd; i++) {
						int j = i ^ (1 << bit), k = i ^ (1 << (bit + 1)), l = k ^ (1 << bit);
						int a = arr[i], b = arr[j], c = arr[k], d = arr[l];
						int e = add(a, b), f = mul(a - b + MOD, u), g = add(c, d), h = mul(c - d + MOD, v);
						arr[i] = add(e, g); arr[j] = add(f, h);
						arr[k] = mul(e - g + MOD, w); arr[l] = mul(f - h + MOD, w);
					}
				}
			}
			if ((bits & 1) != 0) {
				for (int i = 0; i != 1 << (bits - 1); i++) {
					int j = i ^ (1 << (bits - 1));
					int a = arr[i], b = arr[j];
					arr[i] = mul(a + b, m); arr[j] = mul(a - b + MOD, m);
				}
			} else if (bits != 0) {
				int v = p[1];
				for (int i = 0; i != 1 << (bits - 2); i++) {
					int j = i ^ (1 << (bits - 2)), k = i ^ (1 << (bits - 1)), l = k ^ (1 << (bits - 2));
					int a = arr[i], b = arr[j], c = arr[k], d = arr[l];
					int e = add(a, b), f = sub(a, b), g = add(c, d), h = mul(c - d + MOD, v);
					arr[i] = mul(e + g, m); arr[j] = mul(f + h, m);
					arr[k] = mul(e - g + MOD, m); arr[l] = mul(f - h + MOD, m);
				}
			} else {
				arr[0] = mul(arr[0], m);
			}
		}

		static int tmpA[] = new int[0], tmpB[] = new int[0];

		static int[] convolve(int a[], int b[]) {
			if (a.length == 0 || b.length == 0) {
				return new int[0];
			}
			int size = a.length + b.length - 1;
			int size2 = (size & -size) == size ? size : Integer.highestOneBit(size) << 1;
			int bits = Integer.numberOfTrailingZeros(size2);
			if (tmpA.length < size2) {
				tmpA = new int[size2];
				tmpB = new int[size2];
			}
			arraycopy(a, 0, tmpA, 0, a.length);
			fill(tmpA, a.length, size2, 0);
			fft(tmpA, bits);
			arraycopy(b, 0, tmpB, 0, b.length);
			fill(tmpB, b.length, size2, 0);
			fft(tmpB, bits);
			for (int i = 0; i < size2; i++) {
				tmpA[i] = mul(tmpA[i], tmpB[i]);
			}
			fftI(tmpA, bits, 1);
			return copyOf(tmpA, size);
		}
	}

	static void solve() throws Exception {
		int dlog[] = new int[200003];
		for (int i = 0, v = 1; i < 200002; i++) {
			dlog[v] = i;
			v = (v * 2) % 200003;
		}
		int cnts[] = new int[200002];
		int n = scanInt();
		for (int i = 0; i < n; i++) {
			int a = scanInt();
			if (a != 0) {
				++cnts[dlog[a]];
			}
		}
		int r1[] = FFT1.convolve(cnts, cnts);
		int r2[] = FFT2.convolve(cnts, cnts);
		long ans = 0;
		for (int i = 0, v = 1; i < 2 * 200002 - 1; i++) {
			long cr1 = r1[i], cr2 = r2[i];
			long cr = ((cr1 * 49499719) % FFT1.MOD * FFT2.MOD + (cr2 * 1913434555) % FFT2.MOD * FFT1.MOD) % ((long) FFT1.MOD * FFT2.MOD);
			ans += v * cr;
			v = (v * 2) % 200003;
		}
		for (int i = 0, v = 1; i < 200002; i++) {
			ans -= (long) v * cnts[i];
			v = (v * 4) % 200003;
		}
		out.print(ans / 2);
	}

	static int scanInt() throws IOException {
		return parseInt(scanString());
	}

	static long scanLong() throws IOException {
		return parseLong(scanString());
	}

	static String scanString() throws IOException {
		while (tok == null || !tok.hasMoreTokens()) {
			tok = new StringTokenizer(in.readLine());
		}
		return tok.nextToken();
	}

	static BufferedReader in;
	static PrintWriter out;
	static StringTokenizer tok;

	public static void main(String[] args) {
		try {
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new PrintWriter(System.out);
			solve();
			in.close();
			out.close();
		} catch (Throwable e) {
			e.printStackTrace();
			exit(1);
		}
	}
}