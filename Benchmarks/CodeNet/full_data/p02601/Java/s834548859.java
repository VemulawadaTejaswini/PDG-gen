import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		sc.nextLine();
		int k = sc.nextInt();
		
		boolean canDo = false;
		for (int i = 0; i < k; i++) {
			if (a >= b) {
				b = b*2;
			} else if (b >= c) {
				c = c*2;
			} else {
				canDo = true;
				break;
			}
		}
		String ans = canDo ? "Yes" : "No";
		System.out.println(ans);
	}
}
