import java.math.BigInteger;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
    
    	BigInteger result = BigInteger.ZERO;
    	Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		BigInteger max = BigInteger.valueOf((long)Math.pow(10, 18));
        
        //入力処理
        for(int i=0;i<count;i++) {
			BigInteger nyuryoku = BigInteger.valueOf(sc.nextLong());
			result= i==0 ? result.add(nyuryoku):result.multiply(nyuryoku);
		}
        
		if(result.compareTo(max) == 1) {
			System.out.println(-1);
		}else {
			System.out.println(result);
		}
		
	}
}