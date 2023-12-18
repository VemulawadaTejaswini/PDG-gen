

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

		if (AA <= 12 || BB <=12 && AA > 0 && BB > 0 ) {
			ans = "AMBIGUOUS";
		}
		if (AA <= 12  && AA > 0 && BB > 0) {
			ans = "MMYY";
		}
		if (BB <= 12 && AA > 0 && BB > 0) {
			ans = "YYMM";
		}
		

		if(ans.equals("")) {
			ans = "NA";
		}

		System.out.println(ans);

	}

}
