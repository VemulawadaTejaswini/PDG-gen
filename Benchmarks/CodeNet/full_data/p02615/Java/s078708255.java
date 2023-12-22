
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;
public class Main{
	static int n;
	static int k;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.valueOf(br.readLine());
		long[] arr=new long[n];
		String[] cmd=br.readLine().split(" ");
		for(int i=0;i<n;i++)
		{
			arr[i]=Long.valueOf(cmd[i]);
		}
		Arrays.sort(arr);
		long ans=arr[n-1];
		int k=n-2;
		for(int i=n-2;i>=0;i--)
		{
			if(k==0)
				break;
			if(k>=2)
			{
				k=k-2;
				ans=ans+2*arr[i];
			}
			else
			{
				k--;
				ans=ans+arr[i];
			}
		}
		System.out.println(ans);
	}

}
