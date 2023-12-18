import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		long an = 0;
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextLong();
			if(i == 0 && a[i] != 0)
			{
				System.out.println(-1);
				return;
			}
			if(i!=0)
			{
				if(a[i] != 0 && a[i] - a[i-1] > 1)
				{
					System.out.println(-1);
					return;
				}
				if(a[i]-a[i-1]==1)
				{
					an++;
				}
				else
				{
					an+=a[i];
				}
			}
		}
		System.out.println(an);
	}

}
