import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] sa = br.readLine().split(" ");
		int x = Integer.parseInt(sa[0]);
		int y = Integer.parseInt(sa[1]);
		int a = Integer.parseInt(sa[2]);
		int b = Integer.parseInt(sa[3]);
		int c = Integer.parseInt(sa[4]);

		sa = br.readLine().split(" ");
		List<Integer> p = new ArrayList<>(a);
		for (int i = 0; i < a; i++) {
			p.add(Integer.parseInt(sa[i]));
		}
		sa = br.readLine().split(" ");
		List<Integer> q = new ArrayList<>(a);
		for (int i = 0; i < b; i++) {
			q.add(Integer.parseInt(sa[i]));
		}
		sa = br.readLine().split(" ");
		List<Integer> r = new ArrayList<>(a);
		for (int i = 0; i < c; i++) {
			r.add(Integer.parseInt(sa[i]));
		}
		br.close();

		Collections.sort(p, Collections.reverseOrder());
		Collections.sort(q, Collections.reverseOrder());
		Collections.sort(r, Collections.reverseOrder());

		long ans = 0;
		for (int i = 0; i < x; i++) {
			ans += p.get(i);
		}
		for (int i = 0; i < y; i++) {
			ans += q.get(i);
		}

		int pi = x - 1;
		int qi = y - 1;
		for (int i = 0; i < c; i++) {
			int alt = r.get(i);
			int v1 = Integer.MAX_VALUE;
			if (pi >= 0) {
				v1 = p.get(pi);
			}
			int v2 = Integer.MAX_VALUE;
			if (qi >= 0) {
				v2 = q.get(qi);
			}
			if (v1 < v2) {
				if (v1 < alt) {
					ans -= v1;
					ans += alt;
					pi--;
				} else {
					break;
				}
			} else {
				if (v2 < alt) {
					ans -= v2;
					ans += alt;
					qi--;
				} else {
					break;
				}
			}
		}
		System.out.println(ans);
	}
}
