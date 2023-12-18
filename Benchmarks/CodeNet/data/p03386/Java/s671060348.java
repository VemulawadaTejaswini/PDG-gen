import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {
      int a = scanner.nextInt();
      int b = scanner.nextInt();
      int k = scanner.nextInt();
      if (a + k * 2 - 1 < b) {
        for (int i = 0; i < k; i++) {
          System.out.println(a+i);
        }
        for (int i = 0; i < k; i++) {
          System.out.println(b-k+1+i);
        }
      } else {
        for (int i = a; i <= b; i++) {
          System.out.println(i);
        }
      }
    } finally {
      scanner.close();
    }
  }
}