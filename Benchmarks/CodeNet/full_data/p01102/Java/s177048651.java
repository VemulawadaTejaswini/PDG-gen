
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String[] s = new String[2];
		
		while(true)
		{
			s[0] = scan.next();
			if(s[0].equals(".")) {break;}
			s[1] = scan.next();
			List<String> ss1 = new ArrayList<String>();
			
			List<Integer> location = new ArrayList<Integer>();
			
			int miniCounter = -1;
			
			int stringDifferences = 0;
			int numOfSs2 = 0;
			boolean done = false;
			
			for(int c = 0; c <= 1; c++)
			{
				int zure = 0;
				int start = -1;
				int end = 0;
				
				for(int i = 0; i < s[c].length(); i++)
				{
					if(c == 1)
					{
					}
					String cur = s[c].substring(i, i+1);
					
					if(cur.equals("\""))
					{
						if(start == -1)
						{
							start = i+1;
						}
						else
						{
							//closing quote mark
							
							end = i-1;
							if(c == 0)
							{
								location.add(i);
							}
							else if(c == 1)
							{
								numOfSs2 += 1;
								miniCounter += 1;
								String thisOne = "";
								String prevOne = ss1.get(miniCounter);
								
								if(!thisOne.equals(prevOne))
								{
									stringDifferences += 1;
									
									if(stringDifferences >= 2)
									{
										System.out.println("DIFFERENT");
										done = true;
										break;
									}
									else
									{
									}
								}
								
								
							}
							
						}
					}
					else
					{
						//not quote
						if(start == -1)
						{
							//outside ministrings
							
							if(c == 1)
							{
								String cur1 = s[0].substring(i+zure, i+1+zure);
								String cur2 = s[1].substring(i, i+1);
								
								if(!cur1.equals(cur2))
								{
//									System.out.println(cur1 + " vs " + cur2);
									System.out.println("DIFFERENT");
									done = true;
//									stringDifferences = -1;
									break;
								}
							}
						}
					}
				}
			}
			
			if(!done)
			{
				if(numOfSs2 == ss1.size())
				{
					if(stringDifferences == 1)
					{
						System.out.println("CLOSE");
					}
					else if(stringDifferences == 0)
					{
						System.out.println("IDENTICAL");
					}
				}
				else
				{
//					System.out.println(ss1.size() + " vs " + numOfSs2);
					System.out.println("DIFFERENT");
				}
			}
		}
	}

}

