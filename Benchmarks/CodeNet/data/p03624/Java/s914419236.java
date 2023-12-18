import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final char[] alp = "abcdefghijklmnopqrstuvwxyz".toCharArray();

		String S = sc.next();
		char[] input = S.toCharArray();

		HashMap<Character, Integer> abcMap = new HashMap<Character, Integer>();
		for (char c : alp) {
			abcMap.put(c, 0);
		}

		for (char c : input) {
			int value = abcMap.get(c);
			abcMap.put(c, ++value);
		}
		for (char c : abcMap.keySet()) {
			if (abcMap.get(c) == 0) {
				System.out.print(c);
				return;
			}
		}
		System.out.print("None");

	}
}
