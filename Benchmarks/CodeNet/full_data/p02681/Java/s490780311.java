import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String inputId = sc.nextLine();
		String inputAddId = sc.nextLine();

		int flag = 0;

		for (int i = 0; i < inputId.length(); i++) {

			if (inputId.charAt(i) != inputAddId.charAt(i)) {
				flag++;
			}
		}

		if (flag == 0 && (inputAddId.length() - inputId.length() == 1)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

		sc.close();

	}
}
