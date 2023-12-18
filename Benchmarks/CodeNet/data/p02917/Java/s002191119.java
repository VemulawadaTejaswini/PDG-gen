import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   int N = sc.nextInt();

   int[] B = new int[N];
   for(int i=0;i<N-1;i++ )
   {
     B[i]  = sc.nextInt();
   }

   int total = 0;
   for(int i =0; i<N;i++)
   {
     if(i==0) total +=B[i];
     else if(i == N-1) total += B[i-1];
     else
     {
      if(B[i]> B[i-1]) total += B[i-1];  
      else total += B[i];
     }
   }
   
System.out.println(total);   
   
 }
}