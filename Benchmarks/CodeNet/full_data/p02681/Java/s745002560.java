import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String res = "";
		String s = sc.next();
		String t = sc.next();

		if (t.startsWith(s) && t.length()-1 == s.length()) {
			res = "true";
		} else 
			res = "false";
	}

		System.out.printf("%d", res);
}
