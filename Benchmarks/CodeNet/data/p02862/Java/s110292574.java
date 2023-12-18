
import java.math.BigInteger;
import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int m = (2 * X - Y) / 3;
        int n = X -2 * m;
        BigInteger number = bigFactorial(m + n).divide(bigFactorial(m));
        number = number.divide(bigFactorial(n));
        BigInteger bigInteger = BigInteger.valueOf(1000000000 + 7);
        number = number.remainder(bigInteger);

        System.out.print(number);

    }

	private static BigInteger BigInteger(int i) {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	static BigInteger bigFactorial (int n) {
		BigInteger[] ar = new BigInteger[n];
		for (int i=0; i<n; i++) {
			ar[i] = BigInteger.valueOf(i+1);
		}
		int t = 1, length = ar.length;
		while (t <= length) {
			for (int i=0; i<length; i+=(t<<1)) {
				if (t+i < length) {
					ar[i] = ar[i].multiply(ar[i+t]);
				}
			}
			t = t<<1;
		}
		return ar[0];
	}



}





