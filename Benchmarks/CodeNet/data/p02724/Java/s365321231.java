import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		long Coin = sc.nextLong();

		//入力したコインを500で割る
		long coin500 = Coin / 500;
		//入力したコインを5で割る
		long coin5 = Coin % 5;

		//結果
		long Coinsum = coin500 * 1000 + coin5 * 5;
		System.out.println(Coinsum);

		sc.close();

	}

}
