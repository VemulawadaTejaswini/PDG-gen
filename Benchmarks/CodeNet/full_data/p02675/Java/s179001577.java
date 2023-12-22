import java.util.*;
import java.lang.*;
import java.io.*;
public class Main
{
	static void result(long n)
	{
		long rem = n%10;
		if(rem==3) {
			System.out.println("bon");
		}
		else if(rem==0 || rem==1 || rem==6 || rem==8)
		{
			System.out.println("pon");
		}
		else
		{
			System.out.println("hon");
		}
	}
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		long n = scan.nextLong();
		result(n);
	}
}