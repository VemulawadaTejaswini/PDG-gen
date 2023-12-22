
import java.util.Scanner;
import java.util.Comparator;
import java.util.Arrays;
import java.math.BigInteger;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    long A[] = new long[N];
    long add = 0;
    A[0] = scan.nextLong();
    for(int i = 1; i < N; i++){
      A[i] = scan.nextLong();
      if(A[i] < A[i-1]){
        add += A[i-1] -A[i];
        A[i] = A[i-1];
      }
    }
    System.out.println(add);
  }
}