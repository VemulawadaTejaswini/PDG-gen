import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		long K = in.nextLong();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) != '1') {
				sb.append(S.charAt(i));
				break;
			}
		}
		System.out.println(sb.length() > K ? sb.charAt((int) K - 1) : S.replace("1", "").charAt(0));
		in.close();
	}
}