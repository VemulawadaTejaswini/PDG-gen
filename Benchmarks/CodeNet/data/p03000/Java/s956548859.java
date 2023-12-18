import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int x=in.nextInt();
		int ans=0;
		int i;
		for(i=0;i<n;i++)
		{
			int l=in.nextInt();
			ans=ans+l;
			if(ans>x)
			{
				break;
			}
		}
		System.out.println(i+1);
	}
}
	