//package Coding;

import java.util.*;
import java.io.*;
 
 
public class Main 
{   
 
	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));
		StringTokenizer s=new StringTokenizer(br.readLine());
 
		int n=Integer.parseInt(s.nextToken());
		 s=new StringTokenizer(br.readLine());
		 int a[]=new int[n];
		 HashMap<Integer,Integer>hm=new HashMap<>();
		 
		 for(int i=0;i<n;i++) {
			 a[i]=Integer.parseInt(s.nextToken());
			 if(!hm.containsKey(a[i]))
				 hm.put(a[i], 1);
			 else 
				 hm.put(a[i], hm.get(a[i])+1);
		 }
		 int ans=0;
		 for(int val:hm.keySet()) {
			 if(hm.get(val)>val)
				 ans+=hm.get(val)-val;
			 else if(hm.get(val)<val)
				 ans+=hm.get(val);
		 }
		
			pw.println(ans);
 
		
		pw.close();
 
	}
} 