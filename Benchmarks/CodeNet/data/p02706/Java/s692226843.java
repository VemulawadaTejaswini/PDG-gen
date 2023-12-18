import java.util.Scanner;

public class Main {

	void run() {
		try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			for (int i=0;i<m;i++) {
				n -= sc.nextInt();
			}
			
			System.out.println(n < 0 ? -1 : n);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

}
