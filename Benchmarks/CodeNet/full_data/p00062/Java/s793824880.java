import java.util.Scanner;

public class Main
{
	static int aa[] = new int[10]; 
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			String a =sc.next();
			for(int i=0; i<10; i++)
			{
				aa[i]= a.charAt(i)-48;
			}

			sumdi(9,aa);
		}
	}
	public static int sumdi(int n, int a[])
	{
		if(n==0)
			return 0;
		for(int i=0; i< n; i++)
			a[i] = (a[i]+a[i+1])%10;
		if(n==1)
			System.out.println(a[0]);
		return sumdi(n-1, a);
	}


}