import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		(new Main()).execute();
	}
	public void execute() { ;
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int X = sc.nextInt();

		int D = 0 ;
		int ans = 0 ;
		for(int i = 0 ; i < N; i ++) {
			ans ++ ;
			int L = sc.nextInt();
			D = D + L ;
			if(D > X) {
				break ;
			}
		}

		System.out.println(ans);
	}

}
