import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int x = sc.nextInt();
			int sum = 0;
			String str = String.valueOf(x);
			char[] str1 = str.toCharArray();
			for (int i = 0; i < str1.length; i++) {
				sum += Character.getNumericValue(str1[i]);
			}

			if (x == 0) {
				break;
			}
			System.out.println(sum);
		}

	}

}