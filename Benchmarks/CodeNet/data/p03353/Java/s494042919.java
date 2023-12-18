import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner((System.in));
		String s = sc.next();
		int K = sc.nextInt();
		String ans = "";
		ArrayList<String> a = new ArrayList<String>();

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {
				a.add(s.substring(i, j));
			}
		}

		Collections.sort(a);
		for (String str : a) {
			if (!ans.equals(str)) {
				ans = str;
				K--;
				if (K == 0) {
					break;
				}
			}
		}

		System.out.println(ans);

		sc.close();
	}
}
