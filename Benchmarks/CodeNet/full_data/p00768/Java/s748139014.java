

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main 
{
	static class C implements Comparator<Team>
	{

		@Override
		public int compare(Team arg0, Team arg1) 
		{
			int a = arg1.solved - arg0.solved;
			if(a == 0) a = arg0.time - arg1.time;
			
			return a;
		}
		
	}
	
	static class C2 implements Comparator<Team>
	{

		@Override
		public int compare(Team arg0, Team arg1) 
		{
			int a = arg1.solved - arg0.solved;
			if(a == 0) a = arg0.time - arg1.time;
			if(a == 0) a = arg1.index - arg0.index;
			
			return a;
		}
		
	}
	
	static class Team
	{
		int index;
		int solved;
		int time;
		
		public Team(int i)
		{
			index = i;
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		while(true)
		{
			int m = sc.nextInt();
			int t = sc.nextInt();
			int p = sc.nextInt();
			int r = sc.nextInt();
			
			if(m == 0 && t == 0 && p == 0 && r == 0)return;
			
			int[][] attempts = new int[p][t];
			
			Team[] tim = new Team[t];
			for(int i = 0; i < t; i++)
			{
				tim[i] = new Team(i+1);
			}
			
			for(int i = 0; i < r; i++)
			{
				int min = sc.nextInt();
				int team = sc.nextInt()-1;
				int prob = sc.nextInt()-1;
				boolean solved = sc.nextInt() == 0;
				
				if(solved)
				{
					
					tim[team].solved++;
					tim[team].time += min + (attempts[prob][team] * 20);
				}
				else
				{
					attempts[prob][team]++;
				}
			}
			
			C c = new C();
			C2 c2 = new C2();
			Arrays.sort(tim, c2);
			
			for(int i = 0; i < t; i++)
			{
				System.out.print(tim[i].index);
				
				if(i < t-1)
				{
					if(c.compare(tim[i], tim[i+1]) == 0)
					{
						System.out.print("=");
					}
					else
					{
						System.out.print(",");
					}
				}
			}
			System.out.print("\n");
		}

	}

}

