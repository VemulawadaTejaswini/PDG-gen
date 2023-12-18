import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = Integer.parseInt(sc.next());
		String str = sc.next();
		int len = str.length();
		char[] color = new char[len];
		int count = 1;

		for (int i = 0; i < len; i++) {
			color[i] = str.charAt(i);
		}

		for (int i = 0; i < len - 1; i++) {
			if (color[i] != color[i + 1]) {
				count++;
			}
		}
		System.out.println(count);

	}
}
