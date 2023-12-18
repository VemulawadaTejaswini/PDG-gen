

import java.io.*;

import java.util.*;

class pair{
	int a ;int b;
	public pair(int a,int b){
		this.a=a;
		this.b=b;
	}}

public class Main {
	
	public static void solve(String s1,String s2) {
		
	}

	public static void main(String[] args) throws IOException 
	{ 

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int[] arr=new int[n];
		TreeMap<Integer,TreeSet<Integer>> maxi=new TreeMap<>();
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.nextInt();
			maxi.put(i+1,new TreeSet<>());
		}
		int[][] edge=new int[m][2];
		HashSet<Integer> jj=new HashSet<>();
		
		for (int i = 0; i < edge.length; i++) {
			edge[i][0]=s.nextInt();
			edge[i][1]=s.nextInt();
			jj.add(edge[i][0]);
			jj.add(edge[i][1]);
			maxi.get(edge[i][0]).add(arr[edge[i][1]-1]);
			maxi.get(edge[i][1]).add(arr[edge[i][0]-1]);
			
			
		}
		int ans=0;
		for (int i = 0; i < n; i++) {
			int temp=arr[i];
			if(!jj.contains(i+1)) {
				ans++;
				continue;
			}
			if(maxi.get(i+1).last()<temp)
				ans++;
			
		} 
		System.out.println(ans);
		


	}


}