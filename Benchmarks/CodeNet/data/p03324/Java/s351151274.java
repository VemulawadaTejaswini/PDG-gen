import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int D = sc.nextInt();
    int N = sc.nextInt();
    if (D == 0) {
      if (N != 100) {
        System.out.println(N);
      } else {
        System.out.println(N+1);
      }
    }
    if (D == 1) {
      if (N != 100) {
        System.out.println(N * 100);
      } else {
        System.out.println(N * 100 +100);
      }
    } 
    if (D == 2) {
      if (N != 100) {
        System.out.println(N * 10000);
      } else {
        System.out.println(N * 10000 + 10000);
      }
    }
  }
}