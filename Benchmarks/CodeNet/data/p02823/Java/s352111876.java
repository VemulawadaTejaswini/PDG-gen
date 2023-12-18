import java.io.*;
import java.util.*;

class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a=s.nextInt();
		int b=s.nextInt();

		int m=(n/2)+1;
		int k=b-a;
		if(k==1 && a>=m && b<=n)
			System.out.println(n-a);
		else if(k==1 && a>=1 && b<=m)
			System.out.println(b-1);
		else if(k%2==1)
			System.out.println(m-1);
		else if(k%2==0)
			System.out.println(k/2);
	}
}