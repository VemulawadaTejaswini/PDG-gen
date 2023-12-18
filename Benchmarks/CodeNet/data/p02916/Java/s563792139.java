import java.util.*;
public class Main{
  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);

      int N = sc.nextInt();

      int[] A = new int[N];
      int[] B = new int[N];
      int[] C = new int[N];
      int count = 0;

      int sum = 0;

      for(int i = 0;i<N;i++){
         A[i] = sc.nextInt();
      }

      for(int i = 0;i<N;i++){
         B[i] = sc.nextInt();
      }

      for(int i = 0;i<N-1;i++){
         C[i] = sc.nextInt();
      }

      for( int i = 0;i<N-1;i++){
        if(A[i]+1==(A[i+1])){
          sum = sum +C[count];
          count++;
        }
      }

      for(int i = 0;i<N;i++){
        sum = sum + B[i];
      }

      System.out.println(sum);
  }
}
