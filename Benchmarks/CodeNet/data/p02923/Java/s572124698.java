import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {


	
	public static void main(String[] args)throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(System.out);
		
		int n = Integer.parseInt(br.readLine());
		
		int arr[] = new int [n];
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		for(int i = 0 ; i < n ; i++)
		{
			arr[i] = Integer.parseInt(st1.nextToken());
		}
		
		int cnt[] = new int[n];
		
		int max = 0;
		
		for(int i = n-2; i >= 0 ; i--)
		{
			if(arr[i] >= arr[i+1])
			{
				cnt[i] = cnt[i+1]+1;
			}
		}
		
		for(int i = 0 ; i < n ; i++)
			max = Math.max(max, cnt[i]);
		
		out.println(max);
		
		
		out.flush();
		out.close();
	}
	
	
	


}
