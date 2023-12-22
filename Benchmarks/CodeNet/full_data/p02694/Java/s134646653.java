import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long money = 100L;
		int year = 0;
		while (money < x) {
			money = (long) (money * 1.01);
			++year;
		}
		System.out.println(year);
	}

}
