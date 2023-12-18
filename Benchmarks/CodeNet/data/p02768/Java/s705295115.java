import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Scanner;

public class Main
{
    static Scanner sc = new Scanner(new InputStreamReader(System.in));
	public static void main(String[] args)
	{
		int ans = 0;
		int mod = 1000000007;
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] substr = str.split(" ", 0);

		int n = Integer.parseInt(substr[0]);
		int a = Integer.parseInt(substr[1]);
		int b = Integer.parseInt(substr[2]);

		scan.close();
		ans = modPow(2, n, mod) - 1;
		ans = ans - convModPow(n, a, mod);
		ans = ans - convModPow(n, b, mod);
		if (ans < 0) {
			ans += mod;
		}
		System.out.println(ans);
	}

	static public int modPow(int m, int n, int mod)
	{
		BigInteger bm = BigInteger.valueOf((long)m);
		BigInteger bn = BigInteger.valueOf((long)n);
		BigInteger bmod = BigInteger.valueOf((long)mod);

		return bm.modPow(bn, bmod).intValue();
	}

	static public int convModPow(int n, int a, int mod)
	{
		BigInteger bn = BigInteger.valueOf((long)n);
		BigInteger bmod = BigInteger.valueOf((long)mod);
		BigInteger bmod2 = BigInteger.valueOf((long)mod-2);

		BigInteger bk = bn;
		BigInteger bm = BigInteger.ONE;
		for (int i=2; i<a+1; i++) {
			bm = bm.multiply(BigInteger.valueOf((long)i));
		}
		BigInteger bp = bm.modPow(bmod2, bmod);

		bm = BigInteger.ONE;
		for (int i=0; i<a; i++) {
			bm = bm.multiply(bk);
			bk = bk.subtract(BigInteger.ONE);
		}
		bm = bm.multiply(bp);

		return bm.remainder(bmod).intValue();
	}
}
