import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int sum = 0;

			char[] num = sc.next().toCharArray();

			if (num[0] == '0') {
				break;
			}

			for (int i = 0; i < num.length; i++) {
				int n = Character.getNumericValue(num[i]);
				sum += n;
			}
			System.out.println(sum);
		}

	}
}
