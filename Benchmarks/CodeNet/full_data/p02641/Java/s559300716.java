import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		if(n==0)
		{
			System.out.println(x);
			return;
		}
		st = new StringTokenizer(br.readLine());
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(arr);
		if(Arrays.binarySearch(arr,x)<0)
		{
			System.out.println(x);
			return;
		}
		for(int i=1;i<=100;i++)
		{
			
			if(Arrays.binarySearch(arr,x-i)<0)
			{
				System.out.println(x-i);
				return;
			}
			if(Arrays.binarySearch(arr,x+i)<0)
			{
				System.out.println(x+i);
				return;
			}
		}
	}
}