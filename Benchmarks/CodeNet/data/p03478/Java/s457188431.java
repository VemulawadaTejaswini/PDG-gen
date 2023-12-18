import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int sumOfSum = 0;
		for (int i = 0; i <= n; i++) {
			String s = String.valueOf(i);
			int sum = 0;
			for (int j = 0; j < s.length(); j++) {
				sum += Integer.valueOf(s.charAt(j));
			}

			if (a <= sum && sum <= b) {
				sumOfSum += sum;
			}
		}
		
		System.out.println(sumOfSum);

		scanner.close();
	}
}