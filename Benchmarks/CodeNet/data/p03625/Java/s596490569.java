////package CodeChef;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
import java.util.LinkedHashSet;
import java.util.StringTokenizer;

public class Main {
   public static int mod=1000000007;
   public static int minPlus=mod;
	public static void main(String[] ard)  throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);
		int n=Integer.valueOf(br.readLine().trim());
		int[]A=new int[n+1];
		int[] freq=new int[100001];
		String[] s=br.readLine().trim().split("\\s++");
		for(int i=1;i<=n;i++){A[i]=Integer.valueOf(s[i-1]);freq[A[i]]++;}
		Arrays.sort(A);
		long sum=1;
		long ans=Long.MIN_VALUE;
		int a=0;
		int b=0;
		boolean[] B=new boolean[A[n]+1];
		for(int i=100000;i>=1;i--)
		{
			if(freq[i]>=4){ans=i*i; break;}
			if(freq[i]<4&&freq[i]>=2)
			{
				b++;
				if(!B[i])
				   B[i]=true;
				
				    sum*=i;
				    if(b==2){
				    	ans=sum; break;}
			}
			
		}
		if(ans==Long.MIN_VALUE)pw.println(0);
		else pw.println(ans);
		pw.close();
	}
	public  static void go (String num, String s, int sum, int i) {
	    if (i>=num.length()) {
	      int t = 0;
	      long rs = 0;
	      StringTokenizer st = new StringTokenizer(s,"+");
	      t = st.countTokens();
	      while (st.hasMoreTokens()) {
	        rs+=Long.parseLong((String)st.nextToken());
	      }
	      if (rs == sum) minPlus = Math.min(minPlus,t);
	    } else {
	      if (i == 0) go (num,""+num.charAt(i), sum, i+1);
	      else {
	        go (num,s+"+"+num.charAt(i),sum,i+1);
	        go (num,s+num.charAt(i),sum,i+1);
	      }
	 
	    }
	        
	 
	  }
	public static int pa(int n)
	{     int a=0;
	      int b=0;
		
		if(n<=0)return 1;
		System.out.println("kumar");
		 a+=pa(n-1);
		 System.out.println("prabhat");  
		 b+=pa(n-1);
		//System.out.println( callme("vikrant"));
	   
		return a+b;
	}
	public static  String callme(String s)
	{
		return s;
	}
	public static boolean palin(String s)
	{
		int i=0;
		int j=s.length()-1;
		while(i!=j)
		{
			if(s.charAt(i)!=s.charAt(j))return false;
			i++;
			j--;
		}
	   return true;	
	}
	

}
