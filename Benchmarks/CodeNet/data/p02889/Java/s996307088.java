import java.util.*;
import java.io.*;
import java.lang.*;

public class Main{

public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
       int n=s.nextInt(),m=s.nextInt(),l=s.nextInt();
       long[][] g=new long[n+1][n+1];
       int[][] path=new int[n+1][n+1];
       for(int i=1;i<=n;i++){
       	Arrays.fill(g[i],(long)1e13);
       }
       for(int i=0;i<m;i++){
       	int x=s.nextInt(),y=s.nextInt(),c=s.nextInt();
       	g[x][y]=c;  path[x][y]=y;
       	g[y][x]=c;  path[y][x]=x;
       }

       for(int i=0;i<n;i++){
       	g[i][i]=0;
       }

       	for (int k = 1; k <= n; k++) 
        { 
            // Pick all vertices as source one by one 
            for (int i = 1; i <= n; i++) 
            { 
                // Pick all vertices as destination for the 
                // above picked source 
                for (int j = 1; j <= n; j++) 
                { 
                    // If vertex k is on the shortest path from 
                    // i to j, then update the value of dist[i][j] 
                    if (g[i][k] + g[k][j] < g[i][j]){
                        g[i][j] = g[i][k] + g[k][j]; 
                        path[i][j]=path[i][k];}
                } 
            } 
        } 
        int q=s.nextInt();
        for(int i=0;i<q;i++){
        	int start=s.nextInt(),end=s.nextInt();
        	///System.out.print(g[start][end]+" ");
        	if(g[start][end]==(long)1e13){
        		sb.append("-1 ");
        	}
        	else{
        		long res=0;
        		int curr=l;
                int s1=0;
        		while(start!=end){
        	        s1=path[start][end];
        	        //System.out.print(s1+"  ");
        	        if(g[start][s1]>l){
        	        	sb.append("-1 "); break;
        	        }

        		if(curr>=g[start][s1]){
        			curr-=g[start][s1];
        			start=s1;
        		}
        		else{
        			res++;curr=l;
        			curr-=g[start][s1];
        			start=s1;
        		}
        	}
        		sb.append(res+" ");
        	}
        }
       System.out.println(sb); 
    }
}
    
  










