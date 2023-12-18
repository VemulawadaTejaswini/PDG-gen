import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String s = scanner.next();

		int max = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			char target = s.charAt(i);
			if (target == 'I') {
				sum++;
			} else {
				sum--;
			}
			max = Math.max(max, sum);
		}

		System.out.println(max);
	}
}