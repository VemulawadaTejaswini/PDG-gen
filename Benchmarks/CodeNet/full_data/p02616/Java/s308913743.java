

import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		ArrayList<Integer> arr = new ArrayList<Integer>();
		boolean allneg = true;
		int mod=(int) (1e9+7);
		int numneg = 0;
		for(int i = 0; i < n; i++)
		{
			int x = in.nextInt();
			arr.add(x);
			if(x > 0) allneg = false;
			else numneg++;
		}
		Collections.sort(arr, (a, b) -> Math.abs(b) - Math.abs(a));
		
		long sum = 1;
		if(allneg)
		{
			if(k % 2 == 1)
			{
				for(int i = n - 1; i >= n - k; i--)
				{
					sum *= arr.get(i);
					sum %= mod;
				}
			}
			else
			{
				for(int i = 0; i < k; i++)
				{
					sum *= arr.get(i);
					sum %= mod;
				}
			}
			if(sum < 0) sum += mod;
			System.out.println(sum);
		}
		else
		{
			Queue<Integer> q = new LinkedList<Integer>();
			boolean[] vis = new boolean[n];
			for(int i = 0; i < n; i++)
			{
				if(vis[i]) continue;
				if(arr.get(i) < 0)
				{
					if(numneg == 1) continue;
					q.add(arr.get(i));
					vis[i] = true;
					for(int j = i + 1; j < n; j++)
					{
						if(arr.get(j) < 1) 
						{
							vis[j] = true;
							q.add(arr.get(j));
							numneg -= 2;
							break;
						}
					}
				}
				else
				{
					q.add(arr.get(i));
					vis[i] = true;
				}
			}
			
			for(int i = 0; i < k; i++)
			{
				sum *= q.poll();
				sum %= mod;
			}
			if(sum < 0) sum += mod;
			System.out.println(sum);
		}
		
		
		
		
		
		

	}
}
