import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		int cnt = 0;
		char x = str.charAt(0);
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0 && str.charAt(i) != x) {
				cnt++;
			} else if (i % 2 != 0 && str.charAt(i) == x) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}

}