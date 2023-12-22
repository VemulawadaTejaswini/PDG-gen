import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		long[] a = new long[n];
		
		for(int i = 0; i < n; i++)
		{
			a[i] = sc.nextLong();
		}
		
		boolean[] bad = new boolean[n];
		for(int i = 0; i < m; i++)
		{
			int ta = sc.nextInt()-1;
			int tb = sc.nextInt()-1;
			
			if(a[ta] >= a[tb]) //b is bad
			{
				bad[tb] = true;
			}
			if(a[tb] >= a[ta]) //a is bad
			{
				bad[ta] = true;
			}
			
		}
		
		int c = 0;
		for(int i = 0; i < n; i++)
		{
			if(!bad[i])c++;
		}
		System.out.println(c);
	}

}
