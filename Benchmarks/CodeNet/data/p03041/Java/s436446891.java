import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
		int N = sc.nextInt();
		int K = sc.nextInt();
		String S = sc.next();

		char c[] = S.toCharArray();
		c[K - 1] = Character.toLowerCase(c[K - 1]);
		System.out.println(new String(c));
	}
}
