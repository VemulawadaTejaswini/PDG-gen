import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long c = sc.nextLong(); //circumference
		long[] x = new long[n];
		long[] v = new long[n];
		
		for(int i = 0; i < n; i++)
		{
			long pos = sc.nextLong();
			long val = sc.nextLong();
			
			x[i] = pos;
			v[i] = val;
		}
		
		long max = 0;
		long[] str = new long[n]; //if straight right into
		long[] maxstr = new long[n]; //if straight right into
		long cur = 0;
		for(int i = 0; i < n; i++)
		{
			cur += v[i];
			str[i] = cur - x[i];
			if(i>0)maxstr[i] = Math.max(maxstr[i-1], str[i]);
			else maxstr[i] = str[i];
			
			max = Math.max(max, str[i]);
		}
//		System.out.println(Arrays.toString(maxstr));
		
		long[] stl = new long[n]; //if straight left into
		long[] maxstl = new long[n]; //if straight left into
		cur = 0;
		for(int i = n-1; i >= 0; i--)
		{
			cur += v[i];
			stl[i] = cur - (c-x[i]);
			if(i<n-1)maxstl[i] = Math.max(maxstl[i+1], stl[i]);
			else maxstl[i] = stl[i];
			
			max = Math.max(max, stl[i]);
		}
		
		for(int i = 0; i < n-1; i++)
		{ //straight to here, then turn back!
			cur = str[i] + maxstl[i+1] - x[i];
			if(cur > max)
			{
				max = cur;
//				System.out.println("A Does " + cur + " at " + i);
			}
		}
		
		for(int i = n-1; i > 0; i--)
		{ //straight to here, then turn back!
			cur = stl[i] + maxstr[i-1] - (c-x[i]);
			if(cur > max)
			{
				max = cur;
//				System.out.println("B Does " + cur + " at " + i);
//				System.out.println(stl[i] + " " + maxstr[i-1] + " " + (c-x[i]));
			}
		}
		
		System.out.println(max);
	}

}
