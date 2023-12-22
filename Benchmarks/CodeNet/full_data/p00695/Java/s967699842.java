import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	
	static int[][] map;
	
	static int calc(int sx, int sy, int tx, int ty)
	{
		Boolean ok = true;
		for(int x = sx;x <= tx;x++)
			for(int y = sy;y <= ty;y++)
			{
				if(map[y][x] == 0) ok = false;
			}
		
		if(ok)
			return (tx - sx + 1) * (ty - sy + 1);
		else
			return 0;
	}
	
	static void start()
	{
		int max = 0;
		
		for(int y = 0;y < 5;y++)
			for(int x = 0;x < 5;x++)
				for(int yy = y;yy < 5;yy++)
					for(int xx = x;xx < 5;xx++)
					{
						int tmp = calc(x, y, xx, yy);
						max = Math.max(max, tmp);
					}
		
		System.out.println(max);
	}
	
	public static void main(String[] args)
	{
		
		Scanner sca = new Scanner(System.in);
		
		while(true)
		{
			int m = sca.nextInt();

			for(;m > 0;m--)
			{
				map = new int[5][5];
				for(int y = 0;y < 5;y++)
					for(int x = 0;x < 5;x++)
						map[y][x] = sca.nextInt();
				
				start();
			}
			
			break;
		}
	}
}