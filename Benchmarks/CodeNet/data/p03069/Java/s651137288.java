import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int count = 0;
		String[] array = S.split("");

		if (array.length == 1) {
			System.out.println(0);
			System.exit(0);
		}

		for (int i = 0; i < array.length - 1; i++) {
			if (array[i].equals("#")) {
				if (array[i + 1].equals(".")) {
					array[i + 1] = "#";
					count++;
				}
			}

			if (array[i].equals(".")) {
				if (array[i + 1].equals("#")) {
					array[i] = "#";
					count++;
				}

			}

		}

		System.out.println(count);
	}

}
