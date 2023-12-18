import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in=new Scanner(System.in);		
		int n=in.nextInt();
		int m=in.nextInt();
		int ans=0;
		if(n-2*m>0)
		{
			ans=n-2*m;
		}
		System.out.println(ans);
	}
}
	