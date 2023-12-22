import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	void run() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		TreeSet<String> idSet = new TreeSet<String>();
		for (int i = 0; i < n; i++) {
			idSet.add(sc.next());
		}
		int m = sc.nextInt();
		int lock = 1;
		for (int i = 0; i < m; i++) {
			String s = sc.next();
			if (idSet.contains(s)) {
				if (lock == 1) {
					System.out.println("Opened by " + s);
					lock *= -1;
				} else {
					System.out.println("Closed by " + s);
					lock *= -1;
				}
			} else {
				System.out.println("Unknown " + s);
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}