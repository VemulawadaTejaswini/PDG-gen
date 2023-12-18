import java.util.Scanner;

public class Main {

	static Scanner sc;
	static String input;

	public static void main(String[] args) {
		//初期化
		init();

		int ans = 0;
		//メインの処理
		//入力文字列を先頭から捜索
		for(int i=0; i<input.length(); i++) {
			//先頭からi番目の文字
			char c = input.charAt(i);
			//長さのカウントを開始
			if(c=='A' || c=='T'|| c=='G'|| c=='C') {
				int count = 0;
				for(int j=0; i+j<input.length(); j++) {
					c = input.charAt(i+j);
					if (c!='A' && c!='T'&& c!='G'&& c!='C') {
						count = j;
						break;
					}else if(i+j == input.length() - 1) {
						count = j+1;
						break;
					}
				}

				//最大長の更新
				if(ans < count) ans = count;
			}
		}

		System.out.println(ans);

		sc.close();
	}

	private static void init() {
		sc = new Scanner(System.in);
		input = sc.nextLine();
	}
}