import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long A = sc.nextLong();
    long B = sc.nextLong();
    long sum = A+B;
    long sum1 = 0;
    long res = 0;

    if(A == 0 || N == B) {
      res = 0;
    }
    else if(N==sum || N == A){
      res = A;
    } else if(N>sum){
      sum1 = A + (N-sum);
      res = sum1;
    }
    System.out.println(res);
  }
}