/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in=new Scanner(System.in);
	    int n=in.nextInt();
	    int a[][]=new int[n+1][3];
	    for(int i=1;i<=n;i++){
	        for(int j=0;j<3;j++)a[i][j]=in.nextInt();
	    }
	    boolean ans=true;
	    
	    for(int i=1;i<=n;i++){
	        int diff=a[i][0]-a[i-1][0];
	        int act=Math.abs(a[i][1]-a[i-1][1])+Math.abs(a[i][2]-a[i-1][2]);
	   //     System.out.println(diff+" "+act);
	        ans&=(diff>=act&&(diff-act)%2==0);
	    }
	    if(ans)System.out.println("YES");
	    else System.out.println("NO");
	    
	    
	}
}
