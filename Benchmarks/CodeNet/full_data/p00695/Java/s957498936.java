import java.util.Scanner;
import java.io.IOException;

class Main 
{
	private static final int SIZE = 5;
	private static Scanner sc = new Scanner(System.in);
	private static int[][] field;

	public static void main(String[] args) throws IOException
	{
		int N = getNumOfMap();
		int ans;

		for(int i = 0; i < N; i++)
		{
			initArray();
			ans = search();
			System.out.println(ans);
		}
	}

	public static int getNumOfMap() throws IOException
	{
		return sc.nextInt();
	}

	public static void initArray() throws IOException
	{
		field = new int[SIZE][SIZE];

		for(int i = 0; i < SIZE; i++)
		{
			for(int j = 0; j < SIZE; j++)
			{
				field[i][j] = sc.nextInt();
			}
		}
	}

	private static void addRow()
	{
		for(int i = 1; i < SIZE; i++)
		{
			for(int j = 0; j < SIZE; j++)
			{
				if(field[i][j] != 0)
				{
					field[i][j] += field[i - 1][j];	
				}
			}
		}
	}

	private static int[] addLine(int sx, int sy)
	{
		int N;
		int[] ans, tmp;
		int[] empty = {0};

		for(N = sx; N < SIZE; N++)
		{
			if(field[sy][N] == 0)
			{
				break;
			}
		}

		if(N == sx)
		{
			return empty;
		}
		else
		{
			ans = new int[N - sx];
		}

		for(int i = 0; i < N - sx; i++)
		{
			ans[i] = myadd(sx, sy, i);
			/*
			for(int j = 0; j < tmp.length; j++)
			{
				tmp[j] = field[sy][i + j];	
			}

			ans[i] = tmp.length * mymin(tmp);
			*/
		}

		return ans;
	}

	private static int myadd(int sx, int sy, int lim)
	{
		int[] tmp = new int[lim + 1];

		for(int i = 0; i < lim + 1; i++)
		{
			if(sx + i == SIZE)
			{
				break;
			}	
			tmp[i] = field[sy][sx + i];
		}
		
		return mymin(tmp) * (lim + 1);
	}

	private static int mymin(int[] data)
	{
		int min = 10000000;
		
		for(int i = 0; i < data.length; i++)
		{
			min = data[i] < min ? data[i]: min;
		}

		return min;
	}

	public static int search()
	{
		int max = 0, tmp;
		int[] ans;

		addRow();		

		for(int y = 0; y < SIZE; y++)
		{
			for(int x = 0; x < SIZE; x++)
			{
				ans = addLine(x, y);
				tmp = mymax(ans);
				max = tmp > max ? tmp: max; 
			}
		}

		return max;
	}

	private static int mymax(int[] data)
	{
		int max = 0;

		for(int i = 0; i < data.length; i++)
		{
			max = data[i] > max ? data[i]: max;
		}

		return max;
	}
}