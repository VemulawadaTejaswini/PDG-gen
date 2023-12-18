import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    long sum = 0;
    //int max = 0;
    boolean allOne = true;
    for (int i = 0; i < N; i++) {
      int a = sc.nextInt();
      sum += a;
      if (a != 1) {
        allOne = false;
      }
      //max = Math.max(max, a);
    }
    System.out.println(allOne || sum%2 == 1 ? "first" : "second");
  }
}