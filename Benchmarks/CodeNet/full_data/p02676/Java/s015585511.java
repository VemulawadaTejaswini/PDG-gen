import java.util.Scanner;

// https://atcoder.jp/contests/abc168/tasks/abc168_b
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String s = sc.next();
		sc.close();

		if(k>=s.length()) {
			System.out.println(s);
		}else {
			System.out.println(s.substring(0, k)+"...");
		}


	}
}
