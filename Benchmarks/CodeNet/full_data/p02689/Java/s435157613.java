/*package whatever //do not write package name here */
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) {
// 		System.out.println("GfG!");
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int m=input.nextInt();
		int[] h=new int[n+1];
		for(int i=1;i<n;i++)
		    h[i]=input.nextInt();
		 int[] isthere=new int[n+1];
		 int[] point=new int[n+1];
		 for(int i=0;i<m;i++)
		 {
		     int x,y;
		     x=input.nextInt();
		     y=input.nextInt();
		     isthere[x]=1;
		     isthere[y]=1;
		     if(h[x]>h[y])
		     {
		        point[x]+=1; 
		       point[y]+=Integer.MIN_VALUE;
		     }
		     else if(h[x]<h[y])
		     {
		        point[x]=Integer.MIN_VALUE;
		        point[y]+=1;
		     }
		        
		 }
		 int count=0;
		 for(int i=1;i<=n;i++)
		 {
		        if(isthere[i]==0)
		            count+=1;
		      if(point[i]>0)
		        count+=1;
		 }
		 System.out.println(count);
		input.close();
	}
}