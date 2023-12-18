import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long A = sc.nextLong();
    long B = sc.nextLong();
    long sum = A+B;
    long sum1 = 0;

    if(A == 0){
      System.out.println("0");
    }

    else if(N==sum){
      System.out.println(A);
    }else if(N>sum){
      sum1 = A + (N-(A+B));
      System.out.println(sum1);
    }
  }
}