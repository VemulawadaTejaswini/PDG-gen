import java.util.*;
import java.io.*;
import java.math.*;

public class Main{
	public static void main(String[] args)throws IOException{
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		BigInteger md = BigInteger.valueOf(1000000007);
		BigInteger ten = BigInteger.valueOf(10);
		BigInteger nine = BigInteger.valueOf(9);
		BigInteger eight = BigInteger.valueOf(8);
		BigInteger n = BigInteger.valueOf(N);
		BigInteger sub1 = ten.modPow(n, md);
		sub1 = sub1.subtract(eight.modPow(n, md));
		BigInteger sub2 = nine.modPow(n, md);
		sub2 = sub2.subtract(eight.modPow(n, md));
		sub1 = sub1.subtract(sub2.multiply(BigInteger.valueOf(2)));
		sub1 = sub1.mod(md);
	//	long seq = (long)((Math.pow(10, N) - Math.pow(8, N)) - 2 * (Math.pow(9, N) - Math.pow(8, N)));
		System.out.println(sub1.toString());
	}
}