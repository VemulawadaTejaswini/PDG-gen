import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);		
		int n=in.nextInt();
		String s=in.next();
		int ans=1;
		for(int i=1;i<n;i++)
		{
			if(s.charAt(i)!=s.charAt(i-1))
				ans++;
		}
		System.out.println(ans);
	}
}
	