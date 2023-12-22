import java.util.ArrayList;
import java.util.List;
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
			
			int max_len = 1;
			for(int i=0; i<n; i++)
			{
				List<Integer> list = new ArrayList<>();
				for(int j=i+1; j<n; j++)
				{
					if((x[i]-x[j])*(x[i]-x[j]) + (y[i]-y[j])*(y[i]-y[j]) <= 4)
					{
						list.add(j);
					}
				}
				
				for(int j=0; j<list.size(); j++)
				{
					int len = 2;
					for(int k=j+1; k<list.size(); k++)
					{
						int a = list.get(j);
						int b = list.get(k);
						if((x[a]-x[b])*(x[a]-x[b]) + (y[a]-y[b])*(y[a]-y[b]) <= 4)
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