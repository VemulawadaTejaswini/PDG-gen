import java.util.Scanner;

// https://atcoder.jp/contests/abc154/tasks/abc154_a
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		int a = sc.nextInt();
		int b = sc.nextInt();
		String u = sc.next();
		sc.close();

		if(s.equals(u)) {
			a = a - 1;
		}else {
			b = b - 1;
		}
		System.out.println(a + " " + b);
	}

}
