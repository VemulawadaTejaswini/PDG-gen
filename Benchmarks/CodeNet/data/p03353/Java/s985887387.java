import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		int k = scanner.nextInt();
		Set<String> set = new TreeSet<>();

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < i + 1 + k; j++) {
				if (j <= s.length()) {
					String str = s.substring(i, j);
					set.add(str);
				}
			}
		}

		int cnt = 1;
		for (String tmp : set) {
			if (cnt == k) {
				System.out.println(tmp);
			}
			cnt++;
		}

	}
}
