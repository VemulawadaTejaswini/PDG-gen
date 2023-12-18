import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();	// Num of Goods
    int M = sc.nextInt();	// Num of Coupon
    int A[] = new int[N];	// Price of Goods
    sc.nextLine();
    
    for(int i=0; i<N; i++){
      A[i] = sc.nextInt();
    }
    
    Arrays.sort(A);
    for(int i=0; i<M; i++){
      int maxValue = A[N-1];
      int maxSuffix = N-1;
      for(int j=M-1; j>M-i-1;j--){
        if(maxValue < A[j]){
          maxValue = A[j];
          maxSuffix = j;
        }
      }
      A[maxSuffix] = A[maxSuffix] / 2;
    }
    
    long Sum = 0;
    for(int i=0; i<N; i++){
      Sum += A[i];
    }
    
    System.out.println(Sum);
  }
}