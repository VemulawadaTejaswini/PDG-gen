import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.nextLine());
    int[] arr = Arrays.stream(sc.nextLine().split(" "))
      .mapToInt(Integer::parseInt)
      .toArray();
    int cnt = 0;
    out: while (true) {
      for (int i = 0; i < n; i++) {
        if (arr[i] % Math.pow(2, cnt + 1) != 0) {
          System.out.println(cnt);
          break out;
        }
      }
      cnt += 1;
    }
  }
}
