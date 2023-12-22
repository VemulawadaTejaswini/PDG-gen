import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String res = "";
		String s = sc.next();
		String t = sc.next();

		if (t.startsWith(s) && t.length()-1 == s.length()) {
			res = "Yes";
		} else {
			res = "No";
		}

		System.out.println(res);
	}
}
