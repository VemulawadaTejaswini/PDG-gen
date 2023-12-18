import java.util.Scanner;

// https://atcoder.jp/contests/abc163/tasks/abc163_b
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int flag = 0;
		for(int i=0;i<m;i++) {
			flag = flag + sc.nextInt();
		}
		sc.close();

		if(n==flag) {
			System.out.println(0);
		} else if(n>flag) {
			System.out.println(n-flag);
		}else {
			System.out.println(-1);
		}



	}
}
