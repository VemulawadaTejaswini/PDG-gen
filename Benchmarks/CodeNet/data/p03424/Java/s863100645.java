import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 要素の入力、格納
		String ans = "Three";
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			if (sc.next().equals("Y")) {
				ans = "Four";
			}

		}

		// 出力
		System.out.println(ans);
	}
}
