import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		long answer = 0;
		HashMap<Integer, Integer> prevMap = new HashMap<>();
		HashMap<Integer, Integer> newMap = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {
			int num = Character.getNumericValue(s.charAt(i));

			for (int key : prevMap.keySet()) {
				int prevMapVal = prevMap.get(key);
				int mapKey = (key * 10 + num) % 2019;
				int prevVal = newMap.getOrDefault(mapKey, 0);
				newMap.put(mapKey, prevVal + prevMapVal);
			}
			if (newMap.containsKey(num)) {
				newMap.put(num, newMap.get(num) + 1);
			} else {
				newMap.put(num, 1);
			}
			prevMap.clear();
			for (int key : newMap.keySet()) {
				prevMap.put(key, newMap.get(key));
			}
			answer = answer + newMap.getOrDefault(0, 0);
			newMap.clear();
		}
		print(answer);
	}

	public static void print(Object obj) {
		System.out.println(obj);
	}

}
