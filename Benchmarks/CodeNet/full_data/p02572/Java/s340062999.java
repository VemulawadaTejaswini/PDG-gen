import java.io.*;
import java.util.*;
class Main
{
	public static void main(String args[]) throws IOException
	{
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=0;
		n=Integer.parseInt(br.readLine());
		String brr[]=br.readLine().split(" ");
		long ar[]=new long[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=Long.parseLong(brr[i]);
		}
		if(n>1)
		{
        long suffix_sum = ar[n - 1];
        long res = 0; 
        for (int i = n - 2; i >= 0; i--) 
        { 
            res +=(suffix_sum * ar[i]); 
            suffix_sum += ar[i]; 
        }
        System.out.println((long)(res%(1e9+7)));
    }
    else
    {
    	System.out.println(ar[0]);
    }
}
	catch(Exception e){}
}}