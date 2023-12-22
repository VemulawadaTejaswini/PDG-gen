//package ABC172;
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		int count=0;
		long sum=0;
		int a[]=new int[n];
		int b[]=new int[m];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int j=0;j<m;j++)
		{
			b[j]=sc.nextInt();
		}
		
		/*
		Stack<Integer> s1=new Stack<>();
		
		Stack<Integer> s2=new Stack<>();
		
		for(int i=0;i<n;i++)
		{
			s1.push(a[i]);
		}
		
		for(int j=0;j<m;j++)
		{
			s2.push(b[j]);
		}
		*/
		
		/*
		int dp[][]=new int[n+1][m+1];
		
		for(int j[]:dp)
		{
			Arrays.fill(j,-1);
		}
		*/
		HashSet<String> hs=new HashSet<>();
		HashMap<String,Integer> hm=new HashMap<>();
		
		
		System.out.println(solve(a,b,0,0,k,0,hm));
		
		
	}
	
	public static int solve(int a[],int b[],int i,int j,int k,long sum, HashMap<String,Integer> hm)
	{
		String ss=i+" "+j;
		if(hm.containsKey(ss))
		{
			return hm.get(ss);
		}
		if(sum>k)
		{
			return -1;
		}
		if(sum==k)
		{
			return 0;
		}
		if(i>=a.length && j>=b.length)
		{
			return 0;
		}
		int option1=0;
		int option2=0;
		if(i<a.length)
		{
			option1=1+solve(a,b,i+1,j,k,sum+a[i],hm);
		}
		if(j<b.length)
		{
			option2=1+solve(a,b,i,j+1,k,sum+b[j],hm);
		}
		
		hm.put(ss,Math.max(option1, option2));
		return hm.get(ss);
	}
	
	

}
