import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();
   int T = sc.nextInt();
   int A = sc.nextInt();
   int[] Hi = new int[N];
   for(int i =0;i<N;i++) Hi[i] = sc.nextInt();
   
   int ans =0;
   double min = (double)(T-A);
   double di ;
   for(int i =0;i<N;i++) 
   {
     di = T-(double)Hi[i]*0.006-A;
     if(min > Math.abs(di)) 
     {
       ans = i+1;
       min = Math.abs(di);
     }
   }
   System.out.println(ans);
 }
}