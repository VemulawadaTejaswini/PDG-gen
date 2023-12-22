import java.util.Scanner;


public class Main
{
	static int[][] map = new int[8][8];
	
	static int[][][] peace =
		{
			{
				{1,1,0,0},
				{1,1,0,0},
				{0,0,0,0},
				{0,0,0,0},
			},
			{
				{1,0,0,0},
				{1,0,0,0},
				{1,0,0,0},
				{1,0,0,0},
			},
			{
				{1,1,1,1},
				{0,0,0,0},
				{0,0,0,0},
				{0,0,0,0},
			},
			{
				{0,1,0,0},
				{1,1,0,0},
				{1,0,0,0},
				{0,0,0,0},
			},
			{
				{1,1,0,0},
				{0,1,1,0},
				{0,0,0,0},
				{0,0,0,0},
			},
			{
				{1,0,0,0},
				{1,1,0,0},
				{0,1,0,0},
				{0,0,0,0},
			},
			{
				{0,1,1,0},
				{1,1,0,0},
				{0,0,0,0},
				{0,0,0,0},
			},
		};
	
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext();)
		{
			for(int i=0; i<8; i++)
			{
				String s = scanner.next();
				
				for(int j=0; j<8; j++)
				{
					map[i][j] = Integer.parseInt(s.substring(j, j+1));
				}
			}
			
			int id = -1;
			for(int i=0; i<8 && id<0; i++)
			{
				for(int j=0; j<8; j++)
				{					
					if(getPeace(i, j) >= 0)
					{
						id = getPeace(i, j);
						break;
					}
				}
			}
			
			String[] output = {"A", "B", "C", "D", "E", "F", "G"};
			System.out.println(output[id]);
		}
	}
	
	static int getPeace(int h, int w)
	{
		for(int k=0; k<7; k++)
		{
			int sum = 0;
			boolean is = true;
			for(int i=0; i<4; i++)
			{
				for(int j=0; j<4; j++)
				{
					if(h+i>=8 || w+j>=8)
					{
						break;
					}
					if(peace[k][i][j] != map[h+i][w+j])
					{
						is = false;
					}
					else if(map[h+i][w+j]==1 && peace[k][i][j]==1)
					{
						sum ++;
					}
					
				}
			}
			if(is && sum==4)
			{
				return k;
			}
		}
		return -1;
	}
}