import java.math.BigInteger;
import java.util.Scanner;

public class Main
{
	static public BigInteger mod = new BigInteger("1000000007");
	public static void main(String[] args)
	{
		//int m = 1000000007;

		BigInteger ans = BigInteger.ZERO;
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] substr = str.split(" ", 0);

		int n = Integer.parseInt(substr[0]);
		int a = Integer.parseInt(substr[1]);
		int b = Integer.parseInt(substr[2]);

		for (int i = 1; i < n+1; i++) {
			if (i != a && i != b) {
				ans = ans.add(f(n, i));
			}
		}
		scan.close();
		System.out.println(ans);
	}

	static public BigInteger f(int n, int m)
	{
		BigInteger ans = BigInteger.ONE;
		int k = n;
		for (int i = 0; i < m; i++) {
			ans = ans.multiply(BigInteger.valueOf(k));
			k--;
		}
		BigInteger ans2 = BigInteger.ONE;
		for (int i = 1; i < m+1; i++) {
			ans2 = ans2.multiply(BigInteger.valueOf(i));
		}
		ans = ans.divide(ans2);
		ans = ans.remainder(mod);
		return ans;
	}
}
