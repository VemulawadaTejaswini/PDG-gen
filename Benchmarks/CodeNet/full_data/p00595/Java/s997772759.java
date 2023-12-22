import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		while(s.hasNext()){
			BigInteger a = BigInteger.valueOf(s.nextInt());
			BigInteger b = BigInteger.valueOf(s.nextInt());
			BigInteger g = a.gcd(b);
			System.out.println(g);
		}	
	}	
}