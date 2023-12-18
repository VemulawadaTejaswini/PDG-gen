import java.util.Scanner;

public class Main {

	// 末尾に追加可能な文字列を反転した文字列
	private static final String REVERSE_DREAM = new StringBuilder("dream").reverse().toString();
	private static final String REVERSE_DREAMER = new StringBuilder("dreamer").reverse().toString();
	private static final String REVERSE_ERASE = new StringBuilder("erase").reverse().toString();
	private static final String REVERSE_ERASER = new StringBuilder("eraser").reverse().toString();

	public static void main(String[] args) {

		// 処理対象文字列の入力
		Scanner sc = new Scanner(System.in);
		sc.close();

		// 最後尾から追加可能な文字列を検索するため、処理対象の文字列を反転させる
		StringBuilder targetString = new StringBuilder(sc.next()).reverse();

		String bak = "";
		// 処理対象の文字列の最後尾から、追加可能である文字列を可能な限り削除する処理を繰り返す
		// ※効率化のため文字列は反転して処理
		while(!targetString.toString().equals(bak)) {
			bak = targetString.toString();
			targetString = checkTopString(targetString);
		}

		// 出力
		if(targetString.length() == 0) {
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}

	}

	// 文頭の文字が特定の文字列であるなら特定の文字列を削除し、そうでない場合は文字列をそのまま返す関数
	static StringBuilder checkTopString(StringBuilder targetString){
		if(targetString.substring(0, REVERSE_DREAM.length()).toString().equals(REVERSE_DREAM)) {
			return targetString.delete(0, REVERSE_DREAM.length());
		}

		if(targetString.substring(0, REVERSE_DREAMER.length()).toString().equals(REVERSE_DREAMER)) {
			return targetString.delete(0, REVERSE_DREAMER.length());
		}

		if(targetString.substring(0, REVERSE_ERASE.length()).toString().equals(REVERSE_ERASE)) {
			return targetString.delete(0, REVERSE_ERASE.length());
		}

		if(targetString.substring(0, REVERSE_ERASER.length()).toString().equals(REVERSE_ERASER)) {
			return targetString.delete(0, REVERSE_ERASER.length());
		}

		return targetString;

	}

}