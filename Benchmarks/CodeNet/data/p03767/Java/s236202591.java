

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main
{

	public static void main(String[]args)throws Throwable
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer arr[] = new Integer[n * 3];
		n *= 3;
		for(int i = 0 ; i < n ; ++i)
			arr[i] = sc.nextInt();
		Arrays.sort(arr);
		int l = 0;
		int r = n - 1;
		long sum = 0;
		while(l <= r)
		{
			l++;
			r--;
			sum += 1L*arr[r];
			r--;
		}
		System.out.println(sum);
		
	}
	static class Scanner
	{
		BufferedReader br;
		StringTokenizer st;


		Scanner(InputStream s)  { br = new BufferedReader(new InputStreamReader(s)); }

		String next() throws IOException
		{

			while(st == null || !st.hasMoreTokens())
				st = new StringTokenizer(br.readLine());
			return st.nextToken();

		}
		int nextInt() throws NumberFormatException, IOException { return Integer.parseInt(next()); }



	}
}
