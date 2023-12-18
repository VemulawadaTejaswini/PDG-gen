

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static int ub(List<Integer> a,int low,int high,int element)
	{
		while(low<high)
		{
			int mid=low+(high-low)/2;
			if(a.get(mid)>element)
			{
				high=mid;
			}else {
				low=mid+1;
			}
			
		}
		return low;
	}
	
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int ar[]=new int[n];
		for(int i=n-1;i>=0;i--)
		{
			ar[i]=scan.nextInt();
		}
		ArrayList<Integer> ans=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			int x=ub(ans,0,ans.size(),ar[i]);
			System.out.println(x+ " for"+ar[i]);
			if((x+1)>ans.size())
			{
				ans.add(ar[i]);
			}else {
				ans.set(x,ar[i]);
			}
		}
		System.out.println(ans.size());
	}
}
