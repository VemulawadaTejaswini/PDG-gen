
import java.util.*;

public class Main {

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long arr[]=new long[n];
		for(int i=0;i<n;i++) arr[i]=sc.nextLong();
		long sum=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++) sum+=(arr[i]*arr[j]);
			sum%=1000000007;
		}
		System.out.println(sum);
	}
}
