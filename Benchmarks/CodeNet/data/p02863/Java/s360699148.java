import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int t = sc.nextInt();
		
		long[] score = new long[t];
		long best = 0;
		for(int i = 0; i < n; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			//consider this as last
			for(int x = 0; x < t; x++)
			{
				best = Math.max(best, score[x] + b);
//				System.out.println("take best " + score[x]);
			}
			
			
			long[] scorenew = new long[t];
			//consider this as non last
			for(int x = 0; x < t; x++)
			{
				if(x + a < t)
				{
					scorenew[x+a] = Math.max(score[x+a], score[x] + b);
				}
			}
			for(int x = 0; x < t; x++)
				score[x] = Math.max(score[x],scorenew[x]);
		}

		
		System.out.println(best);
	}

}
