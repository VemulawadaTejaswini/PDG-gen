import java.util.*;

 // Compiler version JDK 11.0.2

 class Dcoder
 {
   public static void main(String args[])
   { 
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    long h[]=new long[n+1];
    int b[]=new int[n+1];
    for(int i=1;i<n+1;i++)
    {
      h[i]=sc.nextLong();
      b[i]=0;
    }
    int t=0;
    
    for(int i=1;i<=m;i++)
    {
      int a =sc.nextInt();
      int c =sc.nextInt();
      if(h[a]>h[c])
      b[a]++;
      else
      b[c]++;
      
    }
    for(int i =1;i<n+1;i++)
    {
      if(b[i]>0)
      t++;
    }
    System.out.println(t);
    
    
   }
 }
