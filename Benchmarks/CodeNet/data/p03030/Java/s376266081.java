import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String, Integer> data = new TreeMap<>();

		for (int i = 0; i < n; i++) {
			String city = sc.next();
			int point = sc.nextInt();
			data.put(city + (1100 - point), i + 1);
		}

		for (String key : data.keySet()) {
			System.out.println(data.get(key));
		}

		sc.close();
	}
}
