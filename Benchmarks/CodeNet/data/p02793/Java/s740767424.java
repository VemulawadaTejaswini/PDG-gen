import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		int n = Integer.parseInt(str);

		str = scan.nextLine();
		String[] substr = str.split(" ", 0);

		BigInteger[] array = new BigInteger[10000];
		for (int i=0; i<n; i++) {
			array[i] = BigInteger.valueOf(Integer.parseInt(substr[i]));
		}

		BigInteger l = array[0];
		for (int i=1; i<n; i++) {
			l = array[i].multiply(l).divide(array[i].gcd(l));
		}
		BigInteger ans = BigInteger.ZERO;
		BigInteger mod = BigInteger.valueOf(1000000007);
		for (int i=0; i<n; i++) {
			ans = ans.add(l.multiply(array[i].modInverse(mod)));
			ans = ans.mod(mod);
		}
		System.out.println(ans);

	}

    static BigInteger gcd(BigInteger a, BigInteger b){
        return a.gcd(b);
    }
    static BigInteger lcm(BigInteger a, BigInteger b){
        return a.multiply(b).divide(gcd(a,b));
    }
}
