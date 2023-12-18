import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s[] = new String[N];

		List<TreeMap<Character, Integer>> list = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			s[i] = sc.next();

			TreeMap<Character, Integer> map = new TreeMap<Character, Integer>();

			for (int j = 0; j < s[i].length(); j++) {
				char c = s[i].charAt(j);
				if (map.containsKey(c)) {
					map.put(c, map.get(c) + 1);
				} else {
					map.put(c, 1);
				}
			}
			list.add(map);
		}

		long cnt = 0;

		for (int i = 0; i < list.size(); i++) {
			TreeMap<Character, Integer> map1 = new TreeMap<Character, Integer>();

			map1 = list.get(i);

			for (int j = i; j < list.size(); j++) {
				if (i==j) {
					continue;
				}
				TreeMap<Character, Integer> map2 = new TreeMap<Character, Integer>();
				map2 = list.get(j);
				if (map1.equals(map2)) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}