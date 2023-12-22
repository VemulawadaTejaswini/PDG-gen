
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
			int[] num = new int[n + 1];
			for (int i = 0; i <= n; i++) {
				num[i] = scanner.nextInt();
			}
			int sa = num[1] - num[0];
			int index = 0;
			for (int i = 1; i < n; i++) {
				if (num[i + 1] - num[i] != sa) {
					index = i + 1;
					break;
				}
			}
			if (index != 2)
				System.out.println(num[index]);
			else {
				if (num[3] - num[2] == num[2] - num[0])
					System.out.println(num[1]);
				else if(num[3]-num[1]==sa)
					System.out.println(num[2]);
				else
					System.out.println(num[0]);
			}
		}
	}
}