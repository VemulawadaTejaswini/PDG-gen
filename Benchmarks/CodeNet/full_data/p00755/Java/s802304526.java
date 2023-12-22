
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main 
{
	static class Grid
	{
		int x;
		int y;
		
		public Grid(int x0, int y0)
		{
			x = x0;
			y = y0;
		}
	}
	
	static int colors = 6;
	static int tar = 5;
	static int c = 0;
	static int[][] pan;
	static int w, h;	
	static int max = -1;
	static void fil(int[] ar)
	{
//		int k = 0;
		
//		int[][] m = pan.clone();
		
		ArrayList<Grid> pen = new ArrayList<Grid>();
		pen.add(new Grid(0,0));
		
		boolean[][] in = new boolean[w][h];
		in[0][0] = true;
		
		int check = 0;
		while(check < pen.size())
		{
			Grid p = pen.get(check);
//			System.out.println("Checking " + p.x + " " + p.y);
			for(int d = 0; d < 4; d++)
			{
				int xp = p.x;
				int yp = p.y;
				
				if(d==0)xp++;
				else if(d==1)xp--;
				else if(d==2)yp++;
				else if(d==3)yp--;
				
				if(xp >= 0 && xp < w && yp >= 0 && yp < h)
				{
					if(!in[xp][yp] && pan[xp][yp] == pan[0][0])
					{
//						if(true)System.out.println("COL " + pan[0][0] + ", " + xp + " " + yp);
						pen.add(new Grid(xp, yp));
						in[xp][yp] = true;
					}
				}
			}	
			check++;
		}
		

		
		boolean debug = false;
		if(ar[0] == 5 && ar[1] == 2 && ar[2] == 3 && ar[3] == 1 && ar[4] == 4)
		{
//			debug = true;
		}
		
		if(debug)System.out.println(Arrays.toString(ar));

		
		
		
		for(int i = 0; i < 5; i++)
		{
			int col = ar[i];
			int cursize = pen.size();
			
			if(debug)System.out.println("doing col " + col + " (->" + (col+1) + "), cursize " + cursize);
			if(debug)
			{
				for(Grid p : pen)
				{
					System.out.println("panel " + p.x + " " + p.y);
				}
			}
			
			for(int pi = 0; pi < pen.size(); pi++)
			{
				Grid p = pen.get(pi);
				
				
				if(pi < cursize || pan[p.x][p.y] == col)
				for(int d = 0; d < 4; d++)
				{
					int xp = p.x;
					int yp = p.y;
					
					if(d==0)xp++;
					else if(d==1)xp--;
					else if(d==2)yp++;
					else if(d==3)yp--;
					
					if(xp >= 0 && xp < w && yp >= 0 && yp < h)
					{
						if(!in[xp][yp] && pan[xp][yp] == col)
						{
							if(debug)System.out.println("COL " + col + ", " + xp + " " + yp);
							pen.add(new Grid(xp, yp));
							in[xp][yp] = true;
						}
					}
				}
			}
		}
		
		max = Math.max(max, pen.size());
		if(debug)System.out.println(pen.size());
	}
			
	static void cyc(int[] ar, int t)
	{
		if(t <= 3)
		{
			for(int i = 0; i < colors; i++)
			{
				if(t <= 0 || ar[t-1] != i)
				{
					int[] arc = ar.clone();
					arc[t] = i;
					cyc(arc, t+1);
				}
			}
		}
		else
		{
			c++;
			ar[4] = tar;
			fil(ar);
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
//		System.out.println(c);
		
		while(true)
		{
			h = sc.nextInt();
			w = sc.nextInt();
			tar = sc.nextInt()-1;
			
			if(h == 0 && w == 0 && tar == -1)return;
			
			pan = new int[w][h];
			max = -1;
			
			for(int y = 0; y < h; y++)
			{
				for(int x = 0; x < w; x++)
				{
					pan[x][y] = sc.nextInt()-1;
				}
			}
			cyc(new int[]{0, -1, -1, -1 ,-1}, 0);
			System.out.println(max);
		}
	}

}
