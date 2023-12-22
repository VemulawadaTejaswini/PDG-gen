import java.util.Scanner;

// https://atcoder.jp/contests/abc164/tasks/abc164_b
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		sc.close();


		while(true) {
			c = c - b;
			if(c<=0) {
				System.out.println("Yes");
				return;
			}
			a = a - d;
			if(a<=0) {
				System.out.println("No");
				return;
			}

		}
	}
}
