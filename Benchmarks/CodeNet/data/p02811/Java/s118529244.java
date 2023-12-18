import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 整数の入力
			long k = sc.nextLong();
			long x = sc.nextLong();
			System.out.println(k * 500 >= x ? "Yes" : "No");
		}
	}
}
