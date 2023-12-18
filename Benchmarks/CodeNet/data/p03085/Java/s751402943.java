import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<String, String>();

		String b = sc.next();

		map.put("A", "T");
		map.put("T", "A");
		map.put("G", "C");
		map.put("C", "G");

		System.out.println(map.get(b));
	}
}