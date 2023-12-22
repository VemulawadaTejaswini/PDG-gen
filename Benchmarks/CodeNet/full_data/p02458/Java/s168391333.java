import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		int count = 0;
		TreeMap<Integer, Integer> map = new TreeMap<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; i++) {
			int op = sc.nextInt();
			int y = sc.nextInt();
			switch (op) {
				case 0:
					if (!map.keySet().contains(y)) {
						map.put(y, 1);
					} else {
						map.put(y, map.get(y) + 1);
					}
					sb.append(++count);
					sb.append('\n');
					break;
				case 1:
					if (map.keySet().contains(y)) {
						sb.append(map.get(y));
					} else {
						sb.append('0');
					}
					sb.append('\n');
					break;
				case 2:
					if (map.keySet().contains(y)) {
						int num2 = map.get(y);
						map.remove(y);
						count -= num2;
					}
					break;
				case 3:
					int z = sc.nextInt() + 1;
					Set<Integer> subset = map.subMap(y, z).keySet();
					for (int num : subset) {
						int end = map.get(num);
						for (int j = 0; j < end; j++) {
							sb.append(num);
							sb.append('\n');
						}
					}
					break;
			}
		}
		System.out.print(sb.toString());
	}
}


