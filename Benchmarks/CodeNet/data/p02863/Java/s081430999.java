import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main 
{
	static class C implements Comparator<Fud>
	{
		@Override
		public int compare(Fud o1, Fud o2) {
			return o1.a - o2.a;
		}
	}
	
	static class Fud
	{
		int a;
		int b;
		
		public Fud(int a0, int b0)
		{
			a = a0;
			b = b0;
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int t = sc.nextInt();
		
		long[] score = new long[t];
		long best = 0;
		Fud[] fud = new Fud[n];
		for(int i = 0; i < n; i++)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			fud[i] = new Fud(a,b);
		}
		C c = new C();
		Arrays.sort(fud, c);
		
		for(int i = 0; i < n; i++)
		{
			
			//consider this as last
			for(int x = 0; x < t; x++)
			{
				best = Math.max(best, score[x] + fud[i].b);
//				System.out.println("take best " + score[x]);
			}
			
			
			long[] scorenew = new long[t];
			//consider this as non last
			for(int x = 0; x < t; x++)
			{
				if(x + fud[i].a < t)
				{
					scorenew[x+fud[i].a] = Math.max(score[x+fud[i].a], score[x] + fud[i].b);
				}
			}
			for(int x = 0; x < t; x++)
				score[x] = Math.max(score[x],scorenew[x]);
		}

		
		System.out.println(best);
	}

}
