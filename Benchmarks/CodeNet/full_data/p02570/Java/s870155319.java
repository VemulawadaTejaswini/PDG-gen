import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scannerS = new Scanner(System.in);

		int D = scannerS.nextInt();
		int T = scannerS.nextInt();
		int S = scannerS.nextInt();

		float t;
		t = (float)D /(float)S;

		if (t <= T) {

			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}