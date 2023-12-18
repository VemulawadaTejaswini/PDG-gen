import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		String st = s + t;
		int count = 0;
		if (s.length() != t.length() - 1) {
			count++;

		}
		char[] s1 = s.toCharArray();
		char[] t1 = t.toCharArray();
		for (int i = 0; i < s1.length; i++) {
			if (s1[i] != t1[i]) {
				count++;
			}
		}

		if (count == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
