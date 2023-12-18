import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 整数の入力
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			System.out.println(a + b + c >= 22 ? "bust" : "win");
		}
	}
}
