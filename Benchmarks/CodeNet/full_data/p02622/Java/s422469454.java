import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		char[] s = sc.next().toCharArray();
		sc.nextLine();
		char[] t = sc.next().toCharArray();
		int ans = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i] !=  t[i]) {
				ans++;
			}
		}
		System.out.println(ans);
	}
	
}
