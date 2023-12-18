import java.util.*;

public class Main {
	public static void main(String[] args) {

		// 入力
		Scanner sc = new Scanner(System.in);
		
		// 数値
		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int i = 0;
		int k = 0;
		if (x > a) {
			i = x-a;
		} else {
			i = a-x;
		}
		if (x > b) {
			k = x-b;
		} else {
			k = b-x;
		}
		
		String ans = "A";
		if (i > k) {
			ans = "B";
		}
		// 出力
		System.out.println(ans);

		sc.close();

	}
}