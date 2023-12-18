import java.util.*;

public class Main {
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();

    int maxDiv = 1;
    for (int i = 1; i <= Math.sqrt(M); i++) {
      if (M % i == 0) {
        if ((long) M / i >= (long) N) {
          maxDiv = i;
        }
      }
    }
    System.out.println(maxDiv);
  }
}
