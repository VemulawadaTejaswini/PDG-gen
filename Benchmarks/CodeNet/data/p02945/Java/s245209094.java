

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			int a = scanner.nextInt();
			int b = scanner.nextInt();

			Main testA = new Main();
			System.out.println(testA.plus(a, b));

			scanner.close();

		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("整数を入力してください");
		}
	}

	public int plus(int a, int b) {
		if(a+b >= a-b) {
			if(a+b >= a*b) {
				return a+b;
			}else {
				return a*b;
			}
		}else {
			if(a-b > a*b) {
				return a-b;
			}else {
				return a*b;
			}
		}
	}


}

