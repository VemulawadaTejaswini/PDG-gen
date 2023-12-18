import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static Map<Integer, Long> map = new HashMap<>();

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String[] conf = scanner.nextLine().split(" ");
		int insertCount = Integer.parseInt(conf[0]);
		long rank = Long.parseLong(conf[1]);

		for (int i = 0; i < insertCount; i++) {
			String[] inputs = scanner.nextLine().split(" ");
			addIfExistsElseThenPut(Integer.valueOf(inputs[0]), Long.valueOf(inputs[1]));
		}

		ArrayList<Integer> keys = new ArrayList<>();
		keys.addAll(map.keySet());
		keys.sort(Comparator.naturalOrder());
		long currentRank = 0;
		for (Integer key: keys) {
			currentRank += map.get(key);
			if (currentRank >= rank) {
				System.out.println(key);
				break;
			}
		}
	}

	private static void addIfExistsElseThenPut(int item, long number) {
		if (map.containsKey(item)) {
			map.put(item, map.get(item) + number);
		} else {
			map.put(item,  number);
		}
	}
}
