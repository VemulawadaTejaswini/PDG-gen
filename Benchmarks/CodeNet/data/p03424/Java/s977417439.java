import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			String arare = sc.next();
			if (arare.equals("Y")) {
				System.out.println("Four");
				return;
			}

		}
		System.out.println("Three");

	}

}
