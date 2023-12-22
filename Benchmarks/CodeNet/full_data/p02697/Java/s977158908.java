import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] a = new int[m];
		int[] b = new int[m];
		
//		boolean[][] done = new boolean[n][n];
		
		if(n%2==1)
			for(int i = 1; i <= m; i++)
			{
				a[i-1] = i;
				b[i-1] = n - i + 1;
			}
		else
		{
			for(int i = 1; i <= m; i++)
			{
				a[i-1] = i;
				b[i-1] = i*2;
			}
			/*
			a[0]=1;
			b[0]= 2;
			for(int i = 2; i <= m; i++)
			{
				a[i-1] = n - (i-2);
				b[i-1] = i+1;
			}
			*/
		}
		

		{
			StringBuilder sb = new StringBuilder();
			for(int i = 0; i < m; i++)
				sb.append(a[i] + " " + b[i] + "\n");
			System.out.println(sb);
		}
		
	}

}
