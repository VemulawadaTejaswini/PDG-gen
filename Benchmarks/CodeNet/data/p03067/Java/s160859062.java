import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		int a = sc1.nextInt();
		int b = sc1.nextInt();
		int c = sc1.nextInt();

		if (a < c && c < b) {
			System.out.println("Yes");
		}
		else if(a > c && c > b ) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

		sc1.close();

	}

}