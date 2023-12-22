import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Set<String> set = new HashSet<String>();
		for (int n = s.nextInt(); n-- > 0;) {
			set.add(s.next());
		}
		for (int m = s.nextInt(), b = 0; m-- > 0;) {
			String id = s.next();
			System.out.println((!set.contains(id) ? "Unknown "
					: b++ % 2 < 1 ? "Opened by " : "Closed by ")
					+ id);
		}

	}
}