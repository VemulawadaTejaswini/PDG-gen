import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = sc.nextInt();

    for(int i = 1;; i++) {
      int d_new = 2 * d + i;
      if(i * d_new >= n) {
        System.out.println(i);
        break;
      }
    }

  }

}
