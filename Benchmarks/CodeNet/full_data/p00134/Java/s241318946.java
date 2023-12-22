import java.util.*;
import java.math.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static BigInteger value = new BigInteger("0");
	static BigInteger average = new BigInteger("0");
	static BigInteger number = new BigInteger("0");
	
	public static void main(String[] args) {
		read();
		solve();
	}
	static boolean read(){
		number = sc.nextBigInteger();
		if(number.intValue() == 0)return false;
		for(int i = 0; i < number.intValue(); i++)
			value = value.add(sc.nextBigInteger());
		return false;
	}
	static void solve(){
		average = value.divide(number);
		System.out.println(average);
	}
	
}