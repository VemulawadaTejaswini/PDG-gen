import java.math.BigInteger;
import java.util.Scanner;
import java.util.*;
public class main {

	public static void main(String[] args) {
		long  n,x,i;
		BigInteger f=new BigInteger("1");
		BigInteger l=new BigInteger("1000000000000000000");
		Scanner inpu=new Scanner(System.in);
		n=inpu.nextLong();
		for(i=0;i<n;i++) {
	    x=inpu.nextLong();
	    f=f.multiply(BigInteger.valueOf(x));
	    
		}
		int val=f.compareTo(l);
		if(val==1)System.out.println("-1");
		else System.out.println(f);

	}

}
