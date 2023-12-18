import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long M = sc.nextLong();
    if(N>M) { long tmp = M; M=N; N=tmp; }
    // may assume N<=M
    long result;
    if(M<=1) {
      result = 1;
    } else if(M<=2) {
      result = 0;
    } else {
      result = (N-2)*(M-2);
    }
    if(result<0) result = result * (-1);
    System.out.println(result);
  }
}
