

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		
		while(true)
		{
			int n = scan.nextInt();
			if(n == 0) {break;}
			int[] grades = new int[n];
			
			for(int i = 0; i < n; i++)
			{
				grades[i] = scan.nextInt();
			}
			
			int ans = 9000000;
			
			for(int a = 0; a < n; a++)
			{
				for(int b = a+1; b < n; b++)
				{
					ans = Math.min(ans, Math.abs(grades[a] - grades[b]));
				}
			}
			
			System.out.println(ans);
		}
		
	}

}

