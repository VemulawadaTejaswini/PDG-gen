import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main 
{
	static int n, c;
	
	static class CR implements Comparator<RecEntry>
	{

		@Override
		public int compare(RecEntry o1, RecEntry o2) {
			return o1.ready - o2.ready;
		}
	}
	
	static class CP implements Comparator<Prog>
	{

		@Override
		public int compare(Prog o1, Prog o2) 
		{
			int an = o1.s - o2.s;
			if(an == 0)an=o1.t-o2.t;
			return an;
		}
	}
	
	static class Prog
	{
		int s; //start inclusive
		int t; //finish exclusive
		boolean dead = false;
		
		public Prog(int s0, int t0)
		{
			s = s0;
			t = t0;
		}
	}
	
	static class RecEntry
	{
		int recid;
		int ready;
		
		public RecEntry(int id, int time)
		{
			recid = id;
			ready = time;
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		c = sc.nextInt();
		
		CP cp = new CP();
		@SuppressWarnings("unchecked")
		PriorityQueue<Prog>[] chan = new PriorityQueue[c];
		
		for(int i = 0; i < c; i++)
			chan[i] = new PriorityQueue<Prog>(cp);
		
		for(int i = 0; i < n; i++)
		{
			int s = sc.nextInt();
			int t = sc.nextInt();
			int c = sc.nextInt()-1;
			chan[c].add(new Prog(s,t));
		}
		
		int rem = n;
		
		int recs = 0;
		
		CR cr = new CR();
		PriorityQueue<RecEntry> q = new PriorityQueue<>(cr);
		
		while(rem>0)
		{
//			System.out.println("get with rem " + rem);
			//get earliest program
			Prog earliest = null;
			int earchan = -1;
			for(int i = 0; i < c; i++)
			{
//				System.out.println("channel " + i + " has " + chan[i].size());
				Prog prog = chan[i].peek();
				while(prog != null && chan[i].peek().dead)
				{ //this program is already being recorded
					chan[i].poll();
					prog = chan[i].peek();
				}
				if(prog != null)
				{
					if(earliest == null || prog.s < earliest.s)
					{
						earliest = prog;
						earchan = i;
					}
				}
			}
			rem--;
//			System.out.println("get from channel " + earchan);
			
			//assign earliest program & any of its direct continuation(s) to recorder
			//first, get earliest recorder
			RecEntry rec = q.peek();
			int recid = -1;
			if(rec == null || rec.ready > earliest.s)
			{ //new recorder
				recid = recs;
				recs++;
			}
			else 
			{
				recid = rec.recid;
				q.poll();
			}
			//assign
			int end = earliest.t;
			chan[earchan].poll();
			
			while(chan[earchan].peek() != null && chan[earchan].peek().s == end)
			{ //continuations
				Prog last = chan[earchan].poll();
				end = last.t;
				rem--;
			}
			end++; //this recorder needs time to change channel after recording this series
			q.add(new RecEntry(recid, end));
			
		}
		System.out.println(recs);
	}

}
