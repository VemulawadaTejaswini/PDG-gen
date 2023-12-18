import java.math.BigInteger;
import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			char[] s = sc.next().toCharArray();
			long n = s.length;
			long ret = 0;
			
			for(int i=0;i<n;i++) {
				String NUM =String.valueOf(s[i]);
				for(int j=i+1;j<n;j++) {
					NUM+=s[j];
					BigInteger big = new BigInteger(NUM);
					BigInteger year = new BigInteger("2019");
					BigInteger zero = BigInteger.ZERO;
					if(big.remainder(year)==zero) {
						ret++;
					}
				}
				
			}
			
			
			System.out.println(ret);
			
	    }
				
	}
