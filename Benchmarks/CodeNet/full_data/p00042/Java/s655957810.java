import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(int case_no=1; ;case_no++)
		{
			int weight = scanner.nextInt();
			if(weight == 0)
			{
				break;
			}
			
			int n = scanner.nextInt();
			
			int[] v = new int[n];
			int[] w = new int[n];
			int weight_max = 0;
			for(int i=0; i<n; i++)
			{
				String str = scanner.next();
				String[] word = str.split(",");
				
				v[i] = Integer.parseInt(word[0]);
				w[i] = Integer.parseInt(word[1]);
				
				weight_max += w[i];
			}
			
			int value_max = 0;
			int weight_min = 0;
			
			for(int i=0; i<n; i++)
			{
				int total = v[i];
				int have = w[i];
				for(int j=i+1; j<n; j++)
				{
					if(have+w[j] <= weight)
					{
						total += v[j];
						have += w[j];
					}
				}
								
				if(have <= weight)
				{
					if(value_max < total)
					{
						weight_min = have;
						value_max = total;
					}
					else if(value_max == total)
					{
						if(weight_min > have)
						{
							weight_min = have;
						}
					}
				}
			}
			
			System.out.println("Case "+case_no+":");
			System.out.println(value_max);
			System.out.println(weight_min);
		}
	}
}