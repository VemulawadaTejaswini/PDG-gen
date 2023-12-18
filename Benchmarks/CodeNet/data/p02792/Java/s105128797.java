import java.io.*;
import java.util.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Main
{
	public static void main(String []args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		//String []s=br.readLine().split(" ");
		int digc[][]=new int[10][10];//to count the frequency of digits
		
		
		
		for(int i=1;i<=n;i++)
		{
			String s=String.valueOf(i);
			int len=s.length();
			char []d=s.toCharArray();
			
			digc[d[0]-'0'][d[len-1]-'0']++;//there is a number having first digit as d[0] adn last dgit as d[len-1]
		}
		
		long ans=0;
		
		for(int i=1;i<=9;i++)
			for(int j=1;j<=9;j++)
				ans+=(digc[i][j]*digc[j][i]);	//counts number of pairs which have first digit 'i' and last digit 'j' and vice-versa
			
		
		out.println(ans);
	}
}


