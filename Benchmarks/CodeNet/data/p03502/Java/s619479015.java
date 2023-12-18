import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		// 入力
		Scanner sc = new Scanner(System.in);
		String inputStr = sc.next();
		sc.close();
		
		String[] arrStr = inputStr.split("");
		long inputL = Long.parseLong(inputStr);
		long l = 0;
		for (String s: arrStr) {
			if ("".equals(s)) {
				continue;
			}
			l += Integer.parseInt(s);
		}
		
		System.out.println(inputL % l == 0  ? "Yes" : "No");
	}
}
