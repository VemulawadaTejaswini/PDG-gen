import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		long[] frol = new long[n];
		long[] fror = new long[n];
		
		long[] min1 = new long[n];
		long[] max1 = new long[n];
		
		long[] min2 = new long[n];
		long[] max2 = new long[n];
		
		for(int i = 0; i < n; i++)
		{
			frol[i] = sc.nextLong();
			max1[i] = frol[i];
			if(i == 0 || frol[i] != frol[i-1])
			{ //new value
				min1[i] = frol[i];
			}
			else
			{ //old value (no new record)
				min1[i] = 1;
			}
		}
		for(int i = 0; i < n; i++)
		{
			fror[i] = sc.nextLong();
		}
		
		
		for(int i = n-1; i >= 0; i--)
		{
			max2[i] = fror[i];
			if(i == n-1 || fror[i] != fror[i+1])
			{ //new value
				min2[i] = fror[i];
			}
			else
			{ //old value (no new record)
				min2[i] = 1;
			}
		}
		
		long MOD = 1000000007l;
		long score = 1;
		for(int i = 0; i < n; i++)
		{
			long min = Math.max(min1[i], min2[i]);
			long max = Math.min(max1[i], max2[i]);
			
			if(min > max)
			{
				System.out.println(0);
				return;
			}
			else
			{
				score = (score * (max-min+1))%MOD;
			}
		}
		while(score<0)score+=MOD;
		System.out.println(score);
		
	}

}
