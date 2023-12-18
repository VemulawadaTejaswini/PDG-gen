

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class pair{
	int a;
	int b;
	pair(int x,int y)
	{
		a=x;
		b=y;
	}
}

class compare implements Comparator<pair>{

	@Override
	public int compare(pair o1, pair o2) {
		if(o1.b>o2.b)
		{
			return -1;
			
		}
		else if(o1.b<o2.b)
		{
			return 1;
		}else
		{
			return 0;
		}
	}
	
}
public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=scan.nextInt();
		}
		pair cng[]=new pair[m];
		
		for(int i=0;i<m;i++)
		{
		cng[i]=new pair(scan.nextInt(),scan.nextInt());	
		}
		Arrays.parallelSort(cng,new compare());
		//try to change the smallest values of orginal arrays with the biggest values form array m
		Arrays.parallelSort(ar);
		int x=0;
		int y=0;
		while(x<m)
		{
			int times=cng[x].a;
			int val=cng[x].b;
			while(times>0 && ar[y]<val && y<n)
			{
				ar[y]=val;
				y++;
				times--;
			}
			x++;
		}
		long sum=0;
		for(int i=0;i<n;i++)
		{
			sum+=ar[i];
		}
		System.out.println(sum);
	}
	
}
