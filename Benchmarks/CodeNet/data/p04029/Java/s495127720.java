

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = 0;

		for (int i = 1; i <= a; i++) {

			b += i;

		}
		System.out.println(b);

	}

}
