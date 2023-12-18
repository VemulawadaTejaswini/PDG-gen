import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int h, w, n;
		String[] arg = br.readLine().split(" ");
		h = Integer.parseInt(arg[0]);
		w = Integer.parseInt(arg[1]);
		n = Integer.parseInt(arg[2]);
		int[] xi = new int[n];
		int[] yi = new int[n];
		for (int i = 0; i < n; i++) {
			arg = br.readLine().split(" ");
			yi[i] = Integer.parseInt(arg[0]) - 1;
			xi[i] = Integer.parseInt(arg[1]) - 1;
		}
		long[] res = new Solver().solve(xi, yi, w - 1, h - 1);
		for (long s : res)
			System.out.println(s);
	}

}

class Solver {
	long[] solve(int[] xi, int[] yi, int w, int h) {
		Map<Long, Integer> m = new HashMap<Long, Integer>();
		for (int i = 0; i < xi.length; i++) {
			for (int k = 0; k <= 2; k++) {
				for (int kk = 0; kk <= 2; kk++) {

					if (xi[i] - k < 0 || yi[i] - kk < 0 || xi[i] - k > w - 2 || yi[i] - kk > h - 2)
						continue;
					long p = (xi[i] - k) * w + (yi[i] - kk);
					if (m.containsKey(p)) {
						m.replace(p, m.get(p) + 1);
					} else {
						m.put(p, 1);
					}
				}
			}

		}
		long[] ans = new long[10];
		ArrayList<Integer> vals = new ArrayList<Integer>(m.values());
		long sum = 0L;
		for (int i = 0; i < vals.size(); i++) {
			ans[vals.get(i)]++;
		}
		for (int i = 1; i < ans.length; i++) {
			sum += ans[i];
		}
		ans[0] = ((long) (h - 1) * (w - 1) - sum) > 0 ? (h - 1) * (long) (w - 1) - sum : 0;
		return ans;
	}
}