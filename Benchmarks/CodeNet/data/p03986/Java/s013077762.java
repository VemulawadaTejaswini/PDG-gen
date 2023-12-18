import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {

	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String string = scanner.nextLine();
			int len = 222222;
			while (len != string.length()) {
				len = string.length();
				string = string.replace("ST", "");
			}
			System.out.println(len);
		}
	}
}