import java.util.Scanner;

public class Main
{
	static String[][] map;
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; ;)
		{
			int n = scanner.nextInt();
			if(n == 0)
			{
				break;
			}
			
			map = new String[n][n];
			for(int i=0; i<n; i++)
			{
				String str = scanner.next();
				for(int j=0; j<n; j++)
				{
					map[i][j] = str.substring(j, j+1);
				}
			}
			
			int max_len = 0;
			for(int i=0; i<n-max_len; i++)
			{
				int len = 0;
				for(int j=0; j<n-max_len; j++)
				{
					len = getLength(j, i, n);
						
					if(max_len < len)
					{
						j += len;
						max_len = len;
					}
				}
			}
			
			System.out.println(max_len);
		}
	}
	
	static int getLength(int w, int h, int n)
	{
		int len = 0;
		
		for(len=0; ; len++)
		{
			int w0 = w + len;
			int h0 = h + len;
			if(w0>=n || h0>=n)
			{
				break;
			}
			
			if(map[h0][w0].equals("*"))
			{
				break;
			}
			
			for(int i=0; i<len; i++)
			{
				if(map[h0][w+i].equals("*") || map[h+i][w0].equals("*"))
				{
					return len;
				}
			}
		}
		
		return len;
	}
}