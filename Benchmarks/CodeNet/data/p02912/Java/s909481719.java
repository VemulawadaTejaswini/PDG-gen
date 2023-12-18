import java.util.Scanner;
import java.util.Arrays;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();   
   int M = sc.nextInt();

   long[] A = new long[N];
   for(int i=0;i<N;i++ )
   {
     A[i]  = sc.nextLong();
   }
   long total = 0;
   for(int i=0;i<N;i++)
   {
     total  += A[i];
   }
   long avg = total/N;
   Arrays.sort(A);
   while(M>0){
   for(int i=0;i<N;i++)
   {
     if(A[N-1-i] >= avg) 
     {
       A[N-1-i] = A[N-1-i]/2;
       M--;
     }
     if(M<=0 || A[N-1-i] < avg) break;
    }
     
   total =0;
      for(int k=0;k<N;k++)
   {
     total  += A[k];
   }
   avg = total/N;
   Arrays.sort(A);
   }
   long totala = 0;
   for(int i=0;i<N;i++)
   {
     totala  += A[i];
   }
   
   
System.out.println(totala);   
   
 }
}