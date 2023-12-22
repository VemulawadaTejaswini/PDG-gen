import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 数字を読み込む
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		// 条件で分岐
		if (a < b) {
			System.out.println("a < b");
		} else if (a > b) {
			System.out.println("a > b");
		} else {
			System.out.println("a == b");
		}
	}
}

