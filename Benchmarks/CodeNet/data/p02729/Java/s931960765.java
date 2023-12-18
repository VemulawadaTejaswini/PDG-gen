import java.util.Scanner;

// https://atcoder.jp/contests/abc159/tasks/abc159_a
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();


		System.out.println(n*(n-1)/2+m*(m-1)/2);



	}
}
