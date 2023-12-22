import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int X = scan.nextInt();
		int T = scan.nextInt();

		int ans = 0;
		if(X > N || X == N) {
			ans = T;
		}else {
			int ks = 1; //たこ焼き焼く回数
			int nokori = N - X;
			int i = 0;
			while(nokori > 0) {
				ks = ks + 1;
				nokori = nokori - X;
				i++;
			}

			ans = T * ks;
		}

		System.out.println(ans);

	}

}