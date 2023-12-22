import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BigInteger[][] c = new BigInteger[110][110];
		c[0][0] = BigInteger.valueOf(1);
		for (int i = 0; i <= 105; ++i) {
			c[i][0] = c[i][i] = BigInteger.valueOf(1);
			for (int j = 1; j < i; ++j)
				c[i][j] = c[i - 1][j].add(c[i - 1][j - 1]);
		}
		Scanner in = new Scanner(System.in);
		int l = in.nextInt(), k = in.nextInt();
		BigInteger ans = BigInteger.valueOf(0);
		for (int i = 0; i <= 100; ++i)
			for (int j = 0; j <= i + 1; ++j)
				if(i + k * j + (i + 1 - j) <= l)
					ans = ans.add(c[i + 1][j]);
		System.out.println(ans);
		in.close();
	}
}

