import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 初期化
		String search_moji="AC";
		
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] line_list = line.split(" ");
		int n = Integer.parseInt(line_list[0]);
		int q = Integer.parseInt(line_list[1]);
		String moji_data = sc.nextLine();
		
		for(int i=0;i<q;i++) {
			// 開始位置、終了位置の取得
			String[] start_end = sc.nextLine().split(" ");
			int start = Integer.parseInt(start_end[0]);
			int end = Integer.parseInt(start_end[1]);
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