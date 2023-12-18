import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();

		int n = Integer.parseInt(str);

		str = scan.nextLine();
		String[] substr = str.split(" ", 0);

		BigInteger[] array = new BigInteger[100000];
		for (int i=0; i<n; i++) {
			array[i] = new BigInteger(substr[i]);
		}

		BigInteger l = array[0];
		for (int i=1; i<n; i++) {
			l = lcm(array[i],l);
		}
		BigInteger ans = new BigInteger("0");
		for (int i=0; i<n; i++) {
			ans = ans.add(l.divide(array[i]));
		}
		BigInteger mod = new BigInteger("1000000007");
		ans = ans.mod(mod);

		System.out.println(ans);

	}

    static BigInteger gcd(BigInteger a, BigInteger b){
        return a.gcd(b);
    }
    static BigInteger lcm(BigInteger a, BigInteger b){
        return a.multiply(b).divide(gcd(a,b));
    }
}