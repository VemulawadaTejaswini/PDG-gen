import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		// 入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x = sc.nextInt();

		String ans ="";
		if (a + b >= x && a < x) {
			ans = "YES";
		} else {
			ans = "NO";
		}

		// 出力
		System.out.println(ans);
	}
}