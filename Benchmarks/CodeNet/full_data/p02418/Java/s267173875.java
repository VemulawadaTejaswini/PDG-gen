import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String p = sc.next();
		printIsString(s, p);
	}

	private static void printIsString(String s, String p) {
		String S = s + s;
		Pattern pa = Pattern.compile(p);
		Matcher m = pa.matcher(S);
		if (m.find()) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}