import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k=in.nextInt();
		int [] a=new int [n];
		boolean [] ans = new boolean [k+1];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		ans[0]=false;
		for(int i=1;i<=k;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i>=a[j])
				{
					if(ans[i-a[j]]==false)
					{
						ans[i]=true;
					}
				}
			}
		}
		if(ans[k]==true)
			System.out.println("First");
		else
			System.out.println("Second");
	}
}
	