import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char[] chars = s.toCharArray();
		sc.close();

		System.out.print(chars[2] == chars[3] && chars[4] == chars[5] ? "Yes" : "No");
	}
}
