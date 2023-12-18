import java.util.*;
 
public class Main{
 public static void main(String arg[])
 {
  Scannet sc=new Scanner(System.in);
   int n=sc.nextInt();
   int k=sc.nextint();
   int a[]=new int[n+1];
   
   for(int i=0;i<n;i++)
   {
      int t=sc.nextInt();
      for(int i=0;i<t;i++)a[sc.nextInt]++;
   }
   int m=0;
   for(int i=1;i<=n;i++)if(a[i]==0)m++;
   System.out.println(m);
   
   
 }
  
}