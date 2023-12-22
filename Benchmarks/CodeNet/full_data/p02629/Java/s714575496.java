import java.util.*;
import java.io.*;

public class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    long a[]=new long[12];
    for(int i=0;i<a.length;i++)
     {
      long pow=11-i;
      long div=(long)Math.pow(26,pow);
      long res=n/div;
      if(res>1)
        a[i]=1;
      else
        a[i]=res;
      n=n-(a[i]*div);
    }
  String ans="";
   for(int i=0;i<a.length;i++)
   {
     if(a[i]==0)
       continue;
     else
       ans+=(char)(a[i]+96);
   }
     System.out.println(ans);
  }
}