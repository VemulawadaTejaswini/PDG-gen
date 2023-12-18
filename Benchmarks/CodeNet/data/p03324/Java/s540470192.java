
import java.math.*;  
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		int a,b,i;
        a=cin.nextInt();
        b=cin.nextInt();
        BigInteger x=BigInteger.valueOf(1);
        BigInteger y=BigInteger.valueOf(0);
        for(i = 1;i<=a;i++)
        {
        x= x.multiply(BigInteger.valueOf(100));
       
        }
        for(i = 1;i<=b;i++)
        {
        	y=y.add(x);
        }
       
        System.out.println(y);
	}

}
