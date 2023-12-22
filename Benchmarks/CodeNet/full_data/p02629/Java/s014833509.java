import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			long no = scan.nextLong();
			System.out.print(to26Str(no));
		}
	}

	static final char[] chars = "zabcdefghijklmnopqrstuvwxy".toCharArray();

	public static String to26Str(long no) {
		StringBuilder sb = new StringBuilder();

		while(0L < no) {
			int digit = (int)(no % chars.length);
			sb.append(chars[digit]);
			no /= chars.length;
		}

		return sb.reverse().toString();
	}
}