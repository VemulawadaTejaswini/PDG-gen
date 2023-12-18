import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		if(dp(x)) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}
	public static Boolean dp(int x) {
		if(	x == 100 ||
			x == 101 ||
			x == 102 ||
			x == 103 ||
			x == 104 ||
			x == 105 ||
			x % 100 == 0 ||
			x % 101 == 0 ||
			x % 102 == 0 ||
			x % 103 == 0 ||
			x % 104 == 0 ||
			x % 105 == 0 ||
			x >= 2000
			) {
			return true;
		}else if(x < 100) {
			return false;
		}else {
			return (dp(x-105) ||
					dp(x-104) ||
					dp(x-103) ||
					dp(x-102) ||
					dp(x-101) ||
					dp(x-100)
					);
		}
	}
}
