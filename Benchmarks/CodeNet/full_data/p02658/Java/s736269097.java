import java.math.BigInteger;
import java.util.*;
public class Main{
public static void main(String[]args) {
	Scanner sc = new Scanner (System.in);
	int a= sc . nextInt();
	ArrayList<Long> ar= new ArrayList<Long>();
	for(int i=0;i<a;i++) {
		long val = sc.nextLong();
		ar.add(val);
		if(val == 0) {
			System.out.println("0");
			return ;
		}
	}
	BigInteger prod= new BigInteger("1");
	for(long i:ar) {
		prod = prod.multiply(BigInteger.valueOf(i));
		if(prod .compareTo(BigInteger.valueOf((long) Math.pow(10, 18))) == 1) {
			System.out.println("-1");
			return;
		}
	}
	System.out.println(prod.longValue());
	
}
}
