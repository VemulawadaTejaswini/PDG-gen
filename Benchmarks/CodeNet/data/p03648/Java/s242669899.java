import java.math.BigInteger;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String k = s.next();
		BigInteger b = new BigInteger(k);
		BigInteger TWO = new BigInteger("2");
		BigInteger THREE = new BigInteger("3");
		BigInteger HALF = b.divide(TWO);
		System.out.println("2");
		if(b.mod(TWO).equals(BigInteger.ZERO)) System.out.println(HALF.add(BigInteger.ONE)+ " " + HALF.add(BigInteger.ONE));
		else System.out.println(HALF.add(THREE) + " " + HALF);
	}
}
