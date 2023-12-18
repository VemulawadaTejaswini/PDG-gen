import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.next();

		String ans = "";

		int left = Integer.parseInt(S.substring(0,2));
		int right = Integer.parseInt(S.substring(2,4));

		if (S.charAt(0)=='0' && S.charAt(1)=='0' || S.charAt(2)=='0' && S.charAt(3)=='0') {
			ans = "NA";
		} else if (left>12 && right>12) {
			ans = "NA";
		} else if (left>12 && right<=12) {
			ans = "YYMM";
		} else if (right>12 && left<=12) {
			ans = "MMYY";
		} else {
			ans = "AMBIGUOUS";
		}

		System.out.println(ans);
	}

}