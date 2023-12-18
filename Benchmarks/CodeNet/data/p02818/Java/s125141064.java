import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);

		double tCookie = scan.nextDouble();
		double aCookie = scan.nextDouble();
		double count = scan.nextDouble();
		scan.close();

		if (count <= tCookie) {
			tCookie -= count;
			System.out.println(tCookie + " " + aCookie);
			return;
		}

		if (tCookie + aCookie <= count) {
			System.out.println("0 0");
		}

		System.out.println("0 " + (aCookie - count));
	}

}