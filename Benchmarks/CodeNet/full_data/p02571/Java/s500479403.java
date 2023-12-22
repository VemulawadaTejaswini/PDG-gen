import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();

		int max = 0;
		for (int i = 0; i < t.length(); i++) {
			String tmp = t.substring(i);
			if (s.indexOf(tmp) != -1) max = Math.max(max, tmp.length());
		}

		s = new StringBuilder(s).reverse().toString();
		t = new StringBuilder(t).reverse().toString();
		for (int i = 0; i < t.length(); i++) {
			String tmp = t.substring(i);
			if (s.indexOf(tmp) != -1) max = Math.max(max, tmp.length());
		}

		System.out.println(t.length() - max);

		sc.close();

	}

}