import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		for(int i=0;i<=x;i++)
		{
			if(i*2+(x-i)*4==y)
			{
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}