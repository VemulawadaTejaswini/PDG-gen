import java.util.*;
public class Main 
{
	public static void main(String[] args) 
	{
		Scanner stdIn = new Scanner(System.in);
		int[] weight = new int[10];
		int c = 1;
		for(int i = 0; i < weight.length; ++i)
		{
			weight[i] = c;
			c *= 2;
		}
		while(stdIn.hasNext())
		{
			int w = stdIn.nextInt();
			boolean[] useWeight = new boolean[weight.length];
			for(int i = 0; i < useWeight.length; ++i)
			{
				useWeight[i] = false;
			}
			int lastPoint = 0;
			for(int i = weight.length - 1; i >= 0; --i)
			{
				if(w >= weight[i])
				{
					w -= weight[i];
					useWeight[i] = true;
					if(lastPoint < i)
					{
						lastPoint = i;
					}
				}
			}
			for(int i = 0; i < lastPoint; ++i)
			{
				if(useWeight[i])
				{
					System.out.print(weight[i] + " ");
				}
			}
			System.out.println(weight[lastPoint]);
		}
	}
}