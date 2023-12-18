import java.util.*;
import java.math.*;
import java.lang.*;
import java.io.*;

public class Main{
  public static void main(String args[]) throws IOException{
    Scanner s=new Scanner(System.in);
   
    
    
    int n=s.nextInt();
    long a[]=new long[n];
    long f[]=new long[n];
    long b[]=new long[n];
    long sum=0;
    for(int i=0;i<n;i++){
        a[i]=s.nextLong();
        sum+=a[i];
        f[i]=sum;
        //System.out.print(f[i]+" ");
    }
     
     //System.out.println();
     sum=0;
      for(int i=n-1;i>=0;i--)
      {sum+=a[i];
      b[i]=sum;
      
      }
     
      //for(int val:b)
     // System.out.print(val+" ");
      //System.out.println();
      long min=1000000000;
      for(int i=0;i<n-1;i++){
          if(Math.abs(f[i]-b[i+1])<min){
          min=Math.abs(f[i]-b[i+1]);
          
          }
      }
      System.out.println(min);
      
    
  }
}