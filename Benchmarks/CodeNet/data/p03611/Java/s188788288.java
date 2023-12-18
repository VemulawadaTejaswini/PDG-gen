import java.util.*;
// warm-up
public class Main {

	static void solve() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(), e = 0, no = N, max = Integer.MIN_VALUE, t = 0;
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		while (no-->0) {
			e = sc.nextInt();
			m.put(e, m.get(e)==null ? 1 : m.get(e)+1);
			m.put(e-1, m.get(e-1)==null ? 1 : m.get(e-1)+1);
			m.put(e+1, m.get(e+1)==null ? 1 : m.get(e+1)+1);
		}
		for (int d : m.keySet()) if (m.get(d)>max) max = m.get(d);
		System.out.println(max);
		sc.close();		
	}

	public static void main(String args[]) {
		solve();
	}

}