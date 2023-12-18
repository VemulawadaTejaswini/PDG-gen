import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(), k = scan.nextInt(), round = 0, idx = 0, min = 0, min2, minIdx = -1;
		boolean flag = true;
		int[] a = new int[n];
		
		for (int i = 0; i < n; ++i)
		{
			a[i] = scan.nextInt();
		}
		scan.close();
		while (true)
		{
			round++;
			if (flag)
			{
				min2 = min(a, idx, idx + k);
				fill(a, min2, idx, idx + k);
				if (round == 1)
				{
					min = min2;
				}
				else if (min > min2)
				{
					min = min2;
					minIdx = idx;
				}
				
				if (idx == n - k)
				{
					if (minIdx == -1)
					{
						break;
					}
					idx = minIdx - k + 1;
					flag = false;
				}
				idx += k - 1;
				if (idx > n - k) idx = n - k; 
			}
			else
			{
				idx -= k + 1;
				if (idx < 0) idx = 0;
				min2 = min(a, idx, idx + k);
				if (idx == 0) break;
			}
		}
		
		System.out.println(round);
		
	}
	
	static int min(int[] a, int start, int end)
	{
		int min = Integer.MAX_VALUE;
		for (int i = start; i < end; i++)
		{
			min = min > a[i] ? a[i] : min;
		}
		return min;
	}
	
	static void fill(int[] a, int n, int start, int end)
	{
		for (int i = start; i < end; i++)
		{
			a[i] = n;
		}
	}
	
}