import java.util.Scanner;
import java.math.BigInteger;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		long[]x=new long[n];
		long[]y=new long[m];
		for(int i=0;i<n;i++)x[i]=sc.nextLong();
		for(int i=0;i<m;i++)y[i]=sc.nextLong();
		//sort suru
		Arrays.sort(x);
		Arrays.sort(y);
		
		BigInteger ans = BigInteger.ZERO;
		BigInteger temp = BigInteger.ZERO;
		ans=ans.add(BigInteger.valueOf((x[n-1]-x[0])*(y[m-1]-y[0])));
		ans=ans.multiply(BigInteger.valueOf((long)Math.pow(2,n+m-4)));
		temp=ans.divide(BigInteger.valueOf(1000000007));
		temp=temp.multiply(BigInteger.valueOf(1000000007));
		ans=ans.subtract(temp);
		System.out.println(ans);
	}
}
