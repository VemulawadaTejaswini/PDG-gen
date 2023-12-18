import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int r=in.nextInt();
		int st=in.nextInt();
		int p=in.nextInt();
		String s=in.next();
		int [] used = new int [n];
		long ans=0;
		for(int i=0;i<n;i++)
		{
			if(i<k||(s.charAt(i-k)==s.charAt(i)&&used[i-k]==0)||s.charAt(i-k)!=s.charAt(i))
			{
				used[i]=1;
				if(s.charAt(i)=='r')
				{
					ans=ans+p;
				}
				if(s.charAt(i)=='s')
				{
					ans=ans+r;
				}
				if(s.charAt(i)=='p')
				{
					ans=ans+st;
				}
			}
			else
			{
				used[i]=0;
			}
		}
		System.out.println(ans);	
	}
}
	