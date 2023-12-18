import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	InputStream in = System.in;
	PrintStream out = System.out;

	public void _main(String[] args) {
		Scanner sc = new Scanner(in);

		long K = sc.nextLong();
		long A = sc.nextLong();
		long B = sc.nextLong();

		sc.close();

		if (B - A > 2 && K >= (A + 1)) {
			// A枚→B枚の変換をできるだけやる

			long ans = 1;

			//最初にA枚必要
			K -= (A - 1);
			ans += (A - 1);

			// 2手一組なので奇数なら1回たたいて増やす
			if (K % 2 == 1) {
				K--;
				ans++;
			}

			// 2消費することで、(B-A)枚増える
			ans += (K / 2) * (B - A);

			out.println(ans);

		} else {
			// A枚→B枚の変換は不利なのでK回叩いて増やす
			out.println(K + 1);
		}

	}

	public static void main(String[] args) {
		new Main()._main(args);
	}
}
