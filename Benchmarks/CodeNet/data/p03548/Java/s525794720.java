import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 入力
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		int Z = sc.nextInt();

		// 出力
		System.out.println((X - Z) / (Y + Z));

		sc.close();
	}
}
