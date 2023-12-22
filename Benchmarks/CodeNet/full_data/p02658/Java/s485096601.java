

import java.math.BigInteger;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);


		int N = scanner.nextInt();

		BigInteger[] A = new BigInteger[N];
		BigInteger ans= new BigInteger("1");
		BigInteger x=new BigInteger("1000000000000000000");

		for(int i=0 ; i<N ; i++) {
			A[i]=scanner.nextBigInteger();
		}

		for(int i=0 ; i<N ; i++) {
			ans = ans.multiply(A[i]);
		}

		if(ans.compareTo(x) > 0 ) {
			System.out.println(-1);
		}else {
			System.out.println(ans);
		}




		scanner.close();

	}

}
