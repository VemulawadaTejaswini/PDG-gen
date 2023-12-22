import java.util.Scanner;

public class A {
	public static void main(String[] args)  {
		// 標準入力を受け取る
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt(); // int Xを受け取る
		sc.close(); // 標準入力を終了

		if (X >= 30) {
			// 冷房ON
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}