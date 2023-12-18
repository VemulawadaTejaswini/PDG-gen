import java.io.*;
import java.util.*;
public class Main{

     public static void main(String []args){
    Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      long a[]=new long[n];
      for(int i=0;i<n;i++)
      a[i]=s.nextLong();
      HashSet<Long>hs=new HashSet<>();
      boolean flag=false;
      for(int i=0;i<n;i++)
      {if(hs.contains(a[i]))
      {flag=true;
      break;}
      else
      hs.add(a[i]);}
      if(flag)
      System.out.println("NO");
      else
      System.out.println("YES");
     }
}