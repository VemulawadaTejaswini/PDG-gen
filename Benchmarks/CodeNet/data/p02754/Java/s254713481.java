import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int sum = A+B;
    int sum1 = 0;

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