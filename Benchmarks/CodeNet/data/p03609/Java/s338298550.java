import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {


	static Map<Integer, Integer> map = new HashMap<>();
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int length = scanner.nextInt();
		for(int i = 0; i < length; i++) {
			int t = scanner.nextInt();
			increment(t - 1);
			increment(t);
			increment(t + 1);
		}
		int max = map.entrySet().stream()
			.max(Comparator.comparingInt(m -> m.getValue()))
			.get().getValue();

		System.out.println(max);
	}
	
	public static void increment(int key) {
		map.put(key, map.getOrDefault(key, 0) + 1);
	}
}
