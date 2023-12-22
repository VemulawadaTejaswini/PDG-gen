import java.util.Scanner;

// https://atcoder.jp/contests/abc165/tasks/abc165_c
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		sc.close();

		int x = b-1;
		if(x>n) {
			x = n;
		}



		System.out.println(a*x/b-a*(x/b));


	}
}
