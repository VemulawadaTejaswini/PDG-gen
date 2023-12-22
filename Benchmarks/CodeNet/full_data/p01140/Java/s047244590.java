import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	
	static int n, m;
	static int[] h, w;
	
	private static int check(int sx, int sy)
	{
		int x, y;
		int width = 0;
		int height = 0;
		int count = 0;
		
		for(x = sx;x < m;x++)
		{
			width += w[x];
			height = 0;
			for(y = sy;y < n;y++)
			{
				height += h[y];
				if(width == height)
				{
					count++;
					break;
				}
				else if(width < height)
				{
					break;
				}
			}
		}
		
		return count;
	}
	
	public static void main(String[] args)
	{
		
		Scanner sca = new Scanner(System.in);
		
		while(true)
		{
			n = sca.nextInt();
			m = sca.nextInt();
			if(n == 0) break;
			
			int i, j, k;
			
			h = new int[n];
			for(i = 0;i < n;i++) h[i] = sca.nextInt();
			
			w = new int[m];
			for(i = 0;i < m;i++) w[i] = sca.nextInt();
			
			int count = 0;
			int x, y;
			for(y = 0;y < n;y++)
			{
				for(x = 0;x < m;x++)
				{
					count += check(x, y);
				}
			}
			
			System.out.println(count);
		}
	}
}