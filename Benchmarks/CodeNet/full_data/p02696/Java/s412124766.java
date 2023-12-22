import java.util.Scanner;

// https://atcoder.jp/contests/abc165/tasks/abc165_c
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long n = sc.nextLong();
		sc.close();


		long x = b-1L;
		if(x>n) {
			x = n;
		}


		System.out.println(a*x/b-a*(x/b));


	}
}
