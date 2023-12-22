import java.util.*;
public class Main{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		List<Long> li=new ArrayList<Long>();
		long arr[]=new long[(int)n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextLong();
		}
		long sum=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i!=j)
				{
					sum=sum^arr[j];
				}
			}
			
			li.add(sum);
			sum=0;
		}
		for(int i=0;i<li.size();i++)
		{
			System.out.print(li.get(i)+" ");
		}
	}
}