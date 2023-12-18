import java.util.*;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
 
   int N = sc.nextInt();
   int[] m = new int[N];
   int[] ans = new int[]; 
   for(int i=0;i<N;i++) 
   {
     m[i] = sc.nextInt();
   } 

   if(N%2==0)
   {
     for(int i =0;i<N/2;i++) ans[i] = m[N-1-2*i];
     for(int i =0;i<N/2;i++) ans[i+N/2]= m[2*i];
   }
   else
   {
     for(int i= 0;i<(N+1)/2;i++) ans[i] = m[N-1-2*i];
     for(int i= 0;i<(N-1)/2;i++) ans[i] = m[2+2*i];
   }
   for(int i=0;i<N;i++)System.out.println(ans[i]+" ");
 }
}