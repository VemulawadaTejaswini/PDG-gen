import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] number = new long[n];
		for (int i = 0; i < n; i++) {
			number[i] = sc.nextLong();
		}

		// 10^9+7
		long DIVNUM = (long) (Math.pow(10, 9) + 7);
		// 各数字の合計
		long numberSum = 0;
		// 各数字を2乗したものの合計
		long numberSquaredSum = 0;
		// 結果
		long result = 0;

		for (int i = 0; i < n; i++) {
			numberSum += number[i];
			numberSquaredSum += ((long) Math.pow(number[i], 2) % DIVNUM);
		}

		// a*10^(9+5) => b*10^9
		numberSum %= DIVNUM;
		// a*10^(9*2) => b*10^9
		long temp = ((long) Math.pow(numberSum, 2) - numberSquaredSum) % DIVNUM;

		// 10^9+7で割った余りの数字を2で割る
		while (temp % 2 != 0 && temp < DIVNUM) {
			temp += DIVNUM;
		}
		result = (temp / 2) % DIVNUM;

		System.out.println(result);

		sc.close();

	}

}
