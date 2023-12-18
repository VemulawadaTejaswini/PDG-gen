

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String aaaa = sc.nextLine();
		int AA = 0;
		int BB = 0;
		String ans = "";

		AA = Integer.parseInt(aaaa.substring(0, 2));
		BB = Integer.parseInt(aaaa.substring(2, 4));

		if (AA > 12 && BB > 12) {
			ans = "NA";
		}
		if (AA <= 12 && BB > 12) {
			ans = "MMYY";
		}
		if (AA > 12 && BB <= 12) {
			ans = "YYMM";
		}
		if (AA <= 12 && BB <=12) {
			ans = "AMBIGUOUS";
		}

		System.out.println(ans);

	}

}
