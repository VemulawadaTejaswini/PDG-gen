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
   for(int i=0;i<M;i++ )
   {
     Arrays.sort(A);
     A[N-1] = A[N-1]/2;
   }
   long total = 0;
   for(int i=0;i<N;i++)
   {
     total  += A[i];
   }
   
   
System.out.println(total);   
   
 }
}