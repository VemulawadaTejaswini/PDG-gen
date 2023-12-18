import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//配列を一つずつ取り出す。
		String[] S = sc.next().split("");

		//3文字目と4文字目と5文字目6文字目の比較
		if(S[2].equals(S[3])&&(S[4].equals(S[5]))) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		sc.close();
	}

}
