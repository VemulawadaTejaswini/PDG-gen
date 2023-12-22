import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int money = 100;
		for (int i = 0; i < n; i++) {
			money = (int) Math.ceil(money * 1.05);
		}
		System.out.println(money * 1000);
	}
}