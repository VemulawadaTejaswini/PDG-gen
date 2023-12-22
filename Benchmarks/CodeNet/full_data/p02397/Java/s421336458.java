import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3000; i++) {

			String line = sc.nextLine();
			String[] kazu = line.split(" ");
			int x = Integer.parseInt(kazu[0]);
			int y = Integer.parseInt(kazu[1]);
			if (x == y && x == 0) {
				break;
			} else if (x < y) {
				System.out.println(x + " " + y);

			} else if (y < x) {
				System.out.println(y + " " + x);

			}

		}

	}

}

