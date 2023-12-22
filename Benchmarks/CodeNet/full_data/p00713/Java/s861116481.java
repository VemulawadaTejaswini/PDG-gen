import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	static int n;
	static double[] px, py;
	
	static int min;
	
	
	public static void main(String[] args)
	{
		
		Scanner sca = new Scanner(System.in);
		
		while(true)
		{
			n = sca.nextInt();
			if(n == 0) break;
			
			px = new double[n];
			py = new double[n];
			
			int i, j;
			for(i = 0;i < n;i++)
			{
				px[i] = sca.nextDouble();
				py[i] = sca.nextDouble();
			}
			
			min = 1;
			for(i = 0;i < n;i++)
			{
				for(j = i + 1;j < n;j++)
				{
					double dx = px[i] - px[j];
					double dy = py[i] - py[j];
					double dd = dx * dx + dy * dy;
					
					if(dd > 4) continue;
					
					// 中心を求める
					double d = Math.sqrt(dd);
					double xm = (px[i] + px[j]) / 2;
					double ym = (py[i] + py[j]) / 2;
					double l = d / 2;
					double e = Math.sqrt(1 - l * l);
					
					double center1x = xm + dy / d * e;
					double center1y = ym - dx / d * e;
					
					double center2x = xm - dy / d * e;
					double center2y = ym + dx / d * e;
					
					// 数える
					int count = 0, k;
					for(k = 0;k < n;k++)
					{
						dx = center1x - px[k];
						dy = center1y - py[k];
						dd = dx * dx + dy * dy;
						if(dd < 1 + 1e-10) count++;
					}
					if(min < count) min = count;
					
					count = 0;
					for(k = 0;k < n;k++)
					{
						dx = center2x - px[k];
						dy = center2y - py[k];
						dd = dx * dx + dy * dy;
						if(dd < 1 + 1e-10) count++;
					}
					if(min < count) min = count;
				}
			}
			
			System.out.println(min);
		}
	}
}