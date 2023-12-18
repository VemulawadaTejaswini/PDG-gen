import java.util.Scanner;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int total = 0;

		TreeMap<String, Integer> s = new TreeMap<>();

		for (int i = 0; i < n; i++) {
			String input = sc.next();
			if (s.containsKey(input)) {

			} else {
				s.put(input, 1);
			}
		}

		for (String key : s.keySet()) {
			total++;
		}

		System.out.println(total);

	}
}
