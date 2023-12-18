import java.util.Scanner;

// https://atcoder.jp/contests/abc164/tasks/abc164_c
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int w = sc.nextInt();
		sc.close();

		if(w>=s) {
			System.out.println("unsafe");
		}else {
			System.out.println("safe");
		}


	}
}
