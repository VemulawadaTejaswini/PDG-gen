import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		Set<String> insert = new HashSet<>();
		for (int i = 0; i < m; i++) {
			String in = sc.next();
			String input = sc.next();
			if (in.equals("insert")) {
				insert.add(input);
			}
			if (in.equals("find")) {
				if (insert.contains(input)) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}

		}
	}
}

