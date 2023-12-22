import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int h = Integer.parseInt(sa[0]);
		int w = Integer.parseInt(sa[1]);
		int m = Integer.parseInt(sa[2]);

		int[] a = new int[m];
		int[] b = new int[m];
		int[] x = new int[h];
		int[] y = new int[w];
		for (int i = 0; i < m; i++) {
			sa = br.readLine().split(" ");
			a[i] = Integer.parseInt(sa[0]) - 1;
			b[i] = Integer.parseInt(sa[1]) - 1;
			x[a[i]]++;
			y[b[i]]++;
		}
		br.close();

		int xx = 0;
		for (int i = 0; i < x.length; i++) {
			xx = Math.max(xx, x[i]);
		}
		Set<Integer> sx = new HashSet<>();
		for (int i = 0; i < x.length; i++) {
			if (x[i] == xx) {
				sx.add(i);
			}
		}

		int yy = 0;
		for (int i = 0; i < y.length; i++) {
			yy = Math.max(yy, y[i]);
		}
		Set<Integer> sy = new HashSet<>();
		for (int i = 0; i < y.length; i++) {
			if (y[i] == yy) {
				sy.add(i);
			}
		}

		int cnt = 0;
		for (int i = 0; i < m; i++) {
			if (sx.contains(a[i]) && sy.contains(b[i])) {
				cnt++;
			}
		}
		if ((long) sx.size() * sy.size() == cnt) {
			System.out.println(xx + yy - 1);
		} else {
			System.out.println(xx + yy);
		}
	}
}
