import java.util.*;
public class Main
{
	public static class process
	{
		String name;
		int time;
		public process(String n, int t)
		{
			name=n;
			time=t;
		}
		public String getName()
		{
			return this.name;
		}
		
		public int getTime()
		{
			return this.time;
		}
		
		public void run(int t)
		{
			if(this.time-t<0)
			{
				this.time=0;
			}
			else
			{
				this.time = this.time - t;
			}
		}
	}
	
	public static void main(String[] args)
	{
		Queue<process> q = new LinkedList<process>();
		Scanner in = new Scanner(System.in);
		int procs = in.nextInt();
		int lot = in.nextInt();
		for(int c = 0; c < procs ; c++)
		{
			q.add(new process(in.next(),in.nextInt()));
		}
		in.close();
		
		//start of algorithm
		int runTime = 0;
		while(!q.isEmpty())
		{
			process p = q.poll();
			int remainingPTime = p.getTime();
			p.run(lot);
			if(p.time == 0)
			{
				runTime+= remainingPTime;
				System.out.println(p.getName()+" "+runTime);
			}
			else 
			{
				runTime+=lot;
				q.add(p);
			}
		}
	}
}
