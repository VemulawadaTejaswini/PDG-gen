import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext();)
		{
			int n = scanner.nextInt();
			int s = scanner.nextInt();
			
			if(n==0 && s==0)
			{
				break;
			}
			
			int count = 0;
			for(int i=0; i<Math.pow(10, n); i++)
			{
				int sum = 0;
				int m = i;
				int p = -1;
				for(int j=0; j<n; j++, m/=10)
				{
					int add = m%10;
					if(p >= add)
					{
						sum = -1;
						break;
					}
					else {
						p = add;
						sum += add;
					}
				}
				if(s == sum)
				{
					count ++;	
				}
			}
			
			System.out.println(count);
		}
	}
}