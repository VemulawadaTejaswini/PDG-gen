

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		double det = 100;
		int i;
		double sum = det;
		for(i = 0; i < n; i++) {
			sum = Math.ceil(sum * 1.05);
		}
		System.out.println((int)sum * 1000);

		scanner.close();
	}

}

