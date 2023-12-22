import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		double k=s.nextInt();
		
		double[] arr=new double[n];
		
		double max=0;
		
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			
			max=Math.max(max,arr[i]);
		}
		
		long start=0;
		long end=1000000001;
		
		double ans=max;
		
		while(start<=end)
		{
			long mid=(start+end)/2;
			
			double count=0;
			
			for(int i=0;i<n;i++)
			{
				count=count+Math.floor(arr[i]/mid);
			}
			
			if(count<=k)
			{
				ans=mid;
				end=mid-1;
			}
			else
			{
				start=mid+1;
			}
			
		}
		
		System.out.println((long)Math.min(ans,max));
		
	}
	
}