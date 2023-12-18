

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			int n = scanner.nextInt();

			Main testB = new Main();
			System.out.println(testB.unevenNumbers(n));

			scanner.close();

		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("整数を入力してください");
		}
	}


	public int unevenNumbers(int n){
		if (n < 10) {
			return n;
		} else if (n < 100){
			return 9;
		} else if (n < 1000) {
			return n - 90;
		} else if (n < 10000) {
			return 909;
		} else if (n < 100000) {
			return n - 9090;
		} else {
			return 90909;
		}
	}

}

