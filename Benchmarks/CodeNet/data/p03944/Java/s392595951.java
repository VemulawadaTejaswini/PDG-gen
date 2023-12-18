import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int W = sc.nextInt();   
   int H = sc.nextInt();
   int N = sc.nextInt();
   int[] x = new int[N];
   int[] y = new int[N];
   int[] a = new int[N];
   for(int i=0;i<N;i++)
   {
     x[i] = sc.nextInt();
     y[i] = sc.nextInt();
     a[i] = sc.nextInt();
   }
   int xmax=W;
   int xmin=0;
   int ymax=H;
   int ymin=0;
   for(int i=0;i<N;i++)
   {
     if(a[i]==1)
     {
       if(xmin<x[i]) xmin=x[i];
     }
     if(a[i]==2)
     {
       if(xmax>x[i]) xmax=x[i];
     } 
     if(a[i]==3)
     {
       if(ymin<y[i]) ymin=y[i];
     }
     if(a[i]==4)
     {
       if(ymax>y[i]) ymax=y[i];
     }
   }
   int ans =0;
   if(xmax>xmin&&ymax>ymin) ans = (xmax-xmin)*(ymax-ymin);
   System.out.println(ans);
 }
}