import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main 
{
	static class C implements Comparator<Entry>
	{
		@Override
		public int compare(Entry o1, Entry o2) 
		{
			return o1.l - o2.l;
		}
	}
	static class C2 implements Comparator<Entry>
	{
		@Override
		public int compare(Entry o1, Entry o2) 
		{
			/*
			int an = 0;
			an = o2.l - o1.l;
			if(an == 0)an = o2.r - o1.r;
			return an;
			*/
			int an = 0;
			an = o2.r - o1.r;
			if(an == 0)an = o2.l - o1.l;
			return an;
		}
	}
	
	static class Entry
	{
		int l;
		int r;
		int id;
		
		public Entry(int l0, int r0, int i) 
		{
			l = l0;
			r = r0;
			id = i;
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		C c = new C();
		C2 c2 = new C2();
		PriorityQueue<Entry> q1 = new PriorityQueue<>(c);
		PriorityQueue<Entry> q2 = new PriorityQueue<>(c2);
		
		for(int i = 0; i < n; i++)
		{
			String s = sc.next();
			
			int cur = 0;
			int l = 0;
			for(int j = 0; j < s.length(); j++)
			{
				if(s.charAt(j) == '(')
				{
					cur++;
				}
				else
				{
					cur--;
				}
				l = Math.min(l, cur);
			}
			l*=-1; //entry
			int r = cur; //payoff
//			System.out.println(l + " " + r + " " + s);
			
			if(r < 0)
			{ //do these later
				q2.add(new Entry(l,r, i));
			}
			else
			{ //do these first
				q1.add(new Entry(l,r, i));
			}
		}
		
		long has = 0;
		
		while(!q1.isEmpty())
		{
			Entry en = q1.poll();
//			System.out.println("Consider " + en.l + " " + en.r + ", has " + has);
			//take this
			if(en.l > has)
			{
				System.out.println("No");
				return;
			}
			else
			{
//				System.out.println("Take ");
				has += en.r;
			}
			if(has < 0)
			{
				System.out.println("No");
				return;
			}
		}
		
//		System.out.println("S2");
		
		while(!q2.isEmpty())
		{
			Entry en = q2.poll();
//			System.out.println("Consider " + en.l + " " + en.r + ", has " + has);
			
			//take this
			if(en.l > has)
			{
				System.out.println("No");
				return;
			}
			else
			{
				has += en.r;
			}
			if(has < 0)
			{
				System.out.println("No");
				return;
			}
		}
		
		if(has != 0)
		{
			System.out.println("No");
			return;
		}
		
		System.out.println("Yes");
	}
	

}
