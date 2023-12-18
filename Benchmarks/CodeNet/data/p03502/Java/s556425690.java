import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();   //標準入力
		String Ns = Integer.toString(N) ;   //IntをStringに変換する

		int fx = 0;   //合計を初期化
		String ans = "No" ;   //解答の出力

		for(int i = 0; i < Ns.length(); i++) {   //リストの中身を合計する
			fx += Integer.parseInt(Ns.substring(i, i + 1));   //NsをStringからIntに変換する
		}

		if ( N % fx == 0 ) {
			ans = "Yes" ;
		}
		System.out.println(ans);
	}
}
