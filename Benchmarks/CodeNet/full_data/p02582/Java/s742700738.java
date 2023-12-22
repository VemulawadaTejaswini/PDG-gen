import java.util.Scanner;

// 提出時にclass Main に書き換え
public class Main {
	public static void main(String[] args)  {
		// 標準入力を受け取る
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine(); // String Sを受け取る
		sc.close(); // 標準入力を終了



		int r = 0; // 連続した雨の日数
		int rm = 0; // 連続した雨の日数(最大値)

		while(S.length() > 0) {
			if(S.startsWith("R")) {
				r += 1; // 連続した雨の日数を加算
			} else {
				r = 0; // 連続した雨の日数を加算
			}
			// 最大値更新
			if(r > rm) {rm = r;}
			// Sの先頭の文字を消去
			S = removeLeadingZeroes(S);
		}
		System.out.println(rm);
	}

	// 文字列の先頭を削除するメソッド
	static String removeLeadingZeroes(String s) {
	    StringBuilder sb = new StringBuilder(s);
	    if (sb.length() > 0) {
	        sb.deleteCharAt(0);
	    }
	    return sb.toString();
	}

}