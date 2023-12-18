import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 数値
		// int n1 = sc.nextInt();
		String n1 = sc.next();

		if ("AAA".equals(n1) || "BBB".contentEquals(n1)) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}

		//		for (int i = 0; i < n; i++) {
		//			System.out.println(n1);
		//
		//		}

	}
}
