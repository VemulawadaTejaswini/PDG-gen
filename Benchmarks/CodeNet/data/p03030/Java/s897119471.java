import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		Map<String, Map<Integer, Integer>> city = new TreeMap<>();
		for (int i = 1; i <= N; i++) {
			String s = sc.next();
			int p = sc.nextInt();
			Map<Integer, Integer> point = null;
			if (city.containsKey(s))
				point = city.get(s);
			else {
				point = new TreeMap<>(new Comparator<Integer>() {
					public int compare(Integer k1, Integer k2) {
						return k2.compareTo(k1) ;
					}
				});
			}
			point.put(p, i);
			city.put(s, point);
		}
		sc.close();
		for(Map<Integer, Integer> point : city.values()) {
			for(Integer index : point.values()) {
				System.out.println(index);
			}
		}
	}
}