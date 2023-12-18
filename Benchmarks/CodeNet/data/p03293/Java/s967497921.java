import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		for(int i=0;i<200;i++) {
			if (s.equals(t)) {
				System.out.println("Yes");
				return;
			}
			s = rotate(s);
		}
		System.out.println("No");
	}

	public static String rotate(String s) {
		return s.substring(s.length() - 1) + s.substring(0, s.length() - 1);
	}
}
