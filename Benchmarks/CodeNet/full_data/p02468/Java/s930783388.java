import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	static BigInteger ZERO = new BigInteger("0");
	static BigInteger ONE = new BigInteger("1");
	static BigInteger TWO = new BigInteger("2");

	static BigInteger pos(BigInteger m, long n) {
	    BigInteger res;
	    if(n == 0) return ONE;

	    res = pos(m.multiply(m), n/2);
	    if(n % 2 == 1) {
	        res = res.multiply(m);
	    }
	    return res;
	}

	static BigInteger mymod(BigInteger m, BigInteger n) {
	    while(m.divide(n).compareTo(n)>=0) {
	        m = m.divide(n);
	    }
	    return m;
	}

	public static void main(String[] args) {
		BigInteger d = new BigInteger("1000000007");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a[] = null;
		try {
			a = br.readLine().split(" ");
		} catch (IOException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		BigInteger n = new BigInteger(a[0]);
		n = pos(n, Integer.parseInt(a[1]));
		System.out.println(mymod(n,d).toString());
	}
}