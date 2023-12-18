import java.util.Scanner;

// https://atcoder.jp/contests/abc162/tasks/abc162_b
public class AtCoderBeginnerContest162_B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();


		long ans = 0L;
		for(int i =1;i<=n;i++) {
			if(!(i%3==0||i%5==0)) {
				ans = ans + i;
			}
		}

		System.out.println(ans);
	}
}
