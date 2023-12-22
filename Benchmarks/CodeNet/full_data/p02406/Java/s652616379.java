import java.io.*;

public class Main
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.print(" ");
		for(int i=1; i<=n; i++)
		{
			if(i%3==0 && i%10==3)	System.out.print(i);
			else if(i%3==0)	System.out.print(i);
			else if(i%10==3)	System.out.print(i);
			if(i==n)	break;
			System.out.print(" ");
		}
	}
}