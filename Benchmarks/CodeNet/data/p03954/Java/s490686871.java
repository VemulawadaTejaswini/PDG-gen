
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
	

	private static Scanner in;
	

	public static void main(String[] args)
	{
		
		in = new Scanner(System.in);
		BigInteger x;
		BigInteger sum;
		int i,n,m;
		 n=in.nextInt();
		
		 m=2*n-1;
		 x=in.nextBigInteger();
		 sum=x;
		

		 for(i=2;i<m;i++)
			{
			 x=in.nextBigInteger();
			 sum.add(x);
			 sum.add(x);
			}
		 x=in.nextBigInteger();
		 sum.add(x);
		// System.out.print(sum);
		 System.out.print(sum.divide((BigInteger.valueOf(2).multiply(BigInteger.valueOf(m))).subtract(BigInteger.valueOf(2)))+" \n");
		//System.out.println(" \n");
	}
	}




