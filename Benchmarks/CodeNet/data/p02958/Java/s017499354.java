import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int prev=0;
		int ans=1;
		int it=0;
		for(int i=1;i<=n;i++)
		{
			int t=in.nextInt();
			if(t!=i&&prev==0)
			{
				it=t;
				prev=i;
			}
			else if(t!=i&&(it!=i||prev!=t))
			{
				ans=0;
			}
		}
		if(ans==1)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
	