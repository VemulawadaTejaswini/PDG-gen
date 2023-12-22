import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("");
		String[] t = sc.nextLine().split("");
		int ans = 0;
		for (int i = 0; i < s.length; i++) {
			if (!s[i].equals(t[i])) {
				ans++;
			}
		}
		System.out.println(ans);
	}
	
}
