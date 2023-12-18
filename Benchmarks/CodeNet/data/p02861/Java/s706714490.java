/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
/* Name of the class has to be "Main" only if the class is public. */


/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner s=new Scanner(System.in);
        
            
            int n=s.nextInt();
  
            int a[]=new int[n];
            int b[]=new int[n];
      for(int i=0;i<n;i++){
                a[i]=s.nextInt();
        b[i]=s.nextInt();
      }
      double d=0.0;
      
      for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
          d+=Math.sqrt((a[i]-a[j])*(a[i]-a[j])+(b[i]-b[j])*(b[i]-b[j]));
        }
      }
      System.out.format("%.6f",(2*d)/n);
    }
}