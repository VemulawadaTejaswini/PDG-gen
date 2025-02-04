/* package whatever; // don't place package name! */

import java.util.*;
import java.math.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger ans = new BigInteger("1");
		for (int i = 0; i < n; ++i) {
			String x = sc.next();
			ans = ans.multiply(new BigInteger(x));
		}
		if (ans.compareTo(new BigInteger("100000000000000000")) > 0) System.out.println(-1);
		else System.out.println(ans);
	}
}