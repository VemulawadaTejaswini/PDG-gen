import java.util.*;
import java.math.*;
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			BigInteger x = sc.nextBigInteger().add(sc.nextBigInteger());
			System.out.println(x.toString().length() > 80 ? "overflow" : x);
		}
	}
}