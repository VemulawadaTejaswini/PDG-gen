
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		new Main().run();
	}

	private void run() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int n = scanner.nextInt();
			if (n == 0)
				break;
			int[] age = new int[7];
			for (int i = 0; i < n; i++) {
				int a = scanner.nextInt();
				if (a < 10)
					age[0]++;
				else if (a < 20)
					age[1]++;
				else if (a < 30)
					age[2]++;
				else if (a < 40)
					age[3]++;
				else if (a < 50)
					age[4]++;
				else if (a < 60)
					age[5]++;
				else
					age[6]++;
			}
			for (int t : age)
				System.out.println(t);
		}

	}
}