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
			
			int max_len = 0;
			float[] x = new float[n];
			float[] y = new float[n];
			for(int i=0; i<n; i++)
			{
				String[] input = scanner.next().split(",");
				
				x[i] = Float.parseFloat(input[0]);
				y[i] = Float.parseFloat(input[1]);
			}
			
			for(float px=0; px<=10; px+=0.001)
			{
				for(float py=0; py<=10; py+=0.001)
				{
					int len = 0;
					for(int i=0; i<n; i++)
					{
						if((px-x[i])*(px-x[i])+(py-y[i])*(py-y[i]) <= 1)
						{
							len ++;
						}
					}
					if(max_len < len)
					{
						max_len = len;
					}
				}
			}
			
			System.out.println(max_len);
		}
	}
}