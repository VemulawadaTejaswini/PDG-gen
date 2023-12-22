import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		String lefts = "qwertasdfgzxcvb";
		for (String l = sc.next(); !l.equals("#"); l = sc.next()) {
			boolean left = lefts.indexOf(l.charAt(0)) >= 0;
			int ans = 0;
			for (char c : l.toCharArray()) {
				boolean nl = lefts.indexOf(c) >= 0;
				if (left != nl) ++ans;
				left = nl;
			}
			System.out.println(ans);
		}
	}

}