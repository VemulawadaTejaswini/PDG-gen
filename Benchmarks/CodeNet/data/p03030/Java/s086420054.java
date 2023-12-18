import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String [] s=new String[n];
		int [] a=new int [n];
		int [] ans=new int [n];
		for(int i=0;i<n;i++)
		{
			s[i]=in.next();
			a[i]=in.nextInt();
			ans[i]=i;
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(compare(s[i],s[j])>0)
				{
					String temp2=s[i];
					s[i]=s[j];
					s[j]=temp2;
					int temp1=a[i];
					a[i]=a[j];
					a[j]=temp1;
					int temp=ans[i];
					ans[i]=ans[j];
					ans[j]=temp;
				}
				if(compare(s[i],s[j])==0&&a[j]>a[i])
				{
					String temp2=s[i];
					s[i]=s[j];
					s[j]=temp2;
					int temp1=a[i];
					a[i]=a[j];
					a[j]=temp1;
					int temp=ans[i];
					ans[i]=ans[j];
					ans[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(ans[i]+1);
		}
	}
	
	public static int compare(String a,String b)
	{
		int n=0;
		if(a.length()>b.length())
			n=b.length();
		else
			n=a.length();
		for(int i=0;i<n;i++)
		{
			if(a.charAt(i)!=b.charAt(i))
				return a.charAt(i)-b.charAt(i);
		}
		return a.length()-b.length();
	}
}
	