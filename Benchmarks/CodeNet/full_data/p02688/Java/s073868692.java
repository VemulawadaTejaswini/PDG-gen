
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
		for (; K > 0; K--)
		{
			int Snukes = Integer.parseInt(BR.readLine());
			ST = new StringTokenizer(BR.readLine());
			for (; Snukes > 0; Snukes--)
			{
				int Snuke = Integer.parseInt(ST.nextToken()) - 1;
				if (!snukeFed[Snuke])
				{
					snukeFed[Snuke] = true;
					break;
				}
			}
		}
		int Count = 0;
		for (int i = 0; i < snukeFed.length; i++) if (!snukeFed[i]) Count++;
		System.out.println(Count);
	}
}
