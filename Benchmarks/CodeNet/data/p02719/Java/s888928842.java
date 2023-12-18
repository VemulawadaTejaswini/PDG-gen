package rayy;
import java.util.*;
import java.math.BigInteger;

public class Main {

	public static void main(String [] args) {
		Scanner in =new Scanner(System.in);
		String N=in.next();
		String K=in.next();
		BigInteger b =new BigInteger(N);
		BigInteger jian =new BigInteger(K);
		b=b.mod(jian);
		//System.out.println(b.toString());
		BigInteger xiao;
		while(true) {
			xiao=b;
		   b=b.min(b.subtract(jian).abs());
		   //System.out.println(b.toString());
		   if(xiao.compareTo(b)<=0) {
			   break;
		   }
		}
		System.out.print(b.toString());

		
	}
}