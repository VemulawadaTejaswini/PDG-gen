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
	static int[][] scedule;
	
	public static void main(String[] args)
	{
		Scanner sca = new Scanner(System.in);
		
		scedule = new int[50][30];
		
		while(true)
		{
			n = sca.nextInt();
			if(n == 0) break;
			
			int i, j, k;
			for(i = 0;i < n;i++)
				for(j = 0;j < 30;j++)
					scedule[i][j] = 0;
			
			
			for(i = 0;i < n;i++)
			{
				int m = sca.nextInt();
				for(j = 0;j < m;j++) scedule[i][sca.nextInt() - 1] = 1;
			}
			
			int[] unit = new int[n];
			for(i = 0;i < n;i++)
				unit[i] = -1;
			
			// unitづくり
			Boolean answer = false;
			for(i = 0;i < 30;i++)
			{
				// unitづくり
				for(j = 0;j < n;j++)
				{
					if(scedule[j][i] == 0) continue;
					
					if(unit[j] < 0)
					{
						unit[j] = i;
						continue;
					}
					
					if(unit[j] == i) continue;
					
					int pre = unit[j];
					for(k = 0;k < n;k++)
					{
						if(unit[k] == pre) unit[k] = i;
					}
				}
				
				// check
				int count = 0;
				for(j = 0;j < n;j++) if(unit[j] < 0) count++;
				if(count == 0)
				{
					answer = true;
					break;
				}
			}
			
			if(answer)
				System.out.println(unit[0] + 1);
			else
				System.out.println("-1");
		}
	}
}