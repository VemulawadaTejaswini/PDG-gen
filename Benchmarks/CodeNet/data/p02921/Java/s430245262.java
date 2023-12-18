import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in = new Scanner(System.in);
		String s=in.next();
		String a=in.next();
		int ans=0;
		for(int i=0;i<=2;i++)
		{
			if(a.charAt(i)==s.charAt(i))
				ans++;
		}
		System.out.println(ans);

	}
}
	