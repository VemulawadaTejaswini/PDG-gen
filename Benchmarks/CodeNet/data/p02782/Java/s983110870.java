import java.math.BigInteger;
import java.util.Scanner;

public class Main
{

	static public BigInteger mod = new BigInteger("1000000007");
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int r1 = scan.nextInt();
		int c1 = scan.nextInt();
		int r2 = scan.nextInt();
		int c2 = scan.nextInt();

		BigInteger ans = BigInteger.ZERO;
		BigInteger f1 = BigInteger.ZERO;
		for (int i=c1; i<c2+1;i++) {
			if (ans == BigInteger.ZERO) {
				f1 = f2(c1, r1);
			} else {
				f1 =  f1.multiply(BigInteger.valueOf((long)(r1+i))).divide(BigInteger.valueOf((long)i));
			}
			ans = ans.add(f1);

			BigInteger f2 = f1;
			for (int j=r1+1;j<r2+1;j++) {
				f2 = f2.multiply(BigInteger.valueOf((long)(j+i))).divide(BigInteger.valueOf((long)j));
				ans = ans.add(f2);
			}
		}
		System.out.println(ans.remainder(mod));
	}

	static public BigInteger f2(int r, int c) {

		if (c > r) {
			int tmp = c;
			c = r;
			r = tmp;
		}

	    BigInteger result = BigInteger.ONE;
	    int j = 1;
	    for (int i = c+1; i <= c+r; i++) {
	        result = result.multiply(BigInteger.valueOf(i)).divide(BigInteger.valueOf(j));
	    	j++;
	    }
	    return result;

	}

	static public BigInteger f(int r, int c) {

		if (c > r) {
			int tmp = c;
			c = r;
			r = tmp;
		}

		BigInteger rcf = factorial_m(c,r);
		BigInteger rf = factorial(r);
		BigInteger ans = rcf.divide(rf);
		return ans;
	}
	static public BigInteger factorial(int n) {
	    BigInteger result = BigInteger.ONE;
	    for (int i = 2; i <= n; i++)
	        result = result.multiply(BigInteger.valueOf(i));
	    return result;
	}
	static public BigInteger factorial_m(int c, int r) {
	    BigInteger result = BigInteger.ONE;
	    for (int i = c+1; i <= c+r; i++)
	        result = result.multiply(BigInteger.valueOf(i));
	    return result;
	}

}
