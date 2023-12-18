import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int[] A = new int[N];
    int[] B = new int[M];
    int[] C = new int[M];
    int sum = 0;
    
    for(int i=0;i<N;i++){
      A[i] = sc.nextInt();
    }
    Arrays.sort(A);
    for(int i=0;i<M;i++){
      B[i] = sc.nextInt();
      C[i] = sc.nextInt();
    }
    
    for(int i=0;i<M;i++){
      for(int j=0;j<B[i];j++){
        if(C[i]>=A[j]){
          A[j] = C[i];
        }
      }
      Arrays.sort(A);
    }
    
    for( int i=0;i<A.length;i++){
        sum += A[i];
    }
    System.out.println(sum);
  }
}