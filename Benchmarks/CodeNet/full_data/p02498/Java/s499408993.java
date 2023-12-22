import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		String msg = in.nextLine();

		char d = 'a' - 'A';
		StringBuilder sb = new StringBuilder(msg.length());
		for (char c : msg.toCharArray()) {
			if ('a' <= c && c <= 'z') {
				sb.append((char) (c - d));
			} else if ('A' <= c && c <= 'Z') {
				sb.append((char) (c + d));
			} else {
				sb.append(c);
			}
		}
		System.out.println(sb);
	}
}