import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int k = sc.nextInt();

    if (2 * k < b-a) {
      for (int i = 0; i < k; i++) {
        System.out.println(a);
        a++;
      }
      b -= k-1;
      for (int i = 0; i < k; i++) {
        System.out.println(b);
        b++;
      }
    } else if (2 * k >= b-a) {
      for (; a <= b; a++) {
        System.out.println(a);
      }
    }

  }

}
