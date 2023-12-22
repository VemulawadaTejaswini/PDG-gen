import java.util.Scanner;


public class Main 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int[] r = new int[n];
		int[] f = new int[n];
		int[] v = new int[n];
		for(int i=0; i<n; i++)
		{
			int b = scanner.nextInt();
			r[i] = scanner.nextInt();
			f[i] = scanner.nextInt()-1;
			v[i] = scanner.nextInt();
			
			r[i] =  4*(b-1)  + r[i] - 1;
		}
		for(int i=0; i<n; i++)
		{
			System.out.print(">>"+r[i]+":"+f[i]+":"+v[i]+"\n");
		}
		
		String[][]  s = new String[15][10];
		for(int i=0; i<15; i++)
		{
			for(int j=0; j<10; j++)
			{
				s[i][j] = "0";
			}
		}
			for(int i=0; i<15; i++)
			{
				for(int j=0; j<10; j++)
				{
					for(int k=0; k<n; k++)
						{
						if(i%4 == 3)
						{
							s[i][j] = "#";
						}
						else if(r[k]==i && f[k]==j)
						{
							s[i][j] = v[k]+"";
						}
					}
			}
		}
		
		
		for(int i=0; i<15; i++)
		{
			for(int j=0; j<10; j++)
			{
				System.out.print(s[i][j]+" ");
			}
			System.out.println("");
		}
	}
}