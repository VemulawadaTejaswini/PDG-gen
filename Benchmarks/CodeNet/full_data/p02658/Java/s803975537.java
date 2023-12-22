
import java.util.Scanner;
import java.math.BigInteger;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		BigInteger a=BigInteger.valueOf(1),b=BigInteger.valueOf(1),c=new BigInteger("1000000000000000000");
		int t;
		int k;
		
		t = in.nextInt();
		
		while(t-- >0)
		{
			a = in.nextBigInteger();
			b = b.multiply(a);
		}
		k = b.compareTo(c);
		if(k==1)
			System.out.println("-1");
		else
			System.out.println(b);
		in.close();

	}

}
