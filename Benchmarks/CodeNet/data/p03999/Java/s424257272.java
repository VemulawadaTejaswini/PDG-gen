import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public final class Main {
	public static void main(String[] args) throws java.lang.Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		Solver sol = new Solver();
		System.out.println(sol.solve(s));
	}

}

class Solver {
	int getBitPosition(int i) {
		int count = 1;
		while ((i >>= 1) > 0)
			count++;
		return count;
	}

	long getSumOf(long[] aa, int i, int j) {
		long sum = 0;
		for (int a = j; a >= i; a--) {
			sum += (long) (aa[a] * Math.pow(10, j - a));
		}
		return sum;
	}

	long solve(String s) {

		char in[] = s.toCharArray();
		long inp[] = new long[in.length];
		for (int ii = 0; ii < in.length; ii++) {
			inp[ii] = in[ii] - '0';
		}
		long sum = 0;
		int ways = 1 << (in.length - 1);
		for (int ii = 1; ii < ways; ii++) {
			long temp = 0;
			int i = ii;
			int last = inp.length - 1;
			while (i > 0) {
				int n = getBitPosition(i & -i);
				n = in.length - n;
				temp += getSumOf(inp, n, last);
				last = n - 1;
				if ((i & (i - 1)) == 0) {
					temp += getSumOf(inp, 0, last);
				}
				i = i & (i - 1);

			}
			sum += temp;
		}
		return sum + getSumOf(inp, 0, inp.length - 1);
	}

}
