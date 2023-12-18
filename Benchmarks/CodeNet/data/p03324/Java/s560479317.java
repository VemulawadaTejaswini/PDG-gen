import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int D = sc.nextInt();
    int N = sc.nextInt();
    switch (D) {
      case 0:
        System.out.println(N);
        break;
      case 1:
        System.out.println(N * 100);
        break;
      case 2:
        System.out.println(N * 100 * 100);
        break;
    }
  }
}