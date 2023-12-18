import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long A = sc.nextLong();
    long B = sc.nextLong();
    long sum = A+B;

    if(A == 0) {
      System.out.println(0);
    }else if(N>=sum){
      System.out.println(A + (N-sum));
    }else {
      System.out.println(A);
    }
  }
}