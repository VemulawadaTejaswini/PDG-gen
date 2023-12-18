
import java.util.*;
import java.io.*;
class test_java{
	public static void main(String[]args){
		Scanner in=new Scanner(System.in);
		PrintWriter out=new PrintWriter(System.out, true);
		int n=in.nextInt();
		int m=in.nextInt();
		int x=in.nextInt();
		int c[]=new int[n];
		int a[][]=new int[n][m];
		for(int i=0;i<n;i++){
			c[i]=in.nextInt();
			
			for(int j=0;j<m;j++)
				a[i][j]=in.nextInt();
		}
		int ans=12345678;
		int all=1<<n;
		for(int mask=0;mask<all;mask++){
			int level[]=new int[m];
			int cost=0;
			for(int i=0;i<n;i++){
				if(((mask>>i)&1)>0){
					cost+=c[i];
					for(int j=0;j<m;j++){
						level[j]+=a[i][j];
					}
				}
			}
			boolean ok=true;
			for(int j=0;j<m;j++){
				if(level[j]<x)
					ok=false;
			}
			if(ok)
				ans=Math.min(ans, cost);
		}
		if(ans==12345678)
			out.println(-1);
		else
			out.println(ans);
	}
}