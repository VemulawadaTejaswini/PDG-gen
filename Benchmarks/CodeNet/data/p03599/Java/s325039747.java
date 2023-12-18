import java.math.BigInteger;
import java.util.Scanner;

public class Main 
{
	static Ratio[][] dp; //water sugar
	
	
	
	static boolean[][] done; //water sugar
	static int h,w;
	static Ratio mm = new Ratio(999,0);
	
//	static long maxwat = 0;
//	static long maxsug = 0;
	
	static class Ratio implements Comparable<Ratio>
	{
		int w;
		int s;
		
		public Ratio(int w0, int s0)
		{
			w = w0;
			s = s0;
		}

		@Override
		public int compareTo(Ratio o) 
		{
			return s*o.w - o.s*w;
		}
	}
	
	static Ratio maxrat(Ratio a, Ratio b)
	{
		if(a.compareTo(b) > 0)return a;
		else return b;
	}
	
	static Ratio go(int wat, int sug)
	{
		Ratio an = new Ratio(wat,sug);
		if(wat*100 + sug > cap)return new Ratio(9999999,0);
		if(wat*e<sug)return new Ratio(9999999,0);
//		System.out.println(wat + " " + sug);
		if(done[wat][sug])return dp[wat][sug];
		
		
		if(an.compareTo(mm) > 0)
		{
			mm = an;
//			maxwat = wat;
//			maxsug = sug;
		}
		an = maxrat(an, go(wat+bot1, sug));
		an = maxrat(an, go(wat+bot2, sug));
		an = maxrat(an, go(wat, sug+sug1));
		an = maxrat(an, go(wat, sug+sug2));
		done[wat][sug]=true;
		dp[wat][sug]=an;
		return an;
	}
	static int bot1,bot2,sug1,sug2, e, cap;

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		bot1 = sc.nextInt();
		bot2 = sc.nextInt();
		
		sug1 = sc.nextInt();
		sug2 = sc.nextInt();
		
		e = sc.nextInt(); //how much sugar can disolve in 1 water
		
		cap = sc.nextInt(); //beaker cap. water is 100x bigger

		h = cap/100;
		w = cap;
		dp = new Ratio[h+1][w];
		done = new boolean[h+1][w];
		
//		System.out.println("HW " + h + " " + w);
		go(0,0);
//		System.out.println((maxwat*100)+maxsug + " " + maxsug);
		if(mm.s == 0)mm.w = bot1;
		System.out.println((mm.w*100)+mm.s+ " " + mm.s);
		
		for(int x = 0; x < w; x++)
		{
			for(int y = 0; y < h; y++)
			{
			}
		}
	}

}
