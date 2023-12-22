

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		//
		String keyword = "";
		String sentence = "";
		int answer = 0;

		// 標準入力
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			// 入力文字
			keyword = sc.next();
			break;
		}

		// 英文を取ってくる
		while (sc.hasNextLine()) {
			//
			sentence = sc.next();

			if (sentence.equals("END_OF_TEXT"))
				break;

			// 表示
			utility ut = new utility();
			answer += ut.mate_string(keyword, sentence);

		}

		System.out.println(answer);

	}
}

class utility {

	// キーワードと検索単語を渡して、キーワードと検索単語を同じ(小文字と大文字関係なし)だった場合は1を返す
	public int mate_string(String keyword, String sentence) {
		//
		if (keyword.equals((sentence.toLowerCase()))) {
			// 一致しているときは1
			return 1;
		}

		// 一致していないときは0
		return 0;
	}
}