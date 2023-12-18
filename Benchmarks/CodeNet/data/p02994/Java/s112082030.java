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
		int L = sc.nextInt();


		//作る予定だったアップルパイの味
		int aji1 = 0 ;
		int eat = N + L ;
		for( int i = 1 ; i <= N ; i ++) {
			int aji = 0 ;
			if(i == 0) {
				aji = L ;
			}else {
				aji = (L + i - 1);
			}
			aji1 += aji ;

			int abs = Math.abs(aji) ;
			if(abs < Math.abs(eat)) {
				eat = aji ;
			}
		}

		//出来上がるアップルパイの味
		int aji2 = aji1 - eat ;
		System.out.println(aji2);
	}

}
