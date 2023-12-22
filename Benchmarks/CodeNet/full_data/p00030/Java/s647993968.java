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
			long init = 0;
			long exit = 0;
			int max = 0;
			int min = 0;
			for(int i=0; i<n; i++)
			{
				init += (9-i)*Math.pow(10, n-i-1);
				exit += i*Math.pow(10, i);
				max += (9-i);
				min += i;
			}
			if(s> max || min>s)
			{
				System.out.println(0);
				continue;
			}
			//System.out.println(exit + " ~ "+ init );
			for(long i=exit; i>0; i--)
			{
				int sum = 0;
				long m = i;
				long p = 10;
				boolean is_add = true;
				long[] num = new long[n];
				for(int j=n-1; j>=0; j--, m/=10)
				{
					long add = m%10;
					if(add+j>9 || p<=add || s<sum)
					{
						is_add = false;
						break;
					}
					p = add;
					sum += add;
					num[j] = add;
				}
				if(is_add && s==sum)
				{	
				//	System.out.print(i + "=");
				//	for(int j=0; j<n; j++)
				//		System.out.print(num[j] + "+");
				//	System.out.println("");
					count ++;	
				}
			}
			
			System.out.println(count);
		}
	}
}