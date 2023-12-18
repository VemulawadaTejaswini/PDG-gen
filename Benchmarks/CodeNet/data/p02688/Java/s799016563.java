
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] Arguments) throws IOException 
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in)); StringTokenizer ST = new StringTokenizer(BR.readLine());
		int N = Integer.parseInt(ST.nextToken()), K = Integer.parseInt(ST.nextToken()); boolean snukeFed[] = new boolean[N];
		for (int i = 1; i <= K; i++)
		{
			int Snukes = Integer.parseInt(BR.readLine());
			ST = new StringTokenizer(BR.readLine());
			for (int j = 0; j < Snukes; j++)
			{
				int Snuke = Integer.parseInt(ST.nextToken()) - 1;
				snukeFed[Snuke] = true; 
			}
		}
		
		int Count = 0;
		for (int i = 0; i < snukeFed.length; i++) if (!snukeFed[i]) Count++;
		System.out.println(Count);
	}
}
