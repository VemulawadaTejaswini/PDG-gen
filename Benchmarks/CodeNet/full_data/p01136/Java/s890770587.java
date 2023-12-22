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
			
			ArrayList<HashSet> having = new ArrayList<HashSet>();
			for(i = 0;i < n;i++)
			{
				HashSet<String> tmp = new HashSet<String>();
				tmp.add(String.valueOf(i));
				having.add(tmp);
			}
			
			int result = -1;
			for(i = 0;i < 30;i++)
			{
				HashSet<String> canget = new HashSet<String>();
				
				for(j = 0;j < n;j++)
				{
					if(scedule[j][i] == 1)
					{
						HashSet<String> tmp = having.get(j);
						canget.addAll(tmp);
					}
				}
				
				if(canget.size() == n)
				{
					result = i + 1;
					break;
				}
				
				for(j = 0;j < n;j++)
				{
					if(scedule[j][i] == 1)
					{
						HashSet<String> tmp = having.get(j);
						tmp.addAll(canget);
					}
				}
			}
			
			System.out.println(result);
		}
	}
}