import java.util.Scanner;


public class Main
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		for(; scanner.hasNext();)
		{
			int[] a = new int[2];
			a[0] = scanner.nextInt();
			a[1] = scanner.nextInt();
			
			int b = scanner.nextInt();
			
			int cnt = 0;
			for(int i=0; i<10; i++)
			{
				int j = i+1;
				if(!(j==a[0] || j==a[1] || j==b))
				{
					if(a[0]+a[1]+j <= 20)
					{
						cnt++;
					}
				}
			}

			System.out.println(cnt<4 ? "NO" : "YES");
		}
	}
}