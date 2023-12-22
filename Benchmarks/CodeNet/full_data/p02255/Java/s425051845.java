import java.io.*;

public class Main
{
	public static void main(String[] args)
	{
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int n = Integer.parseInt(br.readLine());
			String[] str = br.readLine().split(" ");
			int[] ar = new int[n];
			for(int i= 0 ; i< n ; i++)
			{
				ar[i] = Integer.parseInt(str[i]);
			}
			gyalaxySort(ar,n);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void gyalaxySort(int[] a, int len)
	{
		StringBuilder sb = new StringBuilder();
		sb.append(giganticBunshou(a,len));
		for(int i = 1 ; i < len ; i++)
		{
			int tar = a[i];
			int j = i - 1;
			while(j >= 0 && a[j] > tar )
			{
				a[j+1] =a[j]; 
				a[j] = tar;
				j--;
				
			}
			sb.append(giganticBunshou(a,len));
		}
		System.out.print(sb);
	}
	public static String giganticBunshou(int[] b, int l)
	{
		StringBuilder sb = new StringBuilder();
		for(int i=0 ; i<l-1 ; i++)
		{
			sb.append(b[i]).append(" ");
		}
		sb.append(b[l-1]).append("\n");
		return sb.toString();
	}
	
}