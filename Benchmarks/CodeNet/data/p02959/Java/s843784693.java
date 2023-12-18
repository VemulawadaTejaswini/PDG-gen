import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		Scanner x=new Scanner(System.in);
    	int n=x.nextInt(),c=0;
    	int a[]=new int[n+1];
		int b[]=new int[n];
		for(int i=0;i<n+1;i++)
		{
			a[i]=x.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			b[i]=x.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			c+=Math.min((a[i]+a[i+1]),b[i]);
		}
		System.out.println(c);
	}
}