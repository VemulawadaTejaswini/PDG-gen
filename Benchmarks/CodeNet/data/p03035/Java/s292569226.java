

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner  = new Scanner(System.in);
		final var r = scanner.nextInt();
		final var D = scanner.nextInt();
		var x = scanner.nextInt();
		for(int i = 0; i < 10; i++) {
			x =  r * x - D;
			System.out.println(x);
		}
		scanner.close();
	}

}
