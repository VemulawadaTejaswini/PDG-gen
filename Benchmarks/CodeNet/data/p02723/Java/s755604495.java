import java.util.Scanner;

// https://atcoder.jp/contests/abc160/tasks/abc1160_a
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		if((s.substring(2, 3).equals(s.substring(3, 4)))&&(s.substring(4, 5).equals(s.substring(5, 6)))) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}


	}
}
