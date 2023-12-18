import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 入力
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();

		// 出力
		if ((x - a) * (x - a) <= (x - b) * (x - b)) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}

		sc.close();
	}
}
