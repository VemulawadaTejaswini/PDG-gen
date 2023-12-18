
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			String tmp = sc.nextLine();
			HashSet<String> w = new HashSet<>();
			String last = null;

			for (int i = 0; i < n; i++) {
				tmp = sc.nextLine();
				if (w.contains(tmp)) {
					System.out.println("No");
					return;
				}
				w.add(tmp);
				String first = tmp.substring(0, 1);
				if (last != null && !last.equals(first)) {
					System.out.println("No");
					return;
				}
				last = tmp.substring(tmp.length() - 1);
			}


			System.out.println("Yes");
		}
	}
}
