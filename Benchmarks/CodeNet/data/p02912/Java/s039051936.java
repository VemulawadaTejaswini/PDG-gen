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
    
    for(int i=0; i<M; i++){
      Arrays.sort(A);
      A[N-1] = A[N-1] / 2;
    }
    
    long Sum = 0;
    for(int i=0; i<N; i++){
      Sum += A[i];
    }
    
    System.out.println(Sum);
  }
}