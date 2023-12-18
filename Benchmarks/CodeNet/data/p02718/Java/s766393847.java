import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main 
{
	public static void main(String[] Arguments) throws IOException 
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in)); StringTokenizer ST = new StringTokenizer(BR.readLine());
		int cSum = 0, N = Integer.parseInt(ST.nextToken()), M = Integer.parseInt(ST.nextToken()), Count = 0, itemVotes[] = new int[N];
		ST = new StringTokenizer(BR.readLine());
		for (int i = 0; i < N; i++)
		{
			itemVotes[i] = Integer.parseInt(ST.nextToken());
			cSum += itemVotes[i];
		}
		for (int i = 0; i < N; i++)
		{
			if (itemVotes[i] >= (double)(cSum / (4 * M)))
			{
				Count++;
			}
		}
		System.out.println((Count >= M) ? "Yes" : "No");
	}
}
