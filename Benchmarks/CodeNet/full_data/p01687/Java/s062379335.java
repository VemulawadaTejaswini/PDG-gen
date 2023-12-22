import java.util.Arrays;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Main().run();
	}

	void run() {
		String D;
		D = sc.next();
		String aizu = "AIZUNYAN";
		StringBuilder sb = new StringBuilder();
		int len = D.length();
		for (int i = 0; i < len; i++) {
			if (i + aizu.length() <= len
					&& isAna(D.substring(i, i + aizu.length()))) {
				sb.append(aizu);
				i += aizu.length() - 1;
			} else {
				sb.append(D.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}

	boolean isAna(String s) {
		char cs[] = s.toCharArray();
		Arrays.sort(cs);
		char aidu[] = "AIDUNYAN".toCharArray();
		Arrays.sort(aidu);
		if (cs.length != aidu.length)
			return false;
		for (int i = 0; i < cs.length; i++) {
			if (cs[i] != aidu[i])
				return false;
		}
		return true;
	}
}