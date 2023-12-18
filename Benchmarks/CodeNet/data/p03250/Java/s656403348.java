import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int x[] = new int[3];
		for (int i = 0; i < x.length; i++) {
			x[i] = sc.nextInt();
		}

		int tmp = 0;
		int max = 0;
		for (int i = 0; i < 3; i++) {
			tmp = 0;
			for (int j = 0; j < x.length; j++) {
				if (i == j) {
					tmp += x[j] * 10;
				} else {
					tmp += x[j];
				}
			}

			max = Math.max(tmp, max);
		}

		System.out.println(max);
	}
}