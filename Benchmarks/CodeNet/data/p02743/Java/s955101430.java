import java.util.Scanner;

// https://atcoder.jp/contests/panasonic2020/tasks/panasonic2020_c
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.close();

		if(Math.sqrt(a)+Math.sqrt(b)<Math.sqrt(c)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}
