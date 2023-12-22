import java.util.*;
import java.util.concurrent.ThreadLocalRandom; 
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		long k=in.nextLong();
		int [] a=new int [n+1];
		int [] vis =new int [n+1];
		long cyc=0;
		for(int i=1;i<=n;i++)
		{
			a[i]=in.nextInt();
		}
		int curr=1;
		long rep=0;
		vis[1]=-1;
		for(int i=1;i<=n;i++)
		{
			curr=a[curr];
			cyc++;
			if(vis[curr]==0)
			{
				vis[curr]=(int)cyc;
			}
			else
			{
				rep=vis[curr];
				if(rep==-1)
					rep=0;
				break;
			}
		}
		cyc=cyc-rep;
		long q=(k-rep)%cyc;
		for(int i=0;i<q;i++)
		{
			curr=a[curr];
		}
		System.out.println(curr);
	}
}
	