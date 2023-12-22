import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		for(;;)
		{
			int N = sc.nextInt();
			if (N==0)break;
			
			int[][] is = new int[N][2];
			int[] time = new int[86400];
			for (int i = 0; i < N; i++)
			{
				String t1 = sc.next();
				String t2 = sc.next();
				is[i][0] = toSec(t1);
				is[i][1] = toSec(t2);
			}
			for (int i = 0; i < N; i++)
			{
				for (int s = is[i][0]; s <= is[i][0]; s++)
				{
					time[s]++;
				}
			}
			int max = 0;
			for (int i = 0; i < 86400; i++)
			{
				max = Math.max(max, time[i]);
			}
			System.out.println(max);
		}
	}
	
	private static int toSec(String s)
	{
		String[] parts = s.split(":");
		int sec = 0;
		for (int i = 0; i < 3; i++)
		{
			sec = 60 * sec + Integer.parseInt(parts[i]);
		}
		return sec;
	}
}