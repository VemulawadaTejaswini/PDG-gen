import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<String, String>();

		String b = sc.next();

		map.put("A", "C");
		map.put("C", "A");
		map.put("G", "T");
		map.put("T", "G");

		System.out.println(map.get(b));
	}
}