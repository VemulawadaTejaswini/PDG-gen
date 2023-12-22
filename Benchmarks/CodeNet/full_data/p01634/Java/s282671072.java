import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(solve(sc.next()) ? "VALID" : "INVALID");
	}

	static boolean solve(String s) {
		if (s.length() < 6) return false;
		int r = 0;
		for (char c : s.toCharArray()) {
			if (Character.isDigit(c)) r |= 1;
			if (Character.isUpperCase(c)) r |= 2;
			if (Character.isLowerCase(c)) r |= 4;
		}
		return r == 7;
	}

}