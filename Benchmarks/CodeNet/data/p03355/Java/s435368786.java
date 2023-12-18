import java.util.Scanner;

public class Main {

	String s;
	int k, cnt;

	void run() {
		try (Scanner sc = new Scanner(System.in)) {
			s = sc.next();
			k = sc.nextInt();
			System.out.println(fnc(""));
		}
	}

	String fnc(String str) {
		for (int i = 97; i <= 122; i++) {
			String next = str + (char) i;
			if (s.contains(next)) {
				cnt++;
				if (cnt == k) {
					return next;
				}

				String tmp = fnc(next);
				if (!tmp.equals("")) {
					return tmp;
				}
			}
		}

		return "";
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
