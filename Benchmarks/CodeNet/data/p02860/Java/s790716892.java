import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		// 入力読み込み
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		String S = scan.next();
		// 入力終わり
		scan.close();
		// 結果出力用変数
		String result = "No";
		// 文字列が偶数か奇数かで分岐
		if(N%2==0){
			// 文字列を半分まで切り出す
			String tmp = null;
			tmp = S.substring(0,N/2);
			// 文字が一致するか比較
			if(S.equals(tmp+tmp)){
				result = "Yes";
			}
		}
		// 結果出力
		System.out.println(result);
	}
}