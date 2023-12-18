import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		long n = sc.nextLong();
		long k = sc.nextLong();
		
		long MOD = 1000000007;
		long[] sum = new long[200002];
		long[] summax = new long[200002];
		
		sum[1] = 0;
		summax[1] = n;
		for(int i = 2; i < 200002; i++)
		{
			sum[i] = (sum[i-1] + (i-1))%MOD;
			while(sum[i]<0)sum[i]+=MOD;
			
			summax[i] = (summax[i-1] + ((n)-i+1))%MOD;
			while(summax[i]<0)summax[i]+=MOD;
		}
		
		for(int i = 0; i <= n+1; i++)
		{
//			System.out.println(sum[i] + " " + summax[i]);
		}
		
		long score = 0;
		for(int i = (int)k; i <= n+1; i++)
		{
			//try choosing i numbers
			score = (score +  (summax[i] - sum[i])+1)%MOD;
			while(score<0)score+=MOD;
			
		}
		if(score<0)score+=MOD;
		System.out.println(score);
	}

}
