import java.util.Collections;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		int n = sc.nextInt();
		TreeMap<String, TreeMap<Integer, Integer>> a = new TreeMap<String, TreeMap<Integer, Integer>>();
		TreeMap<Integer, Integer> b = new TreeMap<Integer, Integer>(Collections.reverseOrder());

		for (int i = 1; i <= n; i++) {
			String str = sc.next();
			int z = sc.nextInt();
			b = new TreeMap<Integer, Integer>(Collections.reverseOrder());
			if (a.get(str) != null) {
				b.putAll(a.get(str));
			}
			b.put(z, i);
			a.put(str, b);
			b.clear();
			System.out.println(str + " " + z + " " + i);
		}

		for (String x : a.keySet()) {
			System.out.println(x);
			b = new TreeMap<Integer, Integer>(Collections.reverseOrder());
			b.putAll(a.get(x));
			for (Integer y : b.keySet()) {
				System.out.println(y);
				System.out.println(a.get(x).get(y));
			}
			b.clear();
		}

		sc.close();
	}
}