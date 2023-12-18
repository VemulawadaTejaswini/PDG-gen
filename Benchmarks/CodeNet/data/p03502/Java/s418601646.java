import java.util.Scanner;

public class Main {
  
	public static void main(String[] args) {
		//宣言文
		//標準入力オブジェクトを生成
		Scanner sc = new Scanner(System.in);
		//標準入力で以下の変数を初期化
		int numberN = sc.nextInt();
		int numberSum =  digitSum(numberN);

		//標準出力 ハージャッド数ならば”YES”　違えば　”NO”
		if(numberN % numberSum  == 0) {
			System.out.print("YES");
		}else {
			System.out.print("NO");
		}
	}

	//標準入力Nを桁毎に合計し和を返す。
	public static int digitSum(int num) {
		int sum = 0;
		while(num > 0) {
			 sum += num % 10;
			 num /= 10;
		}
		return sum;
	}
}
