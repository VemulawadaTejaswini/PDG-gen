package testProject;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int clause[] = new int[3];

		Scanner scanner = new Scanner(System.in);

		clause[0] = scanner.nextInt();
		clause[1] = scanner.nextInt();
		clause[2] = scanner.nextInt();

		scanner.close();

		int i;
		int count = 0;
		for (i = 0; i < 3; i++) {
			if (clause[i] != 5 || clause[i] != 7) {
				System.out.print("NO");
				return;
			}
			if (clause[i] == 7) {
				count++;
			}
		}
		if (count == 1) {
			System.out.print("YES");
		} else {
			System.out.print("NO");
		}
	}
}