import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner kbs = new Scanner(System.in);
		String s = kbs.nextLine();  // 文字列読み込み
		int k = kbs.nextInt();  // 繰り返し回数読み込み

		long count = 0;  // 最小で何回書き換えるのか

		// 最後の処理のための前準備
		boolean isSameChar = false;  // 入力された文字列の最後の文字と最後から2番目の文字が一致するか
		if (s.charAt(s.length()-2) == s.charAt(s.length()-1)) {
			isSameChar = true;
		}

		// 最初の文字と最後の文字を除いて連続する文字を置き換え
		for (int i=1; i<s.length()-2; i++) {
			if (s.charAt(i+1) == s.charAt(i)) {
				s = s.substring(0, i+1) +  "あ" +  s.substring(i+2);
				count += k;
			}
		}

		// 最初の文字と最後の文字の重複を置き換え
		// この処理はcountが１多い可能性があるため最後に1引くかどうか判定する
		boolean changedLastForCompareFirstAndLast = false;
		if (s.charAt(0) == s.charAt(s.length()-1)) {
			s = s.substring(0, s.length()-1) + "い";
			count += k;
			changedLastForCompareFirstAndLast = true;
		}

		// 最初の文字と２番目の文字が重複していれば書き換え
		if (s.charAt(0) == s.charAt(1)) {
			s = s.substring(0,1)+ "う" +  s.substring(2);
			count += k;
		}

		// 最後の文字と最後から２番目の文字が重複していれば書き換え
		if (s.charAt(s.length()-2) == s.charAt(s.length()-1)) {
			s = s.substring(0,s.length()-2)+ "え" +  s.substring(s.length()-1);
			count += k;
		}

		//
		// 例：issbi * 2      issbiissbi  →isxbyisxby ではなく、isxbyisxbiと最後のiは変えないほうが最小であるため
		if (changedLastForCompareFirstAndLast && !isSameChar) {
			count--;
		}

		System.out.println(count);

		kbs.close();
	}
}