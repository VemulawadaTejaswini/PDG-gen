
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

			for (int i = 0; i < n; i++) {
				int a = sc.nextInt();
				if (map.keySet().contains(a)) {
					map.put(a, map.get(a)+ 1);
				} else {
					map.put(a, 1);
				}
			}

			int count = 0;
			long result = 1l;
			Integer[] tmp = map.keySet().toArray(new Integer[map.size()]);

			for (int i = tmp.length - 1; 0 <= i; i--){
				if (2 <= map.get(tmp[i])) {
					result *= tmp[i];
					count++;
					if (count == 2) {
						System.out.println(result);
						return;
					}
				}
			}
			System.out.println(0);
		}
	}
}
