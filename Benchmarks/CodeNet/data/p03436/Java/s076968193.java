import java.util.*;
class Main
{
	static int totrow ,totcol , currow ,curcol;
	static int[][] arr , visit	;
	static long sum =0;

	public static void init()
	{
		visit = new int[totrow][totcol];
	}
	public static void pathfinder1(int row , int col)
	{
		// System.out.println(row+"  "+col);
		if(row!=totrow-1 || col!=totcol-1)
		{
			 if(col+1 < totcol && arr[row][col+1]==1 && visit[row][col+1]==0)//right
			{
				visit[row][col+1]=1;
				sum++;
				currow = row;curcol = col+1;
				pathfinder1(row,col+1);
				// sum--;
			}
			else if(row+1 < totrow && arr[row+1][col]==1 && visit[row+1][col]==0)// down
			{
				visit[row+1][col]=1;
				sum++;
				currow = row+1;curcol = col;
				pathfinder1(row+1,col);
				// sum--;
			}
			else if( row-1 >=0 && arr[row-1][col]==1 && visit[row-1][col]==0)//up
			{
				visit[row-1][col]=1;
				sum++;
				currow = row-1;curcol = col;
				pathfinder1(row-1,col);
				// sum--;
			}
			else if( col-1 >=0 && arr[row][col-1]==1 && visit[row][col-1]==0)//left
			{
				visit[row][col-1]=1;
				sum++;
				currow = row;curcol = col-1;
				pathfinder1(row,col-1);
				// sum--;
			}
			else
			{
				sum--;
				return;
			}
		}

	}

	public static void pathfinder2(int row , int col)
	{
		// System.out.println(row+"  "+col);
		if(row!=totrow-1 || col!=totcol-1)
		{
			if(row+1 < totrow && arr[row+1][col]==1 && visit[row+1][col]==0)// down
			{
				visit[row+1][col]=1;
				sum++;
				currow = row+1;curcol = col;
				pathfinder2(row+1,col);
				// sum--;
			}
			else if(col+1 < totcol && arr[row][col+1]==1 && visit[row][col+1]==0)//right
			{
				visit[row][col+1]=1;
				sum++;
				currow = row;curcol = col+1;
				pathfinder2(row,col+1);
				// sum--;
			}
			else if( row-1 >=0 && arr[row-1][col]==1 && visit[row-1][col]==0)//up
			{
				visit[row-1][col]=1;
				sum++;
				currow = row-1;curcol = col;
				pathfinder2(row-1,col);
				// sum--;
			}
			else if( col-1 >=0 && arr[row][col-1]==1 && visit[row][col-1]==0)//left
			{
				visit[row][col-1]=1;
				sum++;
				currow = row;curcol = col-1;
				pathfinder2(row,col-1);
				// sum--;
			}
			else
			{
				sum--;
				return;
			}
		}

	}

	public static void pathfinder3(int row , int col)
	{
		// System.out.println(row+"  "+col);
		if(row!=totrow-1 || col!=totcol-1)
		{
			 if(col+1 < totcol && arr[row][col+1]==1 && visit[row][col+1]==0)//right
			{
				visit[row][col+1]=1;
				sum++;
				currow = row;curcol = col+1;
				pathfinder3(row,col+1);
				// sum--;
			}
			else if(row+1 < totrow && arr[row+1][col]==1 && visit[row+1][col]==0)// down
			{
				visit[row+1][col]=1;
				sum++;
				currow = row+1;curcol = col;
				pathfinder3(row+1,col);
				// sum--;
			}
			else if( col-1 >=0 && arr[row][col-1]==1 && visit[row][col-1]==0)//left
			{
				visit[row][col-1]=1;
				sum++;
				currow = row;curcol = col-1;
				pathfinder3(row,col-1);
				// sum--;
			}
			else if( row-1 >=0 && arr[row-1][col]==1 && visit[row-1][col]==0)//up
			{
				visit[row-1][col]=1;
				sum++;
				currow = row-1;curcol = col;
				pathfinder3(row-1,col);
				// sum--;
			}
			else
			{
				sum--;
				return;
			}
		}

	}

	public static void pathfinder4(int row , int col)
	{
		// System.out.println(row+"  "+col);
		if(row!=totrow-1 || col!=totcol-1)
		{
			if(row+1 < totrow && arr[row+1][col]==1 && visit[row+1][col]==0)// down
			{
				visit[row+1][col]=1;
				sum++;
				currow = row+1;curcol = col;
				pathfinder4(row+1,col);
				// sum--;
			}
			else if(col+1 < totcol && arr[row][col+1]==1 && visit[row][col+1]==0)//right
			{
				visit[row][col+1]=1;
				sum++;
				currow = row;curcol = col+1;
				pathfinder4(row,col+1);
				// sum--;
			}
			else if( col-1 >=0 && arr[row][col-1]==1 && visit[row][col-1]==0)//left
			{
				visit[row][col-1]=1;
				sum++;
				currow = row;curcol = col-1;
				pathfinder4(row,col-1);
				// sum--;
			}
			else if( row-1 >=0 && arr[row-1][col]==1 && visit[row-1][col]==0)//up
			{
				visit[row-1][col]=1;
				sum++;
				currow = row-1;curcol = col;
				pathfinder4(row-1,col);
				// sum--;
			}
			else
			{
				sum--;
				return;
			}
		}

	}
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		totrow =s.nextInt();
		totcol = s.nextInt();
		arr = new int[totrow][totcol];
		long frst =0  , sec =0 ,thrd =0 ,frth =0; 
		// visit = new int[totrow][totcol];
		int countstr =0 ;
		for(int i =0;i<totrow;i++)
		{
			String line = s.next();
			for(int j=0;j<line.length();j++)
			{
				if(line.charAt(j)=='.')
				{
					countstr++;
					arr[i][j]=1;
				}
			}
		}

		long[] sorting = new long[4];
		init();
		pathfinder1(0 , 0);
		// System.out.println(currow+"  "+curcol+"   "+sum+"  "+countstr);
		sorting[0] = sum;

		init();
		pathfinder2(0 , 0);
		// System.out.println(currow+"  "+curcol+"   "+sum+"  "+countstr);
		sorting[1] = sum;

		init();
		pathfinder3(0 , 0);
		// System.out.println(currow+"  "+curcol+"   "+sum+"  "+countstr);
		sorting[2] = sum;

		init();
		pathfinder4(0 , 0);
		// System.out.println(currow+"  "+curcol+"   "+sum+"  "+countstr);
		sorting[3] = sum;
		// System.out.println(totrow+"  "+totcol);
		Arrays.sort(sorting);
		if((currow== totrow-1) && ( curcol==totcol-1))
			System.out.println(countstr-sorting[0]-1);
		else
			System.out.println("-1");
	}
}