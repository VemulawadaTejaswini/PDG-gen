import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; ;)
		{
			int n = scanner.nextInt();
			if(n == 0)
			{
				break;
			}
			
			float[] x = new float[n];
			float[] y = new float[n];
			for(int i=0; i<n; i++)
			{
				String[] input = scanner.next().split(",");
				
				x[i] = Float.parseFloat(input[0]);
				y[i] = Float.parseFloat(input[1]);
			}
			
			int max_len = 0;
			for(int i=0; i<n; i++)
			{
				int len = 1;
				for(int j=i+1; j<n; j++)
				{
					if((x[i]-x[j])*(x[i]-x[j]) + (y[i]-y[j])*(y[i]-y[j]) <= 4)
					{
						len ++;
					}
				}
				if(max_len < len)
				{
					max_len = len;
				}
			}
			
			System.out.println(max_len);
		}
	}
}