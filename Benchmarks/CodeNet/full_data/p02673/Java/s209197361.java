import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.System.exit;
import static java.util.Arrays.fill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	static int n;
	static long a[], b[], bSum[], bSumI[];
	static NavigableSet<Integer> have;

	static void solve() throws Exception {
		n = scanInt();
		a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = scanLong();
		}
		b = new long[n];
		bSum = new long[n + 1];
		bSumI = new long[n + 1];
		for (int i = 0; i < n; i++) {
			b[i] = 2 * scanLong();
			bSum[i + 1] = bSum[i] + b[i];
			bSumI[i + 1] = bSumI[i] + b[i] * i;
		}
		have = new TreeSet<>();
		for (int i = 0; i < n; i++) {
			have.add(i);
		}
		int stack[] = new int[n];
		for (int i = 0; i < n; i++) {
			stack[i] = i;
		}
		boolean onStack[] = new boolean[n];
		fill(onStack, true);
		int stackSize = n;
		while (stackSize > 0) {
			int cur = stack[--stackSize];
			onStack[cur] = false;
			long aCur = a[cur];
//			System.err.println("CUR " + cur + " " + aCur);
			Integer iPrev = have.lower(cur);
			if (iPrev == null) {
				iPrev = have.last();
			}
			int prev = iPrev;
//			System.err.println("PREV " + prev + " " + a[prev]);
			long sPrev = a[cur] - a[prev];
			long dPrev;
			if (prev < cur) {
				sPrev -= (bSum[cur] - bSum[prev + 1]) * prev - (bSumI[cur] - bSumI[prev + 1]);
				dPrev = cur - prev;
			} else {
				sPrev -= (bSum[n] - bSum[prev + 1]) * prev - (bSumI[n] - bSumI[prev + 1]);
				sPrev -= (bSum[cur] - bSum[0]) * (prev - n) - (bSumI[cur] - bSumI[0]);
				dPrev = cur - prev + n;
			}
			double vLeft = aCur - (double) sPrev / dPrev;
//			System.err.println("LEFT " + vLeft);
			Integer iNext = have.higher(cur);
			if (iNext == null) {
				iNext = have.first();
			}
			int next = iNext;
//			System.err.println("NEXT " + next + " " + a[next]);
			long sNext = a[next] - a[cur];
			long dNext;
			if (next > cur) {
				sNext -= (bSum[next] - bSum[cur + 1]) * next - (bSumI[next] - bSumI[cur + 1]);
				dNext = next - cur;
			} else {
				sNext -= (bSum[n] - bSum[cur + 1]) * (n + next) - (bSumI[n] - bSumI[cur + 1]);
				sNext -= (bSum[next] - bSum[0]) * next - (bSumI[next] - bSumI[0]);
				dNext = next - cur + n;
			}
			double vRight = aCur + (double) sNext / dNext;
//			System.err.println("RIGHT " + vRight);
			if (2 * aCur + b[cur] < vLeft + vRight) {
//				System.err.println("REMOVE " + cur);
				have.remove(cur);
				if (!onStack[prev]) {
					stack[stackSize++] = prev;
					onStack[prev] = true;
				}
				if (!onStack[next]) {
					stack[stackSize++] = next;
					onStack[next] = true;
				}
			}
		}
		double ans = 0;
		for (int cur: have) {
			double vCur = a[cur];
			Integer iNext = have.higher(cur);
			if (iNext == null) {
				iNext = have.first();
			}
			int next = iNext;
			long sNext = a[next] - a[cur];
			long dNext;
			if (next > cur) {
				sNext -= (bSum[next] - bSum[cur + 1]) * next - (bSumI[next] - bSumI[cur + 1]);
				dNext = next - cur;
			} else {
				sNext -= (bSum[n] - bSum[cur + 1]) * (n + next) - (bSumI[n] - bSumI[cur + 1]);
				sNext -= (bSum[next] - bSum[0]) * next - (bSumI[next] - bSumI[0]);
				dNext = next - cur + n;
			}
			double dif = (double) sNext / dNext;
			do {
//				System.err.println("ANS " + cur + " " + vCur);
				ans += vCur;
				vCur += dif;
				cur = (cur + 1) % n;
				dif += b[cur];
			} while (cur != next);
		}
		out.printf(Locale.US, "%.12f", ans / n);
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