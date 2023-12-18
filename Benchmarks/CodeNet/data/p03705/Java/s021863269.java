import java.util.*;
import java.io.*;
class find_sum
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		if(a>b)
		{
			System.out.println(0);
		}
		else if(n==1&&a<b)
		{
			System.out.println(0);
		}
		else
		{
			System.out.println((a+b*(n-1) - a*(n-1)+b)+1);
		}



	}
}