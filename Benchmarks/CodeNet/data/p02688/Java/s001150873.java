import java.util.*;

 // Compiler version JDK 11.0.2

  public class Main
 {
   public static void main(String args[])
   { 
     Scanner sc= new Scanner(System.in);
     int n =sc.nextInt();
     int a[]=new int[n+1];
     int k =sc.nextInt();
     while(k>0)
     {
       int d = sc.nextInt();
       for(int i=0;i<d;i++)
       {
         int b= sc.nextInt();
         a[b]++;
         
       }
       k--;
     }
     int t=0;
     for(int i =1;i<=n;i++)
     {
       if(a[i]==0)
       t++;
     }
     System.out.println(t);
   }
 }
    