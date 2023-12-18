import java.util.Map.Entry;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int N = reader.nextInt();
		int K = reader.nextInt();
		int ans = 0;
		SortedMap<Integer, Integer> map = new TreeMap<Integer, Integer>();

		for (int i = 0 ; i < N; i++) {
			int key = reader.nextInt();
			int value = reader.nextInt();
			if (map.containsKey(key)) {
				value += map.get(key);
			}
			map.put(key, value);
		}

		for (Entry<Integer, Integer> entry : map.entrySet()) {
			K -= entry.getValue();
			if (K <= 0) {
				ans = entry.getKey();
				break;
			}
		}

		System.out.println(ans);
		reader.close();

	}
}



