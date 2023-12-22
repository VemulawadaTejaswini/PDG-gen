import java.math.*;
import java.util.*;

public class AOJ_Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int n = sc.nextInt();
		BigInteger bi = BigInteger.ONE;
		for(int i=2;i<=n+1;i++) bi = bi.multiply(BigInteger.valueOf(i));
		System.out.println(bi.add(BigInteger.valueOf(2)));
		for(int i=2;i<=n+1;i++) System.out.println(i);
	}
}