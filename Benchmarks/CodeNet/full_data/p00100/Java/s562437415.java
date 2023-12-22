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
			
			class Data
			{
				int e;
				long sum;
				boolean is_view;
			}
			Data[] data = new Data[n];		
			
			for(int i=0; i<n; i++)
			{
				data[i] = new Data();
				data[i].e = scanner.nextInt();
				long p = scanner.nextLong();
				long q = scanner.nextLong();
				data[i].sum = p * q;
				data[i].is_view = true;
			}
			
			for(int i=0; i<n; i++)
			{
				if(data[i].is_view)
				{
					for(int j=i+1; j<n; j++)
					{
						if(data[i].e == data[j].e)
						{
							data[i].sum += data[j].sum;
							data[j].is_view = false;
						}
					}
				}
			}
			
			int count = 0;
			for(int i=0; i<n; i++)
			{
				if(data[i].is_view && data[i].sum>=1000000)
				{
					System.out.println(data[i].e);
					count ++;
				}
			}
			
			if(count == 0)
			{
				System.out.println("NA");
			}
		}
	}