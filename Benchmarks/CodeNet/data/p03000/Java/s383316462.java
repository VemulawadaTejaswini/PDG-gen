import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] arrayL = new int[N];

		for (int i = 0; i < arrayL.length; i++) {
			arrayL[i] = sc.nextInt();
		}

		// 座標
		int coordinate = 0;
		// X内でバウンドした回数
		int counter = 0;

		for (int i = 0; i < arrayL.length; i++) {
			if (i == 0) {
				counter++;
				continue;
			}

			coordinate += arrayL[i];

			if (X < coordinate) {
				break;
			}

			counter++;
		}

		System.out.println(counter);
		sc.close();
	}

}
