import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int k = Integer.parseInt(sc.next());
		Map<Integer, Long> m = new TreeMap<Integer, Long>();
		for (int i = 0; i < n; i++) {
			int a = Integer.parseInt(sc.next());
			long b = Integer.parseInt(sc.next());
			if (m.containsKey(a)) {
				b += m.get(a);
			}
			m.put(a, b);
		}
		int c = 0;
		for (Integer i:m.keySet()) {
			c += m.get(i);
			if (c >= k) {
				System.out.println(i);
				return;
			}
		}
	}
}