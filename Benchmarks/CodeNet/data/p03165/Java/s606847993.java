/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
    static void solve(String s1,String s2,int n,int m){
        
        int t[][]=new int[n+1][m+1];
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }
                
                else{
                    t[i][j]=Math.max(t[i-1][j],t[i][j-1]);
                }
                
            }
        }
        
        
    int a=n;
    int b=m;
    String str="";
    while(a!=0&&b!=0){
        if(s1.charAt(a-1)==s2.charAt(b-1)){
            str+=s1.charAt(a-1);
            a--;
            b--;
        }
        
        else{
            if(t[a-1][b]>t[a][b-1]){
                a--;
            }
            else{
                b--;
            }
            
            
        }
        
    }
        
      
      System.out.println(reverse(str));
        
      
        }
        
  public static String reverse(String str)
	{
		return new StringBuilder(str).reverse().toString();
	}

    
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
	
	Scanner s=new Scanner(System.in);
String s1=s.next();
   String t=s.next();
   
solve(s1,t,s1.length(),t.length());
   
	}
}
