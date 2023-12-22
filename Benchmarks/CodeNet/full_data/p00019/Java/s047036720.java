import java.math.*;
import java.text.*;
import java.lang.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			System.out.println(fact(n));
		}
	}

	private static BigInteger fact(int n){
		if(n==0) return BigInteger.ONE;
		return (new BigInteger(new Integer(n).toString()).multiply(fact(n-1)));
	}
}