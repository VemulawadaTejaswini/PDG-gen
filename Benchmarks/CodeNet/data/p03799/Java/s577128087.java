import java.util.*;
public class Main {
  public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
      int N  = sc.nextInt();
      int M = sc.nextInt();
      if (M >= 2) {
        if (N*2 <= M) {
          if ((M - N*2) >= 4) {
            System.out.println(((M - N*2) / 4) + N);
          } else {
            System.out.println(N);
          }
        } else {
          System.out.println(M/2);
        }
      } else {
        System.out.println(0);
      }
  }
}