
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Set<String> set = new HashSet<String>();
		while (n-- > 0) {
			String a = scanner.next();
			String b = scanner.next();
			if (a.equals("insert")) {
				set.add(b);
			} else {
				System.out.println(set.contains(b) ? "yes" : "no");
			}
		}
	}
}