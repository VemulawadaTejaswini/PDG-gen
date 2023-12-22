import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		while(true)
		{
			Scanner stdIn = new Scanner(System.in);
			int n = stdIn.nextInt();
			int m = stdIn.nextInt();
			
			if(n==0 && m==0)
			{
				break;
			}
			
			int[] tarou = new int[n];
			int[] hanako = new int[m];
			boolean[][] hantei = new boolean[n][m];
			int x = 0;
			int tarou_number = 0;
			int hanako_number = 0;
			int total = 1000;
			
			for(int i=0;i<n;i++)
			{
				Arrays.fill(hantei[i],false);
			}
			
			
			for(int i=0;i<n;i++)
			{
				tarou[i] = stdIn.nextInt();
			}
			for(int i=0;i<m;i++)
			{
				hanako[i] = stdIn.nextInt();
			}
		
			for(int i=0;i<n;i++)
			{
				int tarou_total = 0;
				int hanako_total = 0;
				
				
				for(int j=0;j<m;j++)
				{
					int h = tarou[i];
					tarou[i] = hanako[j];
					hanako[j] = h;
				
					tarou_total = func(tarou);
					hanako_total = func(hanako);
				
					h = tarou[i];
					tarou[i] = hanako[j];
					hanako[j] = h;
					
					if(tarou_total == hanako_total && total>(tarou[i]+hanako[j]))
					{
						tarou_number = i;
						hanako_number = j;
						total = tarou[i]+hanako[j];
						x++;
					}
				
				}
				
			}
			
			if(x!=0)
			{
				System.out.println(tarou[tarou_number]+" "+hanako[hanako_number]);
			}
			else
			{
				System.out.println("-1");
			}
		}
		
	}
	
	static int func(int[] x)
	{
		int total = 0;
		
		for(int i=0;i<x.length;i++)
		{
			total += x[i];
		}
		
		return total;
	}
	

}