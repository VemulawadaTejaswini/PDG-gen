import java.util.*;
import java.math.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger v = new BigInteger("0");
		BigInteger w = new BigInteger("1");
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			if(a == 1) v = v.add(w.multiply(new BigInteger("" + b)));
			if(a == 2) v = v.subtract(w.multiply(new BigInteger("" + b)));
			if(a == 3) v = v.multiply(new BigInteger("" + b));
			if(a == 4) w = w.multiply(new BigInteger("" + b));
		}
		System.out.println(v.divide(w));
	}
}