import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 1; i < n; i++) {
      if (n <= i * 1.08 && i * 1.08 < n+1) {
        System.out.println(i);
        return;
      }
    }

    System.out.println(":(");

  }

}
