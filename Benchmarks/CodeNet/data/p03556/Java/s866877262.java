import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    try {
      int N = scanner.nextInt();
      int ans = 0;
      for (int i = 0; i * i <= N; i++) {
        ans = i * i;
      }
      System.out.println(ans);
    }
    finally {
      scanner.close();
    }
  }
}