import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int cubeSize = S.length();

		Pattern p = Pattern.compile("01|01");

		while (true) {
			S = p.matcher(S).replaceAll("");
			if (!p.matcher(S).find()) {
				break;
			}
		}

		System.out.println(cubeSize - S.length());
	}
}