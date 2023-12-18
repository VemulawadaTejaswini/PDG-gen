import java.util.*;
import java.math.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		BigInteger l=scan.nextBigInteger();
		BigInteger r=scan.nextBigInteger();
		BigInteger sum=new BigInteger("1");
		int cnt=0;
		for(int i=1; ;i++){
		    sum=l.multiply(BigInteger.valueOf(i));
		    if(sum.compareTo(r)==1)break;
		    cnt++;
		}
		System.out.println(cnt);
	}
}
