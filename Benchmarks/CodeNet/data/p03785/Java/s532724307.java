import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), c = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		int[] times = new int[n];
		for(int i = 0; i < n; i++)
			times[i] = Integer.parseInt(br.readLine());
		Arrays.sort(times);
		int i = 0, buses = 0;
		while(i < n)
		{
			int end = times[i] + k, num = 1;
			i++;
			while(i < n && times[i] <= end && num < c)
			{
				num++;
				i++;
			}
			buses++;
		}
		pw.println(buses);
		br.close();
		pw.close();
		System.exit(0);
	}
}