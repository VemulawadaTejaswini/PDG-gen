import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		int n = Integer.parseInt(br.readLine());
		long[] a = new long[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++)
			a[i] = Long.parseLong(st.nextToken());
		Arrays.sort(a);
		long[] pre = new long[n+1];
		pre[0] = 0;
		for(int i = 1; i <= n; i++)
			pre[i] = pre[i-1] + a[i-1];
		int ans = 0;
		for(int i = 0; i < n; i++)
		{
			long start = pre[i+1];
			int j = i+1;
			while(j < n && a[j] <= 2*start)
				start += a[j++];
			if(j == n)
			{
				ans = n-i;
				break;
			}
		}
		pw.println(ans);
		br.close();
		pw.close();
		System.exit(0);
	}
}