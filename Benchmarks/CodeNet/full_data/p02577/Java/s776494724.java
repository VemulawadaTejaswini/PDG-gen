import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String t = sc.next();
		String[] target = t.split("");
		int ans = 0;
		for (String a : target) {
			ans += Integer.parseInt(a);
		}
		if (ans % 9 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
		
	}
}
