import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main 
{
	static class C implements Comparator<Job>
	{

		@Override
		public int compare(Job o1, Job o2) 
		{
			return o1.del - o2.del;
		}
	}
	
	static class Job
	{
		long rew;
		long del;
		
		public Job(int r, int d)
		{
			rew = r;
			del = d;
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Job[] job = new Job[n];
		
		for(int i = 0; i < n; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			job[i] = new Job(b,a);
		}
		C c = new C();
		Arrays.sort(job,c);
		int cur = 0;
		PriorityQueue<Long> pq = new PriorityQueue<>(Collections.reverseOrder());
		long sum = 0;
		for(int x = m; x >= 1; x--)
		{
			int accdel = m-x+1;
//			System.out.println("Day " + x + ", accdel " + accdel);
//			if(cur<n)System.out.println("Nextacc " + job[cur].del);
			while(cur < n && job[cur].del <= accdel)
			{
//				if(cur<n)System.out.println("Add new job");
				pq.add(job[cur].rew);
				cur++;
			}
			if(!pq.isEmpty())
			{
				sum += pq.poll();
//				System.out.println("Take " + sum);
			}
		}
		System.out.println(sum);

	}

}
