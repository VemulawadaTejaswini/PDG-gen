import java.util.Scanner;

public class Main {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		//標準入力取得
		int windowLength = sc.nextInt();
		int curtainLength = sc.nextInt();

		System.out.println(Math.min(0, windowLength - curtainLength * 2));

		sc.close();
	}
}
