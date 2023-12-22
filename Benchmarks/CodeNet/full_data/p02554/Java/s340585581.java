import java.math.BigInteger;
import java.util.Scanner;

// 提出時にclass Main に書き換え
public class Main {
	public static void main(String[] args)  {
		// 標準入力を受け取る
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // int Nを受け取る
		sc.close(); // 標準入力を終了

		BigInteger ans = BigInteger.valueOf(0); // 答え
		if (N > 1) {
			// Nが2未満の場合、答えはゼロ

			// Nが取りえるすべての順列を求める
            // 10^N
			BigInteger al = BigInteger.valueOf(10);

			ans = al.pow(N);

			// N[i]=0となる要素が一個もない場合, N[i]=9となる要素が一個もない場合を求める
            // 9^N * 2
			BigInteger zero = BigInteger.valueOf(9);
			BigInteger nine = BigInteger.valueOf(9);

			zero = zero.pow(N);
			nine = nine.pow(N);

			// N[i]=0となる要素, N[i]=9となる要素が共に一個もない場合を求める
            // 8^N
			BigInteger zn = BigInteger.valueOf(8);

			zn = zn.pow(N);

			ans = ans.subtract(zero);
			// ans = 10^N - 9^N * 2 + 8^N
			ans = ans.subtract(nine);
			ans = ans.add(zn);
		}

		// 10^9 + 7
		BigInteger mod = BigInteger.valueOf(1000000007);
		// 10^9 + 7で割ったあまり
		ans = ans.remainder(mod);
		System.out.println(ans);
	}

}