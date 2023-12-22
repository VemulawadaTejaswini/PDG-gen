import java.util.*;
 public class main
 {
   public static void main(String args[])
   { 
     Scanner s = new Scanner(System.in);
     int n = s.nextInt();
     int k = s.nextInt();
     int i,j,swap,sum=0;
     int p[] = new int[n];
     for(i=0;i<n;i++)
     {
       p[i] = s.nextInt();
     }
     for(i=0;i<n;i++)
     {
       for(j=i+1;j<n-1;j++)
       {
         if(p[i]>p[j])
         {
           swap = p[i];
           p[i] = p[j];
           p[j] = swap;
         }
       }
     }
     for(i=0;i<k;i++)
     {
       sum+=p[i];
     }
   }
 }  