/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner in=new Scanner(System.in);
	    String s1=in.next();
	    String s2=in.next();
	    int l1=s1.length();
	    int l2=s2.length();
	    String a[][]=new String[l1][l2];
	    for(int i=0;i<l1;i++){
	        for(int j=0;j<l2;j++)a[i][j]="#";
	    }
	    System.out.println(lcs(a,s1,s2,l1-1,l2-1));
	}
	public static String lcs(String[][] a,String s1,String s2,int x,int y){
	    for(int n1=0;n1<=x;n1++){
	        for(int n2=0;n2<=y;n2++){
	    if(s1.charAt(n1)==s2.charAt(n2)){
	        String t=Character.toString(s1.charAt(n1));
	        if(n1==0||n2==0)a[n1][n2]=t;
	        else  a[n1][n2]=a[n1-1][n2-1]+t;
	        return a[n1][n2];
	    }
	    if(n1==0&&n2!=0){
	        a[n1][n2]= a[n1][n2-1];
	        return a[n1][n2];
	    }
	    if(n1!=0&&n2==0){
	        a[n1][n2]= a[n1-1][n2];
	        return a[n1][n2];
	    }
	    if(n1==0&&n2==0){
            a[n1][n2]="";
	        return a[n1][n2];
	    }
	    String t1=a[n1-1][n2];
	    String t2=a[n1][n2-1];
	    a[n1][n2]=(t1.length()>t2.length())?t1:t2;
	        }
	    }
	    return a[x][y];
	}
}
