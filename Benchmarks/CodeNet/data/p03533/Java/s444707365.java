import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		char[] son = { 'K', 'I', 'H', 'B', 'R' };
		int cnt = 0;
		boolean a = false;

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		if(s.indexOf("AA") != -1){
			System.out.println("NO");
			return;
		}

		for (char c : s.toCharArray()) {
			if (a) {// 前の文字がA
				if (c == 'A') {
					System.out.println("NO");
					return;
				} else {
					a = false;
				}
			}else if (c == 'A') {// 前はAじゃない
				a = true;
				continue;
			}

			if (cnt > son.length - 1) {// 文字列超過
				System.out.println("NO");
				return;
			}

			if (c == son[cnt]) {// 正しい子音と一致
				if (son[cnt] == 'R') {// 最後の子音
					if (s.indexOf(c) == s.length() - 1) {// R以後に文字がない
						System.out.println("YES");
						return;
					} else if(s.charAt(s.length()-1) == 'A'){
						System.out.println("YES");
						return;
					}else{
						System.out.println("NO");
						return;
					}

				}
				++cnt;
				a = false;
			} else {
				System.out.println("NO");
				return;
			}
		}

		System.out.println("YES");
	}
}
