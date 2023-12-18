import java.util.*;
import java.math.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		BigInteger l=scan.nextBigInteger();
		BigInteger r=scan.nextBigInteger();
		BigInteger sum=l;
		int cnt=0;
		cnt++;
		while(sum.compareTo(r)!=1){
		    sum=sum.multiply(BigInteger.valueOf(2));
		    //System.out.println(sum);
		    cnt++;
		}
		System.out.println(cnt-1);
	}
}
