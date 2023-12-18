import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args)throws IOException {
		InputStreamReader read=new InputStreamReader(System.in);
		BufferedReader in=new BufferedReader(read);
		String str=in.readLine();
		String line[]=str.trim().split(" ");
		int k=Integer.parseInt(line[0]);
		int n=Integer.parseInt(line[1]);
		String st=in.readLine();
		int a[]=new int[n];
		String l[]=st.trim().split(" ");
		int i;
		for(i=0;i<n;i++)
		{
		    a[i]=Integer.parseInt(l[i]);
		}
		int temp1=(k-a[n-1])+a[0]+(a[n-2]-a[0]);
		int temp2=a[n-1]-a[0];
		int ans=Math.min(temp1,temp2);
		System.out.println(ans);
	}
}
