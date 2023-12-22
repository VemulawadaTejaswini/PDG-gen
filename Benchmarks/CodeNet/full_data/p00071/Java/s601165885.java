import java.util.Scanner;

public class Main
{
	static int[][] map = new int[8][8];
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int n=scanner.nextInt();
		for(int m=0; m<n; m++)
		{
			for(int i=0; i<8; i++)
			{
				String input = scanner.next();
				for(int j=0; j<8; j++)
				{		
					map[i][j] = Integer.parseInt(input.substring(j, j+1));
				}
			}
			
			int x = scanner.nextInt() - 1;
			int y = scanner.nextInt() - 1;
			map[y][x] = 2;
			
			boolean is_chain = false;
			do
			{
				is_chain = false;
				for(int i=0; i<8; i++)
				{
					for(int j=0; j<8; j++)
					{
						if(map[i][j] == 2)
						{
							is_chain = true;
							setBom(i, j);
							map[i][j] = 0;
						}
					}
				}
			}while(is_chain);
			
			System.out.println("Data "+(m+1)+":");
			for(int i=0; i<8; i++)
			{
				for(int j=0; j<8; j++)
				{
					System.out.printf("%1$d%2$s", map[i][j], j<7?"":"\n");
				}
			}
		}
	}
	
	static void setBom(int y, int x)
	{
		for(int i=-3; i<=3; i++)
		{
			if(0<=x+i && x+i<8)
			{
				if(map[y][x+i] == 1)
				{
					map[y][x+i] = 2;
				}
			}
			
			if(0<=y+i && y+i<8)
			{
				if(map[y+i][x] == 1)
				{
					map[y+i][x] = 2;
				}
			}
		}
	}
}