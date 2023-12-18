import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		if(find(n))
			System.out.println(1);
		System.out.println(0);
	}
	public static boolean find(int n)
	{
		if(n<0)
			return false;
		if(n==0)
			return true;
		return find(n-100)||find(n-101)||find(n-102)||find(n-103)||find(n-104)||find(n-105);
	}
}
	