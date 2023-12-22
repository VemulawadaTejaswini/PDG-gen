import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static int h;
	static int[][] map;
	
	private static int calc()
	{
		int score = 0;
		
		// 消す
		for(int y = 0;y < h;y++)
		{
			// 消えるのは6通りしか無いので列挙
			if(map[y][0] == map[y][1] && map[y][1] == map[y][2] && map[y][2] == map[y][3] && map[y][3] == map[y][4])
			{
				score += map[y][0] * 5;
				map[y][0] = map[y][1] = map[y][2] = map[y][3] = map[y][4] = 0;
			}
			else if(map[y][0] == map[y][1] && map[y][1] == map[y][2] && map[y][2] == map[y][3])
			{
				score += map[y][0] * 4;
				map[y][0] = map[y][1] = map[y][2] = map[y][3] = 0;
			}
			else if(map[y][1] == map[y][2] && map[y][2] == map[y][3] && map[y][3] == map[y][4])
			{
				score += map[y][1] * 4;
				map[y][1] = map[y][2] = map[y][3] = map[y][4] = 0;
			}
			else if(map[y][0] == map[y][1] && map[y][1] == map[y][2])
			{
				score += map[y][0] * 3;
				map[y][0] = map[y][1] = map[y][2] = 0;
			}
			else if(map[y][1] == map[y][2] && map[y][2] == map[y][3])
			{
				score += map[y][1] * 3;
				map[y][1] = map[y][2] = map[y][3] = 0;
			}
			else if(map[y][2] == map[y][3] && map[y][3] == map[y][4])
			{
				score += map[y][2] * 3;
				map[y][2] = map[y][3] = map[y][4] = 0;
			}
		}
		
		// 落とす
		ArrayList<Integer> stock;
		for(int x = 0;x < 5;x++)
		{
			stock = new ArrayList<Integer>();
			for(int y = 0;y < h;y++)
			{
				if(map[y][x] != 0) stock.add(new Integer(map[y][x]));
			}
			
			for(int y = 0;y < h;y++)
			{
				if(y < stock.size())
					map[y][x] = stock.get(y).intValue();
				else
					map[y][x] = 0;
			}
		}
		
		return score;
	}
	
	private static void start()
	{
		int score = 0;
		while(true)
		{
			int dscore = 0;
			dscore = calc();
			if(dscore == 0) break;
			score += dscore;
		}
		
		System.out.println(score);
	}
	
	public static void main(String[] args)
	{
		Scanner sca = new Scanner(System.in);
		
		while(true)
		{
			h = sca.nextInt();
			if(h == 0) break;
			
			map = new int[h][5];
			for(int y = h-1;y >= 0;y--)
				for(int x = 0;x < 5;x++)
					map[y][x] = sca.nextInt();
			
			start();
		}
	}
}