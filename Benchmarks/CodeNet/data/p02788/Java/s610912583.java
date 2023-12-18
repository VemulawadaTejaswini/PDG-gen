import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		
		int n=s.nextInt();
		long d=2*s.nextInt()+1;
		long a=s.nextInt();
		
		pair[] arr=new pair[n];
		
		for(int i=0;i<n;i++)
		{
			int pos=s.nextInt();
			int power=s.nextInt();
			
			pair p=new pair(pos,power);
			arr[i]=p;
		}
		
		Arrays.sort(arr,new comp());
		
		long[] diff=new long[n+1];
		diff[0]=arr[0].power;
		
		for(int i=1;i<n;i++)
		{
			diff[i]=arr[i].power-arr[i-1].power;
		}
		
		long ans=0;
		
		for(int i=0;i<n;i++)
		{
			if(diff[i]>0)
			{
				double left=diff[i];
				long moves=(long)Math.ceil(left/a);
				ans=ans+moves;
				diff[i]=diff[i]-moves*a;
				diff[i+1]=diff[i+1]+diff[i];
				
				int index=bs(arr,arr[i].pos+d,n);
				diff[index]=diff[index]+moves*a;
			}
			else
			{
				diff[i+1]=diff[i+1]+diff[i];
			}
			
		}
		
		System.out.println(ans);
		
	}
	
	public static int bs(pair[] arr,long range,int n)
	{
		int start=0;
		int end=n-1;
		
		int ans=-1;
		
		while(start<=end)
		{
			int mid=(start+end)/2;
			
			if(arr[mid].pos<=range)
			{
				ans=mid;
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		
		return ans+1;
	}
	
}

class pair
{
	int pos;
	long power;
	
	public pair(int pos,long power)
	{
		this.pos=pos;
		this.power=power;
	}
}

class comp implements Comparator<pair>
{
	public int compare(pair a,pair b)
	{
		return a.pos-b.pos;
	}
}