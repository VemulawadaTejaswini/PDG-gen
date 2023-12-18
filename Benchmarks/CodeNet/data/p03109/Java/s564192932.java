import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int year, month, day;
		String ans = "Heisei";
		Scanner sc = new Scanner(System.in);

		year = sc.nextInt();
		month = sc.nextInt();
		day = sc.nextInt();

		if(year >= 2019) {
			if(month >= 5) {
				ans = "TBD";
			}
		}

		System.out.println(ans);

		sc.close();
	}

}