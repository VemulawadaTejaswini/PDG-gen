import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);

		Map<Character, String> hash = new HashMap<Character, String>();
		hash.put('1', "");
		hash.put('2', "k");
		hash.put('3', "s");
		hash.put('4', "t");
		hash.put('5', "n");
		hash.put('6', "h");
		hash.put('7', "m");
		hash.put('8', "y");
		hash.put('9', "r");
		hash.put('0', "w");
		hash.put('T', "a");
		hash.put('U', "u");
		hash.put('D', "o");
		hash.put('R', "e");
		hash.put('L', "i");
		char[] cs = sc.next().toCharArray();
		for (int i = 0; i < cs.length; i++) {
			if (i % 2 == 0) {
				if (cs[i] == '0' && cs[i + 1] == 'U') {
					System.out.print("");
				} else
					System.out.print(hash.get(cs[i]));
			} else {
				if (cs[i - 1] == '0' && cs[i] == 'U') {
					System.out.print("nn");
				} else
					System.out.print(hash.get(cs[i]));
			}
		}
		System.out.print("\n");
	}
}