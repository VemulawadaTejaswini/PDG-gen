

import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	static class Student
	{
		ArrayList<Record> recs = new ArrayList<>();
		int id;
		
		public Student(int i)
		{
			id = i;
		}
	}
	
	static class Record
	{
		int time;
		int pc;
		int type;
		
		public Record(int t, int p, int ty)
		{
			time = t;
			pc = p;
			type = ty;
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			int pcs = sc.nextInt(); //1000
			int studs = sc.nextInt(); //10000
			
			if(pcs == 0 && studs == 0)return;
					
			int recs = sc.nextInt(); //1000
			
			Student[] sts = new Student[studs];
			
			for(int i = 0; i < studs; i++)
			{
				sts[i] = new Student(i);
			}
			
			
			for(int i = 0; i < recs; i++)
			{
				int time = sc.nextInt();
				int pc = sc.nextInt()-1;
				int stud = sc.nextInt()-1;
				int s = sc.nextInt(); //1 = login
				
				sts[stud].recs.add(new Record(time, pc, s));
			}
			
			int que = sc.nextInt(); //50
			
			for(int i = 0; i < que; i++)
			{
				int ts = sc.nextInt();
				int te = sc.nextInt();
				int stud = sc.nextInt()-1;
				
				Student s = sts[stud];
				
				int comps = 0;
				
				long ans = 0;
				
				int lasttime = 0;
				for(Record r : s.recs)
				{
					if(r.time >= ts)
					{
						if(comps > 0)
						{
							ans += Math.min(r.time, te) - Math.min(Math.max(lasttime, ts), te);
						}
					}
					
					if(r.type == 1)
					{ //login
						comps++;
					}
					else
					{
						comps--;
					}
					
					lasttime = r.time;
				}
				
				if(lasttime < te && comps > 0)
				{
					ans += te - lasttime;
				}
				
				System.out.println(ans);
			}
		}

	}

}

