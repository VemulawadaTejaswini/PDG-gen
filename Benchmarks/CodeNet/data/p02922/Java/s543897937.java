import java.util.*;
import java.io.*;

public class Main
{
	public static void main(String [] Args)
	{
		Scanner in = new Scanner(System.in);
		int a=in.nextInt();
		int b=in.nextInt();
		int ans=0;
		if(a>b)
			ans=1;
		else if(a%b==0)
			ans=b/a;
		else
			ans=b/a+1;
		System.out.println(ans);

	}
}
	