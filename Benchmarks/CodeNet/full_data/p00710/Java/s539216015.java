import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner stdIn = new Scanner(System.in);
		int[] x = new int[51];
		int[] y = new int[51];
		
		while(true)
		{
			int n = stdIn.nextInt();
			int r = stdIn.nextInt();
			
			if(n==0 && r==0)
			{
				break;
			}
			
			for(int i=0;i<n;i++)
			{
				x[i] = n-i;
			}
			
			for(int i=0;i<r;i++)
			{
				int s = stdIn.nextInt();
				int t = stdIn.nextInt();
				System.out.print("n=" + n + " r=" + r + " x[0]=" + x[0]);
				System.out.println(" s=" + s + " t=" + t);
				
				if(s<=n+1-t)
				{
					for(int j=0;j<t;j++)
					{
						y[j] = x[s+j-1];
					}	
				
					for(int j=0;j<s;j++)
					{
						y[t+j] = x[j];
					}	
				
					for(int j=0;j<s+t;j++)
					{
						x[j] = y[j];
					}
				}
				
			}
			
			System.out.println(x[0]);
			
		}
	}

}