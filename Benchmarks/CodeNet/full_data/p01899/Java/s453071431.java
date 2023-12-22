import java.util.Scanner;

public class Main {

	void run() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = Integer.parseInt(sc.next());
			int d = Integer.parseInt(sc.next());
			int sum = 0;
			for (int i = 0; i < n; i++) {
				int p = Integer.parseInt(sc.next());
				if (p > d) {
					sum += (p - d);
				}
			}
			if(sum == 0) {
				System.out.println("kusoge");
			} else {
				System.out.println(sum);
			}
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}
}