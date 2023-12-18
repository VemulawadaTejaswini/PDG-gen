

import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	     int n=sc.nextInt();
	     int m=sc.nextInt();
	     ArrayList<ArrayList<Integer>> a=new ArrayList<>();
for(int i=0;i<n;i++) {
	a.add(new ArrayList<Integer>());
}
for(int j=0;j<m;j++) {
	int x=sc.nextInt()-1;
	int y=sc.nextInt()-1;
	a.get(x).add(y);
	a.get(y).add(x);
}
boolean vis[]=new boolean[n];
ans=0;
	System.out.println(dfs(a,0,vis,1,n));
	}
static int ans=0;	
	static int dfs(ArrayList<ArrayList<Integer>> a,int src,boolean vis[],int count,int n) {
		vis[src]=true;
		for(int i:a.get(src)) {
			if(vis[i]==false) {
				
				dfs(a,i,vis,count+1,n);
			}
		}
		if(count==n) {
		ans++;
		vis[src]=false;
			}else {
				vis[src]=false;
			}
		
		return ans;
	}
	static int[] arr(int n,Scanner sc) {
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		return a;
}

}
