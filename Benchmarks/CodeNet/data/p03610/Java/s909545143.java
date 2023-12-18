import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		int lastKiss =0; //奇数文字目の最後尾のインデックス
		if(s.length()%2==0) {//文字列が偶数文字数
			lastKiss=s.length()-2;
		}else {//文字列が奇数文字数
			lastKiss=s.length()-1;
		}

		for(int i=0;i<=lastKiss;i=i+2) {
			System.out.print(s.charAt(i));
		}
	}

}
