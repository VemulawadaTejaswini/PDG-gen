
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int[] abcd = new int[4];

		for (int i = 0; i < 4; i++) {
			abcd[i] = sc.nextInt();
		}

		int count = 0;

		for (int i = 0; i < 2; i++) {
			int m = abcd[i + 1] - abcd[i];
			if (Math.abs(m) <= abcd[3]) {
				count++;
			}
		}

		if (count == 2)
			System.out.println("YES");

		sc.close();

	}

}
