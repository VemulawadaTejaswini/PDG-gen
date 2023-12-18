import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc1 = new Scanner(System.in);

		String s = sc1.next();
		int ans = 0;

		for(int i = 0; i < 4; i++) {
			if(s.charAt(i) == '+') {
				ans++;
			}
			else {
				ans--;
			}
		}

		System.out.println(ans);

		sc1.close();

	}

}
