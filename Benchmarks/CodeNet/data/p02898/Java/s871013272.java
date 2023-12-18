import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int ans=0;
		for(int i=0;i<n;i++)
		{
			int t=in.nextInt();
			if(t>=k)
			{
				ans++;
			}
		}
		System.out.println(ans);
	}
}
	