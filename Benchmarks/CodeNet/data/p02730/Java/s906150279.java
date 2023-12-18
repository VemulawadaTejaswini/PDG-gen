import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int N = S.length();

		String S_front = S.substring(0, (N-1)/2);
		String S_back = S.substring((N+3)/2-1, N);

		String ans = "No";
		if(checkSentence(S) && checkSentence(S_front) && checkSentence(S_back)) {
			ans = "Yes";
		}

		System.out.println(ans);
	}

	//回文チェック
	public static boolean checkSentence(String s) {
		boolean b = true;

		int checkindex = s.length() / 2;
		for(int i=0; i<checkindex; i++) {
			if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				b = false;
				break;
			}
		}


		return b;
	}

}
