import java.math.BigInteger;
import java.util.Scanner;

public class Main {

	final static int MAXN=2005;
	static int N,X;
	static BigInteger dp[],val[],sum[],A[];
	
	public static void main(String[] args) {
		dp=new BigInteger[MAXN];
		val=new BigInteger[MAXN];
		sum=new BigInteger[MAXN];
		A=new BigInteger[MAXN];
		
		Scanner cin=new Scanner(System.in);
		
		N=cin.nextInt();
		X=cin.nextInt();
		sum[0]=BigInteger.ZERO;
	    for(int i=1;i<=N;i++)
	    {
	    	A[i]=cin.nextBigInteger();
	        sum[i]=sum[i-1].add(A[i]);
	    }

	    val[0]=BigInteger.ZERO;
	    val[1]=A[1].multiply(new BigInteger("3"));
	    for(int i=2;i<=N;i++)
	        val[i]=val[i-1].add(sum[i-1].multiply(new BigInteger("2")).add(A[i].multiply(new BigInteger("3"))));
	    dp[0]=BigInteger.ZERO;
	    BigInteger tmp;
	    for(int i=1;i<=N;i++)
	    {
	    	dp[i]=new BigInteger("-1");
	        for(int j=0;j<i;j++)
	        {
	        	tmp=dp[j].add(val[i])
	        			.subtract(val[j])
	        			.subtract(sum[j].multiply(new BigInteger(""+(2*(i-j)))))
	        			.add(A[i].multiply(new BigInteger("2")))
	        			.add(new BigInteger(""+((long)(i-j+1)*X)));
	            if(dp[i].equals(new BigInteger("-1"))||dp[i].compareTo(tmp)==1)
	            	dp[i]=tmp;
	        }
	    }
	    System.out.println(dp[N]);
		
		cin.close();
	}

}
