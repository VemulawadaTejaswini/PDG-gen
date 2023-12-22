import java.util.Scanner;

public class Main
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();


		String str = String.valueOf(fact(n));
		//System.out.println(str);
		char a[] = new char[str.length()];

		for(int i=0; i<str.length(); i++) 
		{
			a[i] = str.charAt(i);
		}

		int ans=0;
		for(int i=str.length()-1; i>=0; i--)
		{
			if(a[i] == '0')
				ans++;
			else
				break;
		}

		System.out.println(ans);
	}

	public static long fact(long n)
	{
		if(n<=1)
			return 1;
		n = n*fact(n-1);
		return n;
	}

}