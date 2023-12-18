import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);		
		int n=in.nextInt();
		int l=in.nextInt();
		int ans=(l-1)*n+n*(n+1)/2;
		int q=Math.min(Math.abs(l),Math.abs(l+n-1));
		if(l<0&&l+n-1>0)
		{
			ans=ans;
		}
		else if(Math.abs(l)<Math.abs(l+n-1))
		{
			ans=ans-l;
		}
		else
		{
			ans=ans-l-n+1;
		}
		System.out.println(ans);
	}
}
	