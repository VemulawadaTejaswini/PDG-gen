import java.util.*;

public class Main {
	int A, B;
	int Q;
	long[] s, t, x;
	long[] results;

	void calc() {
		results = new long[Q];
		for (int i = 0; i < Q; ++i) {
			results[i] = calcEachResult(x[i]);
		}
	}

	void show() {
		for (int i = 0; i < Q; ++i) {
			System.out.println(results[i]);
		}
	}

	Main() {
		Scanner in = new Scanner(System.in);
		A = in.nextInt();
		B = in.nextInt();
		Q = in.nextInt();
		s = new long[A + 2];
		t = new long[B + 2];
		x = new long[Q];
		s[0] = -1000000000001L;
		for (int i = 0; i < A; ++i) {
			s[i + 1] = in.nextLong();
		}
		s[A + 1] = 1000000000001L;
		t[0] = -1000000000001L;
		for (int i = 0; i < B; ++i) {
			t[i + 1] = in.nextLong();
		}
		t[B + 1] = 1000000000001L;

		for (int i = 0; i < Q; ++i) {
			x[i] = in.nextLong();
		}
		in.close();
	}

	long calcEachResult(long targetVal) {
		int lsIndex = binSearch(s, targetVal, 0, A + 1);
		int ltIndex = binSearch(t, targetVal, 0, B + 1);
		long ls = s[lsIndex];
		long lt = t[ltIndex];
		long rs = s[lsIndex + 1];
		long rt = t[ltIndex + 1];
		long result = Long.MAX_VALUE;
		result = Math.min(result, Math.max(rs, rt) - targetVal);
		result = Math.min(result, targetVal - Math.min(ls, lt));
		result = Math.min(result, targetVal - ls + rt - ls);
		result = Math.min(result, targetVal - lt + rs - lt);
		result = Math.min(result, rs - targetVal + rs - lt);
		result = Math.min(result, rt - targetVal + rt - ls);
		return result;
	}

	int binSearch(long[] vals, long targetVal, int minIndex, int maxIndex) {
		if (minIndex + 1 == maxIndex) {
			if (targetVal > vals[maxIndex]) {
				return maxIndex;
			} else {
				return minIndex;
			}
		}
		int medIndex = minIndex + Math.floorDiv(maxIndex - minIndex, 2);
		if (targetVal > vals[medIndex]) {
			return binSearch(vals, targetVal, medIndex, maxIndex);
		} else {
			return binSearch(vals, targetVal, minIndex, medIndex);
		}
	}

	public static void main(String[] args) {
		Main ins = new Main();
		ins.calc();
		ins.show();
	}
}