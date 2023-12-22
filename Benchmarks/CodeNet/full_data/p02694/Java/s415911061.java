import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long money = 100L;
		int year = 0;
		while (money < x) {
			money += money / 100L;
			++year;
		}
		System.out.println(year);
	}

}
