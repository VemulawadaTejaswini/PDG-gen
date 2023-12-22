import java.util.Scanner;

// 提出時にclass Main に書き換え
public class Main {
	public static void main(String[] args)  {
		// 標準入力を受け取る
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine(); // String Sを受け取る
		sc.close(); // 標準入力を終了

		if (S.endsWith("s")) {
			// sで終わる
			System.out.println(S + "es");
		} else {
			System.out.println(S + "s");
		}
	}

}