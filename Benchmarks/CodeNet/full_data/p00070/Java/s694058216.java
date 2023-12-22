import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int q = 0;
		while ((str = bin.readLine()) != null) {
			q++;
			String[] strs = str.split(" ");
			final int n = Integer.parseInt(strs[0]);
			final int s = Integer.parseInt(strs[1]);

			int num = 9, val = 0;
			for (int i = n; i > 0; i--) {
				val += (num * (n * i));
			}
			int count = 0;
			if (val > s) {
				count = count(n, s, new boolean[10], 0);
			}
			System.out.println(count);
			if (q > 100) { throw new IOException(); }
		}
	}

	static int count(int n, int s, boolean[] unUse, int count) {
		if (s < 0 || n < 1) {
			return count;
		} else if (n == 1) {
			if (s < 10 && !unUse[s]) {
				return count + 1;
			} else return count;
		}
		for (int i = unUse.length - 1; i >= 0; i--) {
			int s2 = s - i * n;
			if (!unUse[i] && s2 > 0) {
				unUse[i] = true;
				count = count(n - 1, s2, unUse, count);
				unUse[i] = false;

			}
		}

		return count;
	}
}