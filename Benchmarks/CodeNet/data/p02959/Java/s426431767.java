import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N+1];
    int[] B = new int[N];
    int count = 0;
    
    for(int k=0;k<=N;k++){
      A[k] = sc.nextInt();
    }
    for(int j=0;j<N;j++){
      B[j] = sc.nextInt();
    }
    
    for(int i=0;i<N;i++){
      if(A[N-i]>=B[N-1-i]){
        count += B[N-1-i];
      }else{
        if(A[N-1-i]>=B[N-1-i]-A[N-i]){
          A[N-1-i] -= B[N-1-i]-A[N-i];
          count += B[N-1-i];
        }else{
          count += A[N-i]+A[N-1-i];
          A[N-1-i] = 0;
        }
      }
    }
    System.out.println(count);
  }
} 