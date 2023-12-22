import java.util.*;
import java.math.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static BigInteger a, b;
	public static void main(String[] args) {
		while(read()){
			solve();
		}

	}
	static boolean read(){
		if(!sc.hasNext())
			return false;
		a = sc.nextBigInteger();
		b = sc.nextBigInteger();
		return true;
	}
	static void solve(){
		System.out.print(gcd(a, b) + " ");
		System.out.println(lcm(a, b, gcd(a, b)));
	}
	static BigInteger gcd(BigInteger a, BigInteger b){
		return a.gcd(b);
	}
	static BigInteger lcm(BigInteger a, BigInteger b, BigInteger gcd){
		return a.multiply(b).divide(gcd);
	}
}