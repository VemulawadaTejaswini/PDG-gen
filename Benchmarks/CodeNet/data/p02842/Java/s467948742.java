import java.util.Scanner;

// https://atcoder.jp/contests/sumitrust2019/tasks/sumitb2019_b
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();


		for(int i=0;i<50000;i++) {
			int a = (int) (i*1.08);
			if(a==n) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(":(");
	}
}
