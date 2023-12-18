import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt():
      int[] H = new int[N];

      for (int i = 0; i < H.length; ++i) {
        H[i] = in.nextInt();
      }

      int max = 1;
      int count = 1;
      for (int i = 1; i < H.length; ++i) {
        if (H[i] <= H[i - 1]) {
          ++count;
        } else {
          max = Math.max(max, count);
          count = 1;
        }
      }
      max = Math.max(max, count);

      System.out.println(max);
    }
  }
}