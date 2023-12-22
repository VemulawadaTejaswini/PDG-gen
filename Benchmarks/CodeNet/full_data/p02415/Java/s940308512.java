import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//字符串中大小写转换，字母之外不用管
public class Main {
	public static String togglingCases(String input) {
		List<Character> lc = new ArrayList<>();
		String chg = "";
		for (int i = 0; i < input.length(); ++i) {
			char ch = input.charAt(i);
			if (Character.isLetter(ch)) {
				if (Character.isUpperCase(ch))
					ch = Character.toLowerCase(ch);
				else
					ch = Character.toUpperCase(ch);
			}
			chg += String.valueOf(ch);
		}
		return chg;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		String chg = togglingCases(input);
		System.out.println(chg);
	}
}

