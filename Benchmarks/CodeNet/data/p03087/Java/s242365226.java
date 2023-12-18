import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in);) {
      int n = sc.nextInt();
      int q = sc.nextInt();

      sc.nextLine();

      String line = sc.next();

      int[] results = new int[n];
      for (int i = 0; i < line.length() - 1; i++) {
        if (line.charAt(i) == 'A' && line.charAt(i + 1) == 'C') {
          results[i + 1] = results[i] + 1;
        } else {
          results[i + 1] = results[i];
        }
      }

      for (int i = 0; i < q; i++) {
        int l = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(results[r - 1] - results[l - 1]);
      }
    }
  }
}