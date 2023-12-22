

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main
{
	static List<Integer> ans = new ArrayList<Integer>();
	static Scanner scan = new Scanner(System.in);
	static boolean imm = true;
	
	public static void main(String[] args) 
	{
		int w;
		int h;
		
		while(true)
		{
			w = scan.nextInt();
			h = scan.nextInt();
			
			if(h==0 && w == 0)
			{
				if(imm == false)
				{
					for(int i : ans)
					{
						System.out.println(i);
					}
				}
				return;
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
		int floor[][] = new int[10][10];
		
		public DataSet(int w, int h)
		{
			width = w;
			height = h;
			
			for(int i = 0; i < height; i++)
			{
				for(int j = 0; j < width; j++)
				{
					floor[j][i] = scan.nextInt();
				}
			}
			
			int anss = compute();
			ans.add(anss);			
			if(imm) {System.out.println(anss);}
		}
		
		public int compute()
		{
			int carpets = 0;
			
			while(true)
			{
				//find biggest uncovered rectangle
				int maxSize = 0;
				int maxCovered = 0;
				int maxRecovered = 999;
				int maxAdditionalPriority = 0;
				int maxX = -1;
				int maxY = -1;
				
				for(int i = 0; i < height; i++)//y
				{
					for(int j = 0; j < width; j++)//x
					{
						if(floor[j][i] == 1 || floor[j][i] == 2) //1 scratched, 2 covered
						{
							//check rectangle from this point
							boolean go = true;
							int size = 1;
							boolean hasUncoveredPanel = false;
							int covered = 0;
							int recovered = 0;
							int additionalPriority = 0;
							
							if(floor[j][i] == 1)
							{
								if(covered == 0) {covered += 1;}
//								if(covered != 0) {System.out.println("Apaan nih!!?");}
								hasUncoveredPanel = true;
							}
							
							if(j > 0 && floor[j-1][i] == 0) {additionalPriority += 1;}
							if(i > 0 && floor[j][i-1] == 0) {additionalPriority += 1;}
								
								while(go == true)
								{
									
									size += 1;
									
									if((i + size-1 > height-1) || (j + size-1 > width-1))
									{
										//out of bounds
										go = false;
										size -= 1;
									}
									else
									{
										//check if flawless panel exists under expanded carpet
										boolean prevHadUnc = false;
										int prevUnc = 0;
										int prevRec = 0;
										
										for(int z = 0; z < size && go == true; z++)
										{
											//+z
											int x1 = j + size-1;
											int y1 = i + z;
											int x2 = j + z;
											int y2 = i + size-1;
											
											if(floor[x1][y1] == 1 || floor[x2][y2] == 1)
											{
												prevHadUnc = true;
											}
											if(floor[x1][y1] == 1)
											{
												prevUnc += 1;
											}
											if(floor[x2][y2] == 1)
											{
												if(x1 == x2 && y1 == y2)
												{
												}
												else
												{
													prevUnc += 1;
												}
											}
											
											//rec
											if(floor[x1][y1] == 2)
											{
												prevRec += 1;
											}
											if(floor[x2][y2] == 2)
											{
												if(x1 == x2 && y1 == y2)
												{
												}
												else
												{
													prevRec += 1;
												}
											}
											
											
											if(floor[x1][y1] == 0 || floor[x2][y2] == 0)
											{
												go = false;
												size -= 1;
											}
										}
										
										if(go == true && prevHadUnc == true) 
										{
											hasUncoveredPanel = true;
											covered += prevUnc;
											recovered += prevRec;
										}
									}
								}
								
							//rectangle from this point checked
//							if((covered > maxCovered && hasUncoveredPanel) || (covered == maxCovered && additionalPriority > maxAdditionalPriority && hasUncoveredPanel) || (covered == maxCovered && additionalPriority == maxAdditionalPriority && size > maxSize && hasUncoveredPanel))
								
							if((covered > maxCovered && hasUncoveredPanel) || (covered == maxCovered && size > maxSize && hasUncoveredPanel) || (covered == maxCovered && size == maxSize && additionalPriority > maxAdditionalPriority && hasUncoveredPanel))
							{
								maxSize = size;
								maxCovered = covered;
								maxRecovered = recovered;
								maxAdditionalPriority = additionalPriority;
								maxX = j;
								maxY = i;
							}
						}
					}
				}	
				
				//now we know where to put the next carpet
//					if(maxSize == 0)
				if(maxCovered == 0)
				{
					//no more carpets
					return carpets;
				}
				else
				{
//					System.out.println("[" + (carpets+1) + "] Put carpet on " + maxX + ", " + maxY + " of size " + maxSize + ", covering " + maxCovered + " recovering " + maxRecovered);
					//cover with carpet
					for(int x = maxX; x < (maxX + maxSize); x++)
					{
						for(int y = maxY; y < (maxY + maxSize); y++)
						{
							floor[x][y] = 2;
						}
					}
					carpets += 1;
				}
			}
		}
	}
}
