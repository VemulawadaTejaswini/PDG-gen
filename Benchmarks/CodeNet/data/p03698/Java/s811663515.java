import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String str = reader.next();
		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			set.add(ch);
		}
		String ans = "yes";
		if (set.size() != str.length()) {
			ans = "no";
		}

		System.out.println(ans);
		reader.close();

	}
}