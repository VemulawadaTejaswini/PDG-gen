import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 入力値の取得
		long H = sc.nextLong();
		
		int count = 0;
		long hp = H;
		while (hp > 1) {
			count++;
			hp = hp / 2;
		}
		
		// 結果の出力
		long nodes = (long) Math.pow(2, count);
		long sum = 0;
		while (nodes >= 1) {
			sum += nodes;
			nodes = nodes / 2;
		}
		System.out.println(sum);
		
		sc.close();
	}
}
