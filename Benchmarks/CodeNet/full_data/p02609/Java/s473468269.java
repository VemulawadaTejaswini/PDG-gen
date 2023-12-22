import java.util.*;
import java.math.*;
import java.io.*;

class Main {
    private static Map<BigInteger, Integer> memo = new HashMap<>();

    private static int f(BigInteger n) {
	if (n.bitCount() == 0) return 0;

	// System.out.println("Bit count for n = " + n.bitCount() + " Number is " + n.toString());

	if (memo.containsKey(n)) {
	    // System.out.println("Memoed!");
	    return memo.get(n);
	} else {
	    memo.put(n, 1 + f(n.remainder(BigInteger.valueOf(n.bitCount()))));
	    return memo.get(n);
	}
    }

    public static void main(String[] args) throws Exception{
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int digits = Integer.parseInt(reader.readLine());
	BigInteger num = new BigInteger("0" + reader.readLine(), 2);
	for (int i = digits - 1; i >= 0; --i) {
	    // System.out.println("Trying with " + num.flipBit(i).toString());
	    System.out.println(f(num.flipBit(i)));
	}
    }
}
