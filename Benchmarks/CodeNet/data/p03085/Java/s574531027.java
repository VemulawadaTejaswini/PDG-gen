import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	private static Map<String, String> map = new HashMap<>();

	static {
		map.put("A", "T");
		map.put("T", "A");
		map.put("C", "G");
		map.put("G", "C");
	}

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			String s = scanner.nextLine();
			System.out.println(map.get(s));
		}
	}
}
