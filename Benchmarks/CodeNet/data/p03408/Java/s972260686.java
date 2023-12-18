import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		Map<String, Integer> blueMap = new HashMap<>();
		for (int i = 0; i < N; i++) {
			String input = sc.next();
			if (blueMap.containsKey(input)) {
				Integer count = blueMap.get(input) + 1;
				blueMap.put(input, count);
			} else {
				blueMap.put(input, 1);
			}
		}

		Map<String, Integer> redMap = new HashMap<>();
		int M = sc.nextInt();
		for (int i = 0; i < M; i++) {
			String input = sc.next();
			if (redMap.containsKey(input)) {
				Integer count = redMap.get(input) + 1;
				redMap.put(input, count);
			} else {
				redMap.put(input, 1);
			}
		}









	}
}
