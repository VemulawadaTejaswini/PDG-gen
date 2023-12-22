import java.util.*;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n = sc.next();
		String t = sc.next();
		String f = sc.next();
		BigInteger bi = BigInteger.ZERO;
		for(int i=2;i<f.length();i+=4){
			bi = bi.add(new BigInteger(n).pow(f.codePointAt(i)-48));
		}
		bi = bi.multiply(new BigInteger(t));
		if(bi.compareTo(new BigInteger("1000000000"))>0) System.out.println("TLE");
		else System.out.println(bi);
	}

}