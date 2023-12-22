

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main
{
	public static void main(String[] Arguments) throws IOException 
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in)); StringTokenizer ST = new StringTokenizer(BR.readLine());
		int N = Integer.parseInt(ST.nextToken()), K = Integer.parseInt(ST.nextToken()); boolean snukeFed[] = new boolean[N]; int PS[][] = new int[K + 1][N];
		for (int i = 1; i <= K; i++)
		{
			int Snukes = Integer.parseInt(BR.readLine());
			ST = new StringTokenizer(BR.readLine());
			for (int j = 0; j < Snukes; j++)
			{
				int Snuke = Integer.parseInt(ST.nextToken()) - 1;
				PS[i][Snuke] = PS[i - 1][Snuke] + 1;
			}
		}
		for (int i = 1; i <= K; i++)
		{
			boolean Fed = false;
			int firstSnuke = -1;
			for (int j = 0; j < N; j++)
			{
				//Check if there is only one Snuke and at this snack.
				if (PS[i - 1][j] + 1 == PS[i][j])
				{
					if (PS[i][j] == PS[K][N - 1])
					{
						Fed = true;
						snukeFed[j] = true;
						break;
					}
					else if (firstSnuke == -1) firstSnuke = j;
				}
			}
			if (!Fed && firstSnuke != -1) snukeFed[firstSnuke] = true; 
		}
		
		int Count = 0;
		for (int i = 0; i < snukeFed.length; i++) if (!snukeFed[i]) Count++;
		System.out.println(Count);
	}
}
