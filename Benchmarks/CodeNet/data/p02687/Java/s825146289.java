import java.util.Scanner;

public class Main {

	static final String s1 = "ABC";
	static final String s2 = "ARC";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if (s.equals(s1)) {
			System.out.println(s2);
		} else {
			System.out.println(s1);
		}

	}

}
