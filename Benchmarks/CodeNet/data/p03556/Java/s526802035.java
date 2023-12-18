import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      if (Math.pow(i,2) > n) {
        System.out.println((long)Math.pow(i-1,2));
        break;
      }
    }

  }

}
