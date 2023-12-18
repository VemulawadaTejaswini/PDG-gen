import java.util.Scanner;

public class Main {

	public Main() {
		// TODO 自動生成されたコンストラクター・スタブ
	}

	public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			// 整数の入力
			int a,b,p;
			int result;
			a = sc.nextInt();
			p = sc.nextInt();
			sc.close();
			result=(a*3+p)/2;
			

			// 出力

			System.out.println(result);
	}
}