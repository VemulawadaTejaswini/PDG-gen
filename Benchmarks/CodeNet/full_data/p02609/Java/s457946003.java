import java.util.*;
import java.math.*;
import java.io.*;

class Main {
    private static Map<Integer, Integer> memo = new HashMap<>();

    private static int bitCount(int integer) {
	int onBits = 0;
	for (int i = 0; i < 32; i++) {
	    if ((integer & (1 << i)) != 0){
		onBits++;
	    }
	}

	return onBits;
    }

    private static int f(int n) {
	int bc = bitCount(n);
	if (bc == 0) return 0;

	// System.out.println("Bit count for n = " + n.bitCount() + " Number is " + n.toString());

	if (memo.containsKey(n)) {
	    // System.out.println("Memoed!");
	    return memo.get(n);
	} else {
	    memo.put(n, 1 + f(n % bitCount(n)));
	    return memo.get(n);
	}
    }

    public static void main(String[] args) throws Exception{
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int digits = Integer.parseInt(reader.readLine());
	BigInteger num = new BigInteger("0" + reader.readLine(), 2);
	for (int i = digits - 1; i >= 0; --i) {
	    // System.out.println("Trying with " + num.flipBit(i).toString());
	    BigInteger inte = num.flipBit(i);
	    if (inte.compareTo(BigInteger.ZERO) == 0) {
		System.out.println("0");
		continue;
	    }
	    System.out.println(1 + f(inte.remainder(BigInteger.valueOf(inte.bitCount())).intValue()));
	}
    }
}
