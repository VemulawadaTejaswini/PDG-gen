//package ABC170;
import java.util.*;
import java.io.*;
import java.lang.*;
class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<n;i++)
		{
			if(hm.containsKey(a[i]))
			{
				hm.put(a[i],hm.get(a[i])+1);
			}
			else
			{
				hm.put(a[i],1);
			}
		}
		//System.out.println(Arrays.toString(a));
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			max=Math.max(a[i], max);
		}
		//System.out.println(max);
		
		int mark[]=new int[max+1];
		
		for(int i=0;i<n;i++)
		{
			int ele=a[i];
			while(ele<=max)
			{
				mark[ele]=mark[ele]+1;
				ele=ele+a[i];
			}
		}
		//System.out.println(mark[86]);
		int count=0;
		for(int i=0;i<n;i++)
		{
			//System.out.println(mark[a[i]]);
			if(mark[a[i]]==1)
			{
				//System.out.println(a[i]);
				count++;
			}
		}
		//System.out.println(Arrays.toString(mark));
		
		/*
		
		//24 11 8 3 16;
		Arrays.sort(a);
		
		boolean yes[]=new boolean[n];
		Arrays.fill(yes,true);
		for(int i=0;i<n;i++)
		{
			if(yes[i])
			{
				if(i<n-1 && a[i]==a[i+1])
				{
					yes[i]=false;
					yes[i+1]=false;
				}
				for(int j=i+1;j<n;j++)
				{
					if(a[j]%a[i]==0)
					{
						yes[j]=false;
					}
				}
			}
		}
		
		int count=0;
		for(int i=0;i<n;i++)
		{
			if(yes[i])
			{
				count++;
			}
		}*/
		System.out.println(count);
		
		

	}

}
