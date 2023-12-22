import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int X = scanner.nextInt();
		int Y = scanner.nextInt();
		int leg_turtol = 4;
		int leg_crane = 2;

		int turtol = (Y - (leg_crane * X)) / (leg_turtol - leg_crane);
		int crane = X - turtol;

		if (turtol >= 0 && crane >= 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

//		System.out.println(turtol);;
//		System.out.println(crane);;

	}

}
