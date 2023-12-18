import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("1以上かつ100以下の数字を入力してください");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		if (0 <= N && N <= 100) {
			amari(N);
			waru(N);
			System.out.println(amari(N) + waru(N));
		} else {
			System.out.println("エラー！1以上かつ100以下の数字にしてください");
		}
		sc.close();
	}

	public static int amari(int N) {
		int kekka1 = N % 2;
		return kekka1;
	}

	public static int waru(int N) {
		int kekka2 = N / 2;
		return kekka2;
	}
}