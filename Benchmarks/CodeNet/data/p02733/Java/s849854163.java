import java.util.Scanner;

public class Main 
{
	static int h,w,k;
	static boolean[][] c;

	static class Division
	{
		int start;
		int fin;
		
		public Division(int s)
		{
			start = s;
		}
	}
	
	static int div(int ca)
	{
		
//		System.out.println(Integer.toString(ca,2));
		int cuts = 0;
		for(int y = 0; y < h-1; y++)
		{
			boolean cut = (mask[y] & ca)>0;
			if(cut)cuts++;
		}
		int an = cuts;
		
		Division[] div = new Division[cuts+1];
		
		int curcut = 0;
		div[0] = new Division(0);
		div[0].fin = h-1; //in case of no further divs
		for(int y = 0; y < h-1; y++)
		{
			boolean cut = (mask[y] & ca)>0;
			
			if(cut)
			{
				div[curcut].fin = y;
				
				curcut++;
				div[curcut] = new Division(y+1);
			}
		}
		div[curcut].fin = h-1;
		int divs = cuts+1;
		
		int[] belongto = new int[h];
		int curd = 0;
		
		for(int i = 0; i < divs; i++)
		{
//			System.out.println(div[i].start + "-" + div[i].fin);
		}

		
		for(int y = 0; y < h; y++)
		{
			if(div[curd].fin < y)curd++;
			belongto[y] = curd;
//			System.out.println(y + " belongs to " + curd + ", fin " + div[curd].fin);
		}
		
		
		int[] load = new int[divs];
		for(int x = 0; x < w; x++)
		{
//			System.out.println("x " + x);
//			System.out.println(div[i].start + "-" + div[i].fin);
			boolean cuthere = false;
			
			for(int y = 0; y < h; y++)
			{
				if(c[y][x])
				{
					load[belongto[y]]++;
					
//					System.out.println("Load of " + belongto[y] + " is now " + load[belongto[y]]);
					
					if(load[belongto[y]] > k)
						cuthere = true; //cut before here so that this one belongs to next load
				}
			}
			if(cuthere)
			{ //fresh new loads
				an++;
				for(int i = 0; i < divs; i++)
					load[i] = 0;
				for(int y = 0; y < h; y++)
				{
					if(c[y][x])
						load[belongto[y]]++;
					if(load[belongto[y]] > k)
					{ //still overloaded! abandon.
						return 99999999;
					}
				}
				
			}
		}
//		System.out.println("Rets " + an + ", cuts " + cuts);
		return an;
	}
	
	static int[] mask = new int[9];
	static int[][] suml;
	
	public static void main(String[] args) 
	{
		int cuma = 1;
		for(int i = 0; i < 9; i++)
		{
			mask[i] = cuma;
			cuma *= 2;
		}
		
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		k = sc.nextInt();
		c = new boolean[h][w];
		suml = new int[h][w];
		
		for(int i = 0; i < h; i++)
		{
			String s = sc.next();
			for(int x = 0; x < w; x++)
			{
				c[i][x] = s.charAt(x) == '1';
//				if(x>0)suml[h][x] = suml[h][x-1];
//				if(c[i][x])suml[h][x]++;
			}
		}
		
		int cases = 1;
		for(int i = 0; i < h-1; i++)
			cases *= 2;
		int mi = 999999999;
		for(int ca = 0; ca < cases; ca++)
		{ //cut after this?
			mi = Math.min(mi, div(ca));
		}
		
//		System.out.println("....");
		System.out.println(mi);
		
	}

}
