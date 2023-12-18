import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main 
{	
	public static void main(String[] Arguments) throws IOException 
	{
		BufferedReader BR = new BufferedReader(new InputStreamReader(System.in)); StringTokenizer ST = new StringTokenizer(BR.readLine());
		int N = Integer.parseInt(ST.nextToken()), Q = Integer.parseInt(ST.nextToken());
		String S = BR.readLine();
		int PSA[] = new int[S.length() + 1];
		for (int i = 1; i < S.length(); i++)
		{
			if (S.charAt(i - 1) == 'A' && S.charAt(i) == 'C') PSA[i]++;
		}
		for (int i = 1; i <= S.length(); i++) PSA[i] += PSA[i - 1];
		for (int i = 0; i < Q; i++)
		{
			ST = new StringTokenizer(BR.readLine());
			int l = Integer.parseInt(ST.nextToken()), r = Integer.parseInt(ST.nextToken());
			int count = PSA[r - 1] - PSA[l - 1];
			System.out.println(count);
		}
	}
}
