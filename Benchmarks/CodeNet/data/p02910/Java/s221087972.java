import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		(new Main()).execute();
	}
	public void execute() {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String S = sc.next();
		String ans = getAnswer(S) ;
		System.out.println(ans);
	}

	public String getAnswer(String S) {
		String ans = "Yes" ;


		for(int i = 0 ; i < S.length(); i ++) {
			char c = S.charAt(i) ;
			if((i + 1)%2 == 1) {//奇数文字目
				if(c != 'R' && c != 'U' && c != 'D') {
					ans = "No" ;
					break ;
				}
			}else {
				if(c != 'L' && c != 'U' && c != 'D') {
					ans = "No" ;
					break ;
				}
			}
		}
		return ans ;
	}


}
