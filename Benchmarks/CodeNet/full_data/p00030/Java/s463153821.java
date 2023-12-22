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
			for(long i=(long)Math.pow(10, n); i>=0; i--)
			{
				int sum = 0;
				long m = i;
				long p = 10;
				boolean is_add = true;
				for(int j=n-1; j>=0; j--, m/=10)
				{
					long add = m%10;
					if(j>add || j+n>9 || p<=add || s<sum)
					{
						is_add = false;
						break;
					}
					p = add;
					sum += add;
				}
				if(is_add && s==sum)
				{				
					count ++;	
				}
			}
			
			System.out.println(count);
		}
	}
}