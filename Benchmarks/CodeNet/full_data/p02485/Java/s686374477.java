import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			char c;
			int sum = 0;
			int num = sc.nextInt();
			String str = String.valueOf(num);

			if (num == 0)
				break;

			for (int i = 0; i < str.length(); i++) {
				c = str.charAt(i);
				sum += c - '0';
			}
			System.out.println(sum);
		}
	}
}