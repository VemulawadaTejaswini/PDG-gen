import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();

		if (!s.startsWith("A")) {
			System.out.println("WA");
			return;
		}

		int cindex = -1;
		String ss = s.substring(2, s.length() - 1);
		for (int i = 0; i < ss.length(); i++) {
			if (ss.charAt(i) == 'C') {
				if (cindex == -1) {
					cindex = i + 2;
				} else {
					System.out.println("WA");
					return;
				}
			}
		}

		if (cindex == -1) {
			System.out.println("WA");
			return;
		}
		boolean flag = false;

		for (int i = 0; i < s.length(); i++) {
			if (i == 0 || i == cindex)
				continue;
			if (s.charAt(i) < 'a' || 'z' < s.charAt(i)) {
				flag = true;
			}
		}

		System.out.println(flag ? "WA" : "AC");

	}

}