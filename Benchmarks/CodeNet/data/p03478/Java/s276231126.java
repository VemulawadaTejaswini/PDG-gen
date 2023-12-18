import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 処理対象個数の入力
		Scanner sc = new Scanner(System.in);
		int input_range = sc.nextInt();
		int input_min = sc.nextInt();
		int input_max = sc.nextInt();
		int result = 0;
		sc.close();

		int sum;
		for(int i=1;i<=input_range;i++) {
			sum = findSumOfDigits(i);
			if(input_min <= sum && sum <= input_max) {
              result += i;
			}
		}

		// 出力
		System.out.println(result);

	}

	// 各桁の和を計算する関数
	static int findSumOfDigits(int n) {
		int sum = 0;
		while (n > 0) { // n が 0 になるまで
			sum += n % 10;
			n /= 10;
		}
		return sum;
	}

}