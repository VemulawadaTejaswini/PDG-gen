import java.util.Scanner;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		
	
		int w = scan.nextInt();
		int n = scan.nextInt();
		int ans[]= new int[w+1];
		for(int i = 1; i <= w; i++)
		{
			ans [i]= i;
		}

		for(int i=0; i < n; i++)
		{
			
			String str = scan.next();
			StringTokenizer st = new StringTokenizer(str, ",");
			swap(ans, st.nextToken(),st.nextToken());
		}

		for(int i = 1; i <= w; i++)
		{
			System.out.println(ans[i]);
		}

	}

	public static void swap(int a[], String b, String c)
	{
	    int  tmp = a[Integer.valueOf(b)];
		a[Integer.valueOf(b)] = a[Integer.valueOf(c)];
		a[Integer.valueOf(c)] = tmp;
	}

}