
import java.util.Scanner;

public class Main 
{
	static int w;
	static int h;
	static Scanner scan = new Scanner(System.in);
	static int[][] map;
	static int count = 0;
	
	static void vanquish(int xpos, int ypos)
	{
		if(xpos < 0 || ypos < 0 || xpos >= w || ypos >= h) {return;}
		if(map[xpos][ypos] == 1)
		{
			map[xpos][ypos] = 0;
			vanquish(xpos+1,ypos);
			vanquish(xpos-1,ypos);
			vanquish(xpos,ypos+1);
			vanquish(xpos,ypos-1);
			vanquish(xpos-1,ypos-1);
			vanquish(xpos+1,ypos-1);
			vanquish(xpos+1,ypos+1);
			vanquish(xpos-1,ypos+1);
		}
	}

	public static void main(String[] args) 
	{
		while(true)
		{
			w = scan.nextInt();
			h = scan.nextInt();
			if(w == 0) {break;}
			count = 0;
			
			map = new int[w][h];
			
			for(int i = 0; i < h; i++)
			{
				for(int j = 0; j < w; j++)
				{
					map[j][i] = scan.nextInt();
				}
			}
			
			for(int i = 0; i < h; i++)
			{
				for(int j = 0; j < w; j++)
				{
					if(map[j][i] == 1)
					{
						count += 1;
						vanquish(j,i);
					}
				}
			}
			
			System.out.println(count);
			
			
		}
	}

}

