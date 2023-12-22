

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) 
	{
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			new Cave();
		}
	}
	
	static class Cave
	{
//		List<Integer> xp = new ArrayList<Integer>();
//		List<Integer> yp = new ArrayList<Integer>();
		int x = 0;
		int y = 0;
		float maxD;
		int maxX = 0;
		int maxY = 0;
		
		public Cave()
		{
			while(true)
			{
				int x1 = scan.nextInt();
				int y1 = scan.nextInt();
				
				if(x1 == 0 && y1 == 0)
				{
					//compute
					System.out.println(maxX + " " + maxY);
					return;
				}
				else
				{
					x += x1;
					y += y1;
//					System.out.println("cur pos " + x1 + " " + y1);
					float d = (float) Math.sqrt(x*x + y*y);
					
					if(d > maxD || d == maxD && x > maxX)
					{
						maxD = d;
						maxX = x;
						maxY = y;
					}
				}
			}
		}
	}

}

