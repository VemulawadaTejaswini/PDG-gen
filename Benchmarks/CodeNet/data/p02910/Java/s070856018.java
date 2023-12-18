import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		char[] chars = n.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == (i % 2 == 0 ? 'L' : 'R')) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}