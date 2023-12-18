import java.util.Scanner;

public class Main
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		long t = sc.nextLong();
		long n = sc.nextLong();
		long h = sc.nextLong();
		
		long k =sc.nextLong();
		
		long p,q,r;
		long hh = 0;
		
		
		//System.out.println("hiii");
		
		long answer;
		
		if(k%2==0)
		{
			answer = t-n;
		}
		else
		{
			answer = n-t;
		}
		
		long absolute = Math.abs(answer);
		
		if(absolute>(int)(Math.pow(10, 18)))
		{
			System.out.println("Unfair");
		}
		else
		{
			System.out.println(answer);
		}
		
	}
}
