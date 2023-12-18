import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	void run() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			Set<String> set = new HashSet<String>();
			for (int i = 0; i < n; i++) {
				set.add(sc.next());
			}

			System.out.println(set.size());
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
