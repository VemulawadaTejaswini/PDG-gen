import java.util.Scanner;

// 提出時にclass Main に書き換え
public class Main {
	public static void main(String[] args)  {
		// 標準入力を受け取る
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // int Nを受け取る
		int A = sc.nextInt(); // int Aを受け取る
		int B = sc.nextInt(); // int Bを受け取る
		sc.close(); // 標準入力を終了

		// 各桁の和が A 以上 B 以下であるものの総和
		int c = 0;

		for(int i = 1; i <= N; i++) {
			int j = sumDigits(i);
			if(j >= A && j <= B) {
				// 各桁の和が A 以上 B 以下
				c += i;
			}
		}
		System.out.println(c);
	}

	//sumDigits:負でないint nが与えられた場合、その桁の合計を再帰的に返す。
	public static int sumDigits(int n) {
		int sum = 0;
		//自然数の各桁の和を計算
		while (n != 0) {
			//sumDigitsは単独ではloopしないので、while loopを使う。
			int s = n % 10;
			sum += s;
			//再右端の桁を得るために%10を利用する。

			n = n / 10;
			//再右端の桁を取り除くためにn/=10を利用する。
		}

		return sum;//合計を返す
	}

}