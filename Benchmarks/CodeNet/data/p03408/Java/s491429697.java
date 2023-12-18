
import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int money = 0;
		int blue = sc.nextInt();
		HashMap<String, Integer> blueCards = new HashMap<String, Integer>();
		for (int i = 0; i < blue; i++) {
			String s = sc.next();
			if (blueCards.containsKey(s)) {
				int value = blueCards.get(s);
				blueCards.put(s, ++value);
			} else {
				blueCards.put(s, 1);
			}
		}

		int red = sc.nextInt();
		//HashMap<String, Integer> redCards = new HashMap<String, Integer>();
		for (int i = 0; i < red; i++) {
			String s = sc.next();
			if (blueCards.containsKey(s)) {
				int value = blueCards.get(s);
				blueCards.put(s, --value);
			}
		}

		int max = 0;
		for (String s : blueCards.keySet()) {
			int value = blueCards.get(s);
			max = Math.max(max, value);
		}
		System.out.println(max);

	}
}
