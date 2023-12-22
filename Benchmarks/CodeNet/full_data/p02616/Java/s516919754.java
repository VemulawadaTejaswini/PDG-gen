
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt(), k = in.nextInt();;
		ArrayList<Integer> arr = new ArrayList<Integer>(), pos = new ArrayList<Integer>(), neg = new ArrayList<Integer>();
		boolean allneg = true;
		int mod=(int) (1e9+7);

		for(int i = 0; i < n; i++)
		{
			int x = in.nextInt();
			arr.add(x);
			if(x > 0) 
			{
				allneg = false;
				pos.add(x);
			}
			else neg.add(x);
		}
		Collections.sort(arr, (a, b) -> Math.abs(b) - Math.abs(a));
		Collections.sort(pos, (a, b) -> Math.abs(b) - Math.abs(a));
		Collections.sort(neg, (a, b) -> Math.abs(b) - Math.abs(a));
		
		
		long sum = 1;
		if(n == k)
			for(int i = 0; i < n; i++)
			{
				sum *= arr.get(i);
				sum %= mod;
			}
		else if(allneg)
		{
			if(k % 2 == 1)
				for(int i = n - 1; i >= n - k; i--)
				{
					sum *= arr.get(i);
					sum %= mod;
				}
			else
				for(int i = 0; i < k; i++)
				{
					sum *= arr.get(i);
					sum %= mod;
				}
			sum += mod;
		}
		else
		{
			int x = 0, y = 0;
			if(k % 2 == 0)
			{
				int tempk = k;
				while(tempk > 0)
				{
					if(pos.get(x) * pos.get(x + 1) > neg.get(y) * neg.get(y + 1)) 
					{
						sum *= pos.get(x) * pos.get(x + 1);
						sum %= mod;
						x += 2;
						tempk -= 2;
					}
					else 
					{
						sum *= neg.get(y) * neg.get(y + 1);
						sum %= mod;
						y += 2;
						tempk -= 2;
					}
				}
			}
			else
			{
				int tempk = k - 1;
				sum *= pos.get(0);
				sum %= mod;
				x++;
				while(tempk > 0)
				{
					if(pos.get(x) * pos.get(x + 1) > neg.get(y) * neg.get(y + 1)) 
					{
						sum *= pos.get(x) * pos.get(x + 1);
						sum %= mod;
						x += 2;
						tempk -= 2;
					}
					else 
					{
						sum *= neg.get(y) * neg.get(y + 1);
						sum %= mod;
						y += 2;
						tempk -= 2;
					}
				}
			}
		}
		System.out.println(sum);
		
		
		
		
		
		

	}
}
