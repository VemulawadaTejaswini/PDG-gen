import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
		{
			int s = stdIn.nextInt();
			if(s == 0)
			{
				break;
			}
			int t = stdIn.nextInt();
			Queue<Integer> que1 = new ArrayDeque<Integer>();
			Queue<Integer> que2 = new ArrayDeque<Integer>();
			boolean[] flag1 = new boolean[t + 1];
			boolean[] flag2 = new boolean[s + 1];
			int count1 = 0;
			int count2 = 0;
			if(s == 1)
			{
				++count1;
			}
			que1.add(1);
			while(!que1.isEmpty())
			{
				int n = que1.poll();
				if(n * 2 <= t && !flag1[n * 2])
				{
					flag1[n * 2] = true;
					que1.add(n * 2);
					++count1;
				}
				if(n * 3 <= t && !flag1[n * 3])
				{
					flag1[n * 3] = true;
					que1.add(n * 3);
					++count1;
				}
				if(n * 5 <= t && !flag1[n * 5])
				{
					flag1[n * 5] = true;
					que1.add(n * 5);
					++count1;
				}
			}
			que2.add(1);
			while(!que2.isEmpty())
			{
				int n = que2.poll();
				if(n * 2 < s && !flag2[n * 2])
				{
					flag2[n * 2] = true;
					que2.add(n * 2);
					++count2;
				}
				if(n * 3 < s && !flag2[n * 3])
				{
					flag2[n * 3] = true;
					que2.add(n * 3);
					++count2;
				}
				if(n * 5 < s && !flag2[n * 5])
				{
					flag2[n * 5] = true;
					que2.add(n * 5);
					++count2;
				}
			}
			System.out.println(count1 - count2);
		}
	}
}