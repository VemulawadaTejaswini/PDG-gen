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
			int init = 0;
			for(int i=0; i<n; i++)
			{
				init += i*Math.pow(10, i);
			}
			for(long i=init; i>=0; i--)
			{
				long m = i;
				long p = 10;
				boolean is_add = true;
				for(int j=0; j<n; j++, m/=10)
				{
					if(p <= m%10)
					{
						is_add = false;
						break;
					}
					p = m%10;
				}
				if(is_add)
				{
					int sum = 0;
					m = i;
					for(int j=0; j<n; j++, m/=10)
					{
						long add = m%10;
						sum += add;
					}
					if(s == sum)
					{
						count ++;	
					}
				}
			}
			
			System.out.println(count);
		}
	}
}