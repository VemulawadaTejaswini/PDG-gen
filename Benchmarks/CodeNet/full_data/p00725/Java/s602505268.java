

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		int w;
		int h;
		
		while(true)
		{
			w = scan.nextInt();
			h = scan.nextInt();
			
			if(w == 0 && h == 0)
			{
				break;
			}
			else
			{
				new DataSet(w, h);
			}
		}
	}

	static class DataSet
	{
		int width;
		int height;
		int[][] grid;
		int startX;
		int startY;
		int steps = 0;
		Attempt[] attempts = new Attempt[10000];
		Attempt[] nextAttempts = new Attempt[10000];
		int attemptsNum = 0;
		int nextAttemptsNum = 0;
		boolean found = false;
		
		public DataSet(int w, int h)
		{
			width = w;
			height = h;
			
			grid = new int[w][h];
			
			for(int y = 0; y < h; y++)
			{
				for(int x = 0; x < w; x++)
				{
					grid[x][y] = scan.nextInt();
					
					if(grid[x][y] == 2)
					{
						grid[x][y] = 0;
						startX = x;
						startY = y;
					}
				}
			}
			
			attemptsNum += 1;
			attempts[attemptsNum-1] = new Attempt(this, grid, startX, startY, "");
			
			while(attemptsNum > 0 && found == false)
			{
				steps += 1;
				
				if(steps > 10)
				{
					break;
				}
				
				for(int attIndex = 0; attIndex < attemptsNum; attIndex++)
				{
					if(found == false)
					{
						attempts[attIndex].go();
					}
					else
					{
						break;
					}
				}
				
				attempts = nextAttempts.clone();
				attemptsNum = nextAttemptsNum;
				
				nextAttempts = new Attempt[10000];
				nextAttemptsNum = 0;
			}
			
			if(found==false) {System.out.println("-1");}
		}
		
		public void found()
		{
			found = true;
			System.out.println(steps);
			return;
		}
	}
	
	static class Attempt
	{
		int x;
		int y;
		int[][] currentGrid;
		DataSet dataSet;
		String history = "";
		
		void mapout()
		{
			for(int y = 0; y < dataSet.height; y++)
			{
				for(int x = 0; x < dataSet.width; x++)
				{
					System.out.print(currentGrid[x][y]);
				}
				System.out.println("");
			}			
		}
		
		boolean slide(int xx, int yy)
		{
			while(true)
			{
				x += xx;
				y += yy;
				
				//out of bounds
				if(x < 0 || y < 0 || x >= dataSet.width || y >= dataSet.height)
				{
//					System.out.println("OOB " + history + ", " + x + " " + y);
					return false;
				}
				
				//finish
				if(currentGrid[x][y] == 3)
				{
//					System.out.println("FINISH " + history);
//					mapout();
					
					dataSet.found();
					return false;
				}
				
				//crash
				if(currentGrid[x][y] == 1)
				{
					//destroy
					currentGrid[x][y] = 0;
					
					//go back
					x -= xx;
					y -= yy;
					
					return true;
				}
			}
		}
		
		void go()
		{
			Attempt att;
			
			if(x < dataSet.width-1 && currentGrid[x+1][y] != 1 && dataSet.found == false)
			{
				att = new Attempt(dataSet, currentGrid, x, y, history + ">");
				if(att.slide(1, 0))
				{
					dataSet.nextAttemptsNum += 1;
					dataSet.nextAttempts[dataSet.nextAttemptsNum-1] = att;
				}
			}
			
			if(x > 0 && currentGrid[x-1][y] != 1 && dataSet.found == false)
			{
				att = new Attempt(dataSet, currentGrid, x, y, history + "<");
				if(att.slide(-1, 0))
				{
					dataSet.nextAttemptsNum += 1;
					dataSet.nextAttempts[dataSet.nextAttemptsNum-1] = att;
				}
			}
			
			if(y < dataSet.height-1 && currentGrid[x][y+1] != 1 && dataSet.found == false)
			{
				att = new Attempt(dataSet, currentGrid, x, y, history + "v");
				if(att.slide(0, 1))
				{
					dataSet.nextAttemptsNum += 1;
					dataSet.nextAttempts[dataSet.nextAttemptsNum-1] = att;
				}
			}
			
			if(y > 0 && currentGrid[x][y-1] != 1 && dataSet.found == false)
			{
				att = new Attempt(dataSet, currentGrid, x, y, history + "^");
				if(att.slide(0, -1))
				{
					dataSet.nextAttemptsNum += 1;
					dataSet.nextAttempts[dataSet.nextAttemptsNum-1] = att;
				}
			}
		}
		
		public Attempt(DataSet dataSet, int[][] grid, int posX, int posY, String history)
		{
			this.dataSet = dataSet;
			currentGrid = new int[dataSet.width][dataSet.height];
			for(int i = 0; i < dataSet.width; i++)
			{
				currentGrid[i] = grid[i].clone();
			}
//			currentGrid = grid.clone();
			x = posX;
			y = posY;
			this.history = history;
		}
	}
}

