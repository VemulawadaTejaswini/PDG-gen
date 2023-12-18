import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		char[] son = { 'K', 'I', 'H', 'B', 'R' };
		int cnt = 0;

		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		if(s.indexOf("KIH") == -1){//KIHの並びが存在しない
			System.out.println("NO");
			return;
		}
		
		for( char cs : son){
			if( s.indexOf(cs) != s.lastIndexOf(cs)){//子音が2回以上出る場合を排除
				System.out.println("NO");
				return;
			}
		}
		
		if( s.length() > 9){
			System.out.println("NO");
			return;
		}

		for (char c : s.toCharArray()) {

			char[] cTmp = {c , c};
			String dupl = new String(cTmp);

			if(s.indexOf(dupl) != -1){//連続した重複が存在する
				System.out.println("NO");
				return;
			}

			//以下、重複によるWAはない
			
			if( c == 'A'){
				continue;
			}

			if (cnt > son.length - 1) {// 文字列超過
				System.out.println("NO");
				return;
			}

			if (c == son[cnt]) {// 正しい子音と一致
				if (c == 'R') {// 最後の子音
					int rNum = s.indexOf(c);
					if (rNum == s.length() - 1) {// R以後に文字がない
						System.out.println("YES");
						return;
					} else if( s.charAt(rNum +1) == 'A' //Rの次がA
							&& s.lastIndexOf("RA") == s.length() -2 //文末
							&& s.indexOf("RA") == s.lastIndexOf("RA") ){ //文末にのみ存在
						System.out.println("YES");
						return;
					}else{
						System.out.println("NO");
						return;
					}

				}
				++cnt;//次の文字チェック
			} else {//Aでも正しい子音でもない
				System.out.println("NO");
				return;
			}
		}

		System.out.println("YES");
	}
}
