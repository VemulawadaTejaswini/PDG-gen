import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long K = sc.nextLong();
		long D = sc.nextLong();

		if(D * K <= Math.abs(X)) {
			System.out.println(Math.abs(X)- (D * K));
			return;
		}

		BigInteger min = new BigInteger(String.valueOf(X));
		min.add(new BigInteger(String.valueOf(D)));
		for(int i=0;i<=K;i++) {
			BigInteger val = new BigInteger(String.valueOf(X));
			val.add(new BigInteger(String.valueOf(D)).multiply(new BigInteger(String.valueOf(i))));
			val.add(new BigInteger(String.valueOf(D)).multiply(new BigInteger(String.valueOf(K-i))));
			if(min.compareTo(val) < 0) {
				min = val;
			}

		}

		System.out.println(min.toString());

	}

}