import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    int cnt = 0;
    int pow = 2;
    out: while (true) {
      for (int i = 0; i < n; i++) {
        if (arr[i] % pow != 0) {
          System.out.println(cnt);
          break out;
        }
      }
      cnt += 1;
      pow *= 2;
    }
  }
}
