
import java.util.*;
import java.io.*;

public class Main{

	private static final long mod =(long)1e9+7;
	public static void main(String[] args) throws Exception  {
	      Scanner  sc=new Scanner(System.in);
	      PrintWriter out=new PrintWriter(System.out);
	      long a=sc.nextLong(),b=sc.nextLong(),c=sc.nextLong(),d=sc.nextLong();
	   long aa[]= {a,b};
	   long bb[]= {c,d};
	   long ans=Long.MIN_VALUE;
	   for(int i=0;i<2;i++) {
	     for(int j=0;j<2;j++) {
	       ans=Math.max(ans,aa[i]*bb[j]*1l);
	     }
	   }
	   out.println(ans);

	    out.flush();
	    }
//	    static long binarySearch(long i,long j,long a[]) {
//	      
//	    }
	
	static boolean vis[]=new boolean[10001];
	      static long gcd(long a, long b) 
	      { 
	          if (a == 0) 
	              return b; 
	          return gcd(b % a, a); 
	      } 
//	    static  void dfs(long n,boolean flag,ArrayList<ArrayList<longeger>> adj,long src,boolean vis[],ArrayList<longeger> centroid,long size[]) {
//	        vis[src]=true;
//	        size[src]=1;
//	        for(long i:adj.get(src)) {
//	          if(vis[i]==false){
//	            dfs(n,flag,adj,i,vis,centroid,size);
//	            size[src]+=size[i];
//	            if(size[i]>n/2) {
//	              flag=false;
//	            }
//	          }
//	        }
//	        if(n-size[src]>n/2) {
//	          flag=false;
//	        }
//	        if(flag==true) {
//	          centroid.add(src);
//	        }
//	    }
//	
//	     
//	      
}