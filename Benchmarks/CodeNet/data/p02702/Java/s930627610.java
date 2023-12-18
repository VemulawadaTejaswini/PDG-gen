import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	void run() {
		try (Scanner sc = new Scanner(System.in)) {
			String s = sc.next();
			int cnt = 0;

			BigInteger bi = new BigInteger("2019");

			for (int i = 0; i < s.length() - 1; i++) {
				for (int j = i + 3; j < s.length(); j++) {
					String ss = s.substring(i, j + 1);
					if (new BigInteger(ss).mod(bi).toString().equals("0")) {
						cnt++;
					}
				}
			}

			System.out.println(cnt);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
