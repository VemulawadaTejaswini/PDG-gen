import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//変数//
		String s;		//入力
		String ans;		//出力
		Scanner scan = new Scanner(System.in);
		
		//入力//
		s = scan.next();
		
		scan.close();
		
		//処理//
		ans = s.replaceAll(",", " ");
		
		//結果//
		System.out.println(ans);
		
	}

}
