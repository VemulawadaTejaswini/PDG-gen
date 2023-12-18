import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];

    for(int i = 0; i < N; i++){
      A[i] = sc.nextInt() - i - 1;
    }
    Arrays.sort(A);
    int m;
    if(N%2 == 0){
      m = (A[N/2] + A[(N - 1)/2])/2;
    }else{
      m = A[N/2];
    }
    long result = 0;
    for(int i = 0; i < N; i++){
      result += Math.abs(A[i] - m);
    }
    System.out.println(result);
  }
}
