import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<String, Integer> map = new TreeMap<>();
		int q = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
			int op = sc.nextInt();
			String key = sc.next();
			switch (op) {
				case 0:
					map.put(key, sc.nextInt());
					break;
				case 1:
					if (Objects.isNull(map.get(key))) {
						sb.append(0);
						sb.append('\n');
					} else {
						sb.append(map.get(key));
						sb.append('\n');
					}
					break;
				case 2:
					map.remove(key);
					break;
				case 3:
					String r = sc.next();
					Map<String, Integer> submap = map.subMap(key, r);
					for (String str : submap.keySet()) {
						sb.append(str);
						sb.append(' ');
						sb.append(map.get(str));
						sb.append('\n');
					}
					if (map.get(r) != null) {
						sb.append(r);
						sb.append(' ');
						sb.append(map.get(r));
						sb.append('\n');
					}
					break;
			}
		}
		System.out.print(sb.toString());
	}
}

