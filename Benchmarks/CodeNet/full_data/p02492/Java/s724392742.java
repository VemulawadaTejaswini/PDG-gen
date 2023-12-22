import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner (System.in);
		
		while (true) {
			int a = sc.nextInt();
			String op = sc.next();
			int b = sc.nextInt();
			if (op.equals("?")) {
				break;
			} else {
				int ans;
				if (op.equals("+")) {
					ans = a + b;
				} else if (op.equals("-")) {
					ans = a - b;
				} else if (op.equals("*")) {
					ans = a * b;
				} else {
					ans = a / b;
				}
				System.out.println(ans);
			}
		}
		
	}

}