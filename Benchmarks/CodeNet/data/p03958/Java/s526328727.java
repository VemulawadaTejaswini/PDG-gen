
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
		int t = scanner.nextInt();
		TreeMap<Integer, Integer> map = new TreeMap<>();
		for (int i = 0; i < t; i++) {
			map.put(i, scanner.nextInt());
		}

		if (t == 1) {
			System.out.println(map.get(0) - 1);
			return;
		}

		int last = -1;
		int ans = 0;
		for (int i = 0; i < t; i++) {
			Iterator<Integer> key = map.keySet().iterator();
			int tmp = key.next();
			int tmp2 = 0;
			if (tmp == last) {
				tmp2 = tmp;
				tmp = key.next();
			}
			if (map.get(tmp) != 0) {
				map.put(tmp, map.get(tmp) - 1);
				last = tmp;
			} else {
				map.put(tmp2, map.get(tmp2) - 1);
				last = tmp2;
				ans++;
			}
		}
		System.out.println(ans);
	}
}
