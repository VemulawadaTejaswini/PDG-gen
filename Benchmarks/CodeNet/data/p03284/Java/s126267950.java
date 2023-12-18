import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		while (sc.hasNext()) {
			double N = sc.nextDouble();
			double K = sc.nextDouble();

			if (N%K == 0) {
				System.out.println(0);
			} else {
				System.out.println(1);
			}
		}
	}

}
