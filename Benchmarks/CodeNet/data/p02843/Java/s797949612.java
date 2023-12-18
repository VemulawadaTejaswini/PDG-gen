import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int num = X;

		if (X < 100) {
			System.out.println(0);
			return;
		}

		int X1 = Character.getNumericValue(String.valueOf(X).charAt((String.valueOf(X).length() - 1)));
		int X2 = Character.getNumericValue(String.valueOf(X).charAt((String.valueOf(X).length() - 2)));

		if (6 <= X1 && X1 <= 9) {
			num -= 200 + X1;
		} else {
			num -= 100 + X1;
		}

		for (int i = 1; i <= X2; i++) {
			num = num - (200 * i + 10 * i);
		}

		if (num < 0) {
			System.out.println(0);
		} else if (num % 100 == 0){
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
