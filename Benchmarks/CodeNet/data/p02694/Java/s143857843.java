import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int money = 100;
		int year = 0;
		sc.close();

		while (money < x) {
			money *= 1.01;
			year ++;
		}
		System.out.println(year);

	}

}