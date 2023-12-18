import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// 整数の入力
			double n = sc.nextInt();
			// 出力(整数)
			double z = n % 2 == 0 ? n / 2 : (n + 1) / 2;
			double result = z / n;
			System.out.println(result);
		}
	}
}
