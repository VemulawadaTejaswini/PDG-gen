import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String s = sc.next();
		String t = sc.next();

		for(int i = 0; i < s.length(); i++) {
			if(s.equals(t)) {
				System.out.println("Yes");
				return;
			}
			s = rotate(s);
		}
		System.out.println("No");
    }

	static String rotate(String str) {
		return str.substring(1) + str.charAt(0);
	}
}
