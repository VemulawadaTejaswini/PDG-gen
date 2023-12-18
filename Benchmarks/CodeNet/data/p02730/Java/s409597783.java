import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s1 = in.next();
		String sFirst = s1.substring(0, (s1.length() - 1) / 2);
		String sSecond = s1.substring((s1.length() + 1) / 2, s1.length());
		char[] c1 = s1.toCharArray();
		char[] c2 = new char[s1.length()];
		for (int i = 0; i < s1.length(); i++) {
			c2[i] = c1[(s1.length() - 1) - i];
		}
		String s2 = String.valueOf(c2);
		
		System.out.println(s1.equals(s2) && sFirst.equals(sSecond) ? "Yes" : "No");
	}
}	