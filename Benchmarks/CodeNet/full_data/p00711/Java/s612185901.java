

import java.util.Scanner;
import java.util.Stack;

public class Main 
{
	static class Spot
	{
		int x;
		int y;
		
		public Spot(int x, int y)
		{
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			int w = sc.nextInt();
			if(w == 0)break;
			int h = sc.nextInt();
			boolean[][] grid = new boolean[w][h];
			
			int startx = -1;
			int starty = -1;
			
			for(int y = 0; y < h; y++)
			{
				String s = sc.next();
				for(int x = 0; x < w; x++)
				{
					grid[x][y] = (s.charAt(x) == '.' || s.charAt(x) == '@');
					if(!grid[x][y])
					{
//						System.out.println("WALL " + x + " " +y);
					}
					
					if(s.charAt(x) == '@')
					{
						startx = x;
						starty = y;
					}
				}
			}
			int count = 0;
			
			Stack<Spot> queue = new Stack<Spot>();
			
			queue.add(new Spot(startx, starty));
			
			while(!queue.isEmpty())
			{
				Spot spot = queue.pop();
				int x = spot.x;
				int y = spot.y;
				if(grid[x][y])
				{
					grid[x][y] = false;
					count++;
					
//					System.out.println("Add " + x + " " + y);
					
					if(x > 0 && grid[x-1][y])queue.add(new Spot(x-1, y));
					if(y > 0 && grid[x][y-1])queue.add(new Spot(x, y-1));
					if(x < w-1 && grid[x+1][y])queue.add(new Spot(x+1, y));
					if(y < h-1 && grid[x][y+1])queue.add(new Spot(x, y+1));
				}
				else
				{
//					System.out.println("False: " + x + " " + y);
				}
			}
			
			System.out.println(count);
		}


	}

}

