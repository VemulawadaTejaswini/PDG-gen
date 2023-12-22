

import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) 
	{
		while(true)
		{
			int a = scan.nextInt();
			int b = scan.nextInt();
			if(a == 0 && b == 0) {return;}
			ArrayList<Integer> l1 = new ArrayList<Integer>();
			ArrayList<Integer> l2 = new ArrayList<Integer>();
			int ans = 999999999;
			
			for(int i = 1; i*i <= a; i++)
			{
				if(a%i == 0)
				{
					l1.clear();
					l1.add(i);
					l1.add(a/i);
					
					for(int j = 1; j*j <= b; j++)
					{
						if(b%j == 0)
						{
							l2.clear();
							l2.add(j);
							l2.add(b/j);
							
							ArrayList<Integer> l3 = new ArrayList<Integer>();
							l3.add(l1.get(0));
							l3.add(l1.get(1));
							l3.add(l2.get(0));
							l3.add(l2.get(1));
							l3.sort(null);
							
							
//							System.out.println("Size  "+ l3.size());
							int temp = 0;
							int pair = (l3.get(0) - l3.get(1));
							temp += (pair*pair);
							pair = (l3.get(1) - l3.get(2));
							temp += (pair*pair);
							pair = (l3.get(2) - l3.get(3));
							temp += (pair*pair);
							
							ans = Math.min(ans, temp);
						}
					}
				}
			}
			
			System.out.println(ans);
		}
	}

}

