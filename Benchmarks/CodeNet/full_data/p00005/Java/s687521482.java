import java.math.BigInteger;
import java.util.*;


public class Main {

	public static long bfs(long a,long b){
		long gcd=0;
		if(a==b)
			gcd=a;
		while(a!=b)
		{
		if(a>b)
			a=a-b;
		else 
			b=b-a;
			
			gcd=b;
		}
		return gcd;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		long gcd,a,b;
		BigInteger lcm=BigInteger.valueOf(0);
		
		while(scan.hasNext())
		{
			a=scan.nextLong();
			b=scan.nextLong();
			gcd=bfs(a,b);
			if(gcd!=1)
				lcm=BigInteger.valueOf(a).divide(BigInteger.valueOf(gcd)).multiply(BigInteger.valueOf(b));
			else
				lcm=BigInteger.valueOf(a).multiply(BigInteger.valueOf(b));
			System.out.print(gcd+" "+lcm);
		}
		scan.close();
}}