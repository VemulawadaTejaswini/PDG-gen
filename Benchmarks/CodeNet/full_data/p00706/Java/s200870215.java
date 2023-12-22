import java.io.FileInputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
	
	static int n, w, h;
	static int[] x, y;
	static int s, t;
	
	static void start()
	{
		int[][] count = new int[h][w];
		for(int yy = 0;yy < h;yy++)
			for(int xx = 0;xx < w;xx++)
				count[yy][xx] = 0;
		
		for(int i = 0;i < n;i++)
		{
			for(int yy = y[i]-t;yy < y[i];yy++)
				for(int xx = x[i]-s;xx < x[i];xx++)
				{
					if(yy < 0 || xx < 0) continue;
					count[yy][xx]++;
				}
		}
		
		int max = 0;
		for(int yy = 0;yy < h;yy++)
			for(int xx = 0;xx < w;xx++)
				max = Math.max(count[yy][xx], max);
		
		System.out.println(max);
	}
	
	public static void main(String[] args)
	{
		
		Scanner sca = new Scanner(System.in);
		
		while(true)
		{
			n = sca.nextInt();
			if(n == 0) break;
			
			w = sca.nextInt();
			h = sca.nextInt();
			
			x = new int[n];
			y = new int[n];
			for(int i = 0;i < n;i++)
			{
				x[i] = sca.nextInt();
				y[i] = sca.nextInt();
			}
			
			s = sca.nextInt();
			t = sca.nextInt();
			
			start();
		}
	}
}