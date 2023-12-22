import java.util.Arrays;
import java.util.Scanner;

public class topcoder1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
     	 static final int MOD = 1000000007; 
		int n=sc.nextInt();
		double[] arr=new double[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextDouble();
		}
		
		Arrays.sort(arr);
		int count=0;
		for(int i=0;i<n-1;i++)
		{
			double prod=1;
			for(int j=i+1;j<n;j++)
			{
				prod=arr[i]*arr[j]%MOD;
				
				if(prod%1==0)
				{
					count++;
				}
			}
		}
		System.out.println(count);
		
		
	}
}
