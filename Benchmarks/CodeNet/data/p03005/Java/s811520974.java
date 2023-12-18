import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		// K個全員に配る
		// 残りを一人に
		// が最大の差
		// Kが一人の場合は引きようがないのか
		sc.close();
		if (K == 1)
			System.out.println(0);
		else
			System.out.println(N - K);
	}
}