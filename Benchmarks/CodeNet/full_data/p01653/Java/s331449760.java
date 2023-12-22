import java.io.BufferedReader;
import java.io.IOException;


import java.io.PrintWriter;

import java.io.InputStreamReader;
import java.util.*;
public class Main{
static int inf=999999999;
static int n,m,s1,s2,t;
static int[] ex,ey,ew;
static int[] d,mag;
static boolean[] vis;
static void dij(){
	vis=new boolean[n];
	d=new int[n];
	mag=new int[n];
	for(int i=0;i<n;i++){
		vis[i]=true;
		d[i]=inf;
		mag[i]=0;
	}
	d[t]=0;
	
	int min,pos;
	for(int i=0;i<n;i++){
		pos=t;min=inf;
		for(int j=0;j<n;j++)
			if(vis[j]&&d[j]<min){
				min=d[j];
				pos=j;
			}
		vis[pos]=false;
		for(int j=0;j<m;j++){
			if(ew[j]!=-1){
			if(ex[j]==pos&&vis[ey[j]]&&d[ey[j]]>d[ex[j]]+ew[j])
				d[ey[j]]=d[ex[j]]+ew[j];
			if(ey[j]==pos&&vis[ex[j]]&&d[ex[j]]>d[ey[j]]+ew[j])
				d[ex[j]]=d[ey[j]]+ew[j];
			}
			else{
				ew[j]=0;
				if(ex[j]==pos&&vis[ey[j]]&&d[ey[j]]>d[ex[j]]+ew[j]){
					d[ey[j]]=d[ex[j]]+ew[j];
					mag[ey[j]]=mag[ex[j]]+1;//
					}
				if(ey[j]==pos&&vis[ex[j]]&&d[ex[j]]>d[ey[j]]+ew[j]){
					d[ex[j]]=d[ey[j]]+ew[j];
					mag[ex[j]]=mag[ey[j]]+1;//
					}
				ew[j]=-1;
			}
		}
		
	}
}
public static void  main(String args[]) throws IOException{ 
    Scanner a = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    while(a.hasNext()){
    	n=a.nextInt();
    	m=a.nextInt();
    	s1=a.nextInt()-1;
    	s2=a.nextInt()-1;
    	t=a.nextInt()-1;
    	ex=new int[m];
    	ey=new int[m];
    	ew=new int[m];
    	for(int i=0;i<m;i++){
    		ex[i]=a.nextInt()-1;
    		ey[i]=a.nextInt()-1;
    		String s=a.next();
    		if(s.equals("x"))ew[i]=-1;
    		else ew[i]=Integer.parseInt(s);
    	}
    	
    	dij();
    	//for(int i=0;i<n;i++)System.out.println(d[i]+" "+mag[i]);
    	int ans=d[s1]-d[s2];
    	int gap=mag[s1]-mag[s2];
    	//System.out.println(ans+" "+gap);
    	if(ans*gap<0){
    		int cur=1;
    		ans=Math.abs(ans);
    		gap=Math.abs(gap);
    		cur=ans/gap+1;
    		int x=Math.abs(gap*cur-ans);
    		int y=Math.abs(ans-gap*(cur-1));
    		//System.out.println(x+" "+y);
    		ans=Math.min(x, y);
    	}
    	System.out.println(Math.abs(ans));
    }
   }
}