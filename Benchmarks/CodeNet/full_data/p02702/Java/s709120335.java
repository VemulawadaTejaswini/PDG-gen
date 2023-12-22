import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		int count = 0;
		for (int i = 0; i <= text.length(); i++) {
			for (int j = i + 3; j <= text.length(); j++) {
				long num = Long.parseLong(text.substring(i, j));
				if (num % 2019 == 0) {
					count++;
				}
			}
		}

		System.out.println(count);

	}

}
