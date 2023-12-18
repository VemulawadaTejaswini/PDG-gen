
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	// 横線の引き方(縦がi+1本)
	static final BigInteger X[] = {
		new BigInteger("0"),
		new BigInteger("2"),
				new BigInteger("3"),
						new BigInteger("4"),
								new BigInteger("7"),
										new BigInteger("13"),
												new BigInteger("21"),
	};
	
	static BigInteger ONE = new BigInteger("1");
	static BigInteger TWO = new BigInteger("2");
	static BigInteger mod = new BigInteger("1000000007");
	//---------------------------------------------------------------------------------------------------
	static BigInteger[] f = new BigInteger[101010];
	static void init() {
		f[0] = new BigInteger("1");
		for (BigInteger i = new BigInteger("1"); i.compareTo(new BigInteger("101010")) < 0; i.add(ONE)) f[i.intValue()] = (f[i.intValue() - 1].multiply(i)).mod(mod);
	}
	//---------------------------------------------------------------------------------------------------
	static BigInteger inv(BigInteger x) {
		BigInteger res = ONE;
		BigInteger k = mod.subtract(TWO);
		BigInteger y = x;
		while (k.compareTo(BigInteger.ZERO) != 0) {
			if (k.equals(ONE)) res = (res.multiply(y)).mod(mod);
			y = (y.multiply(y)).mod(mod);
			k = k.subtract(TWO);
		}
		return res;
	}
	//---------------------------------------------------------------------------------------------------
	static BigInteger C(int n, int k) {
		BigInteger a = f[n]; // = n!
		BigInteger b = f[n - k]; // = (n-k)!
		BigInteger c = f[k]; // = k!

		BigInteger bc = (b.multiply(c)).mod(mod);

		return (a.multiply(inv(bc))).mod(mod);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();
		sc.close();

		solve(H, W, K);

	}
	
	public static BigInteger toBigInteger(int x) {
		return new BigInteger(String.valueOf(x));
	}

	public static void solve(int H, int W, int K) {
		
		BigInteger sum = BigInteger.ZERO;
		for (int i = 1; i <= H; i += 2) {
			BigInteger x = C(H, i);
			int leftTate = K - 2;
			int rightTateNotI = W - K;
			int rightTateI = rightTateNotI - 1;
			if (leftTate < 0) leftTate = 0;
			if (rightTateNotI < 0) rightTateNotI = 0;
			if (rightTateI < 0) rightTateI = 0;
			BigInteger left = X[leftTate].multiply(toBigInteger(H));
			BigInteger rightNotI = X[rightTateNotI].multiply(toBigInteger(H - i));
			BigInteger rightI = X[leftTate].multiply(toBigInteger(i));
			sum = sum.add(left.multiply(rightNotI.add(rightI)).multiply(x));
		}
		System.out.println(sum.mod(new BigInteger("1000000007")));
	}

}
