import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    for (int i = 0; i < 100; i++) {
      int k = b*i+1;
      System.out.println(k);
      if (k%a==0) {
        System.out.println("YES");
        return;
      }
    }

    System.out.println("NO");

  }

}
