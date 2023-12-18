import java.util.Scanner;

// https://atcoder.jp/contests/panasonic2020/tasks/panasonic2020_ab
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		long H = sc.nextInt();
		long W = sc.nextInt();
		sc.close();

		if(H*W%2==0) {
			System.out.println(H*W/2);
		}else {
			System.out.println(H*W/2+1);
		}


	}
}
