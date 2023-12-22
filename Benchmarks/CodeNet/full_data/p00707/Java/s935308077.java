

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

		//numbers: ascii 48 ~ 57 are 0 ~ 9
		
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
				new DataSet(w,h);
			}
			
		}
	}
	
	static class DataSet
	{
		int width;
		int height;
		char[][] grid;
		String[][] calc;
		List<Integer> startX = new ArrayList<Integer>();
		List<Integer> startY = new ArrayList<Integer>();
		
		public DataSet(int w, int h)
		{
			this.width = w;
			this.height = h;
			
			grid = new char[w][h];
			calc = new String[w][h];
			
			for(int row = 0; row < h; row++)
			{
				String str = scan.next();
				
				for(int ch = 0; ch < w; ch++)
				{
					//numbers: ascii 48 ~ 57 are 0 ~ 9
					grid[ch][row] = str.charAt(ch);
				}
			}
			
			
			String biggest = "0";
			
			for(int row = h-1; row >= 0; row--)
			{
				
				for(int ch = w-1; ch >= 0; ch--)
				{
					String here;
					String right;
					String down;
					
					if(charIsNumber(grid[ch][row]))
					{
						if(ch == w-1 || !charIsNumber(grid[ch+1][row]))
						{
							right = "";
						}
						else
						{
							right = calc[ch+1][row];
						}
						
						if(row == h-1 || !charIsNumber(grid[ch][row+1]))
						{
							down = "";
						}
						else
						{
							down = calc[ch][row+1];
						}
						
						right = grid[ch][row] + right;
						down = grid[ch][row] + down;
						
						if(right.length() > down.length())
						{
							here = right;
						}
						else if(down.length() > right.length())
						{
							here = down;
						}
						else //if(right.length() == down.length())
						{
							if(firstStringIsBigger(right,down))
							{
								//right
								here = right;
							}
							else
							{
								here = down;
							}
						}
						
						calc[ch][row] = here;
						
//						System.out.println(ch + ", " + row + " is " + here);
						
						if(firstStringIsBigger(here, biggest))
						{
							biggest = here;
						}
					}
				}
			}
			
			System.out.println(biggest);
		}
		
		public String removeZeroesAtStart(String a)
		{
			String ans = a;
			
			while(true)
			{
//				System.out.println("checking " + a);
				
				if(a.equals("")) {return a;}
				if(a.charAt(0) == 48)
				{
					a = a.substring(1);
				}
				else
				{
					return a;
				}
			}
		}
		
		boolean firstStringIsBigger(String a, String b)
		{
			a = removeZeroesAtStart(a);
			b = removeZeroesAtStart(b);
			
			if(a.length() > b.length()) {return true;}
			if(a.length() < b.length()) {return false;}
			
			//when length is the same: compare from the 1st digit (most significant)
			
			for(int i = 0; i < a.length(); i++)
			{
				if(a.charAt(i) > b.charAt(i))
				{
					return true;
				}
				if(a.charAt(i) < b.charAt(i))
				{
					return false;
				}
			}
			
			return false;
		}
		
		
		boolean charIsNumber(char c)
		{
			if(c >= 48 && c <= 57)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
	}

}

