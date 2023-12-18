import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A[] = new int[N];
    for (int i=0; i<N; i++) {
      A[i] = sc.nextInt();
    }
    int M[] = new int[N];
    for (int i=1; i<=N-1; i++) {
      M[i] = gcd(M[i-1], A[i-1]);
    }
    int U[] = new int[N];
    for (int i=1; i<=N-1; i++) {
      U[i] = gcd(U[i-1], A[N-i]);
    }
    int out = 1;
    for (int i=0; i<=N-1; i++) {
      int outtemp = gcd(M[i], U[N-i-1]);
      if(out < outtemp){
        out = outtemp;
      }
    }
    System.out.println(out);
  }

  public static int gcd(int num1, int num2) {
    if(num2 == 0) {
      return num1;
    } else {
      return gcd(num2, num1 % num2);
    }
  }
}

