

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		long A = scan.nextLong();
		long B = (long) (scan.nextDouble()*100.0);

//		B = B;
		long ans = (long) (A*B);
		ans = ans / 100L;
		System.out.println(ans);
	}
}