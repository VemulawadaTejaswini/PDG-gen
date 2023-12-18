import java.util.Scanner;

// https://atcoder.jp/contests/abc165/tasks/abc165_b
public class AtCoderBeginnerContest165_B {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		float x = sc.nextFloat();
		sc.close();


		int ans = 1;
		float a = 100L;
		for(int i=1;a<x;i++) {
			a = (float)(a * 1.01);
			a = (float) Math.floor(a);
			ans = i;
		}
		System.out.println(ans);
	}
}
