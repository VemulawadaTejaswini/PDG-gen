import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		char c;
		StringBuilder sb = new StringBuilder();
		for (int i =0; i < str.length(); i++) {
			c = str.charAt(i);
			if (Character.isUpperCase(c)) {
				c = Character.toLowerCase(c);
			} else if (Character.isLowerCase(c)) {
				c = Character.toUpperCase(c);
			}
			sb.append(c);
		}
		System.out.println(sb);
	}
}