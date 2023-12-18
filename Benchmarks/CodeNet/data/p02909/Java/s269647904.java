import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("Sunny","Cloudy" );
		map.put("Cloudy", "Rainy");
		map.put("Rainy", "Sunny");
		Scanner sc = new Scanner(System.in);
		System.out.println(map.get(sc.next()));
	}
}
