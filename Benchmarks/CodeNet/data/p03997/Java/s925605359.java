import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		// 整数の入力
		int a = in.nextInt();
		// スペース区切りの整数の入力
		int b = in.nextInt();
		int c = in.nextInt();

		int ans = (a+b)/2;
		// 出力
		System.out.println(ans);
	}
}