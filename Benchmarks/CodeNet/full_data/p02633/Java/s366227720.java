import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字列の入力
		int x = sc.nextInt();

		// 出力
		if (x <= 90) {
			System.out.println(360/x);
		} else {
			System.out.println(720/x);
		}
		sc.close();
	}
}
