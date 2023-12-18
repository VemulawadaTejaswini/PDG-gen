import java.util.*;

class Main{
	public static void main(String[] $){
		//入力
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		//処理
		String ans = s.replace(',', ' ');

		//出力
		System.out.println(ans);
	}
}
