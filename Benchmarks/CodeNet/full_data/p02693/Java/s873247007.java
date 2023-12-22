import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    String res = new String("NG");

    for (int i = a; i <= b; i++) {
      if (i % k == 0) {
        res = new String("OK");
        break;
      }
    }
    System.out.println(res);
    sc.close();
  }
}