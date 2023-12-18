import java.util.*;
import java.math.BigInteger;

public class Main{
//public class abc164_d{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		int size = str.length();
		int con = 0;

		for(int i=0; i< size; i++){
			for(int j = i+1 ; j <= size; j++){
				BigInteger result = new BigInteger(str.substring(i, j));
				if(result.remainder(BigInteger.valueOf(2019)) == BigInteger.ZERO) con++;
			}
		}

		System.out.println(con);
	}

}