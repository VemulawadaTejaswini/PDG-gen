import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] s = new String[n];
		int[] t = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {

			s[i] = scanner.next();
			sum += scanner.nextInt();
			t[i] = sum;
		}
		String x = scanner.next();
		for (int i = 0; i < n; i++) {
			if (s[i].equals(x)) {
				System.out.println(sum - t[i]);
				return;
			}
		}
	}

}
