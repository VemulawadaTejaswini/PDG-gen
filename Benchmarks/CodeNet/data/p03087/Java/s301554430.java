import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 初期化
		String search_moji="AC";
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String moji_data = sc.next();
		
		for(int i=0;i<q;i++) {
			// 開始位置、終了位置の取得
			int start = sc.nextInt();
			int end = sc.nextInt();
			// 切り出し文字の取得
			String moji_substr = moji_data.substring(start-1,end);
			// 入力文字
			int moji_size=moji_substr.length();
			// 置換文字
			int replace_size=moji_substr.replace(search_moji, "").length();
			
			// 文字の件数の取得
			int taisyou_moji_num = (moji_size-replace_size)/search_moji.length();
			
			// 値の出力
			System.out.println(taisyou_moji_num);
		}
	}
}