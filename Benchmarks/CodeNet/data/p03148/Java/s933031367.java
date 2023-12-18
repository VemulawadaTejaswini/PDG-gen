

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;
class pur{
	long dat;
	int type;
	pur(long d,int t)
	{
		dat=d;
		type=t;
	}
}
class sortee implements Comparator<pur>{

	@Override
	public int compare(pur o1, pur o2) {
		if(o1.dat>o2.dat)
		{
			return -1;
			
		}else if(o1.dat<o2.dat)
		{
			return 1;
		}else {
			return 0;
		}
	}

	
	
}
public class Main {

	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int k=scan.nextInt();
		int []t=new int[1000007];
		long []d=new long[1000007];
		int[] visited=new int[1000007];
		for(int i=0;i<n;i++)
		{
			t[i]=scan.nextInt();
			d[i]=scan.nextLong();
			
		}
		ArrayList<pur> Lst=new ArrayList<>();
		for(int i=0;i<n;i++)
		{
			Lst.add(new pur(d[i],t[i]));
		}
		Collections.sort(Lst,new sortee());
		PriorityQueue<Long> PQ=new PriorityQueue<>();
		long var=0;
		long sum=0;
		
		for(int i=0;i<k;i++)
		{
			if(visited[Lst.get(i).type]==0)
			{
				var++;
				visited[Lst.get(i).type]=1;
			}else {
				PQ.add(Lst.get(i).dat);
			}
			
			sum+=Lst.get(i).dat;
						
		}
		long max=sum+(var*var);
		for(int i=k;i<n;i++)
		{
			long res=sum;
			if(PQ.isEmpty()) {
				break;
			}
			if(visited[Lst.get(i).type]==0)
			{
				res-=PQ.poll();
				res+=Lst.get(i).dat;
				sum=res;
				res+=((var+1)*(var+1));
				
				var++;
				
				max=Math.max(res, max);
				visited[Lst.get(i).type]=1;
			}
		}
		System.out.println(max);
	}
}
