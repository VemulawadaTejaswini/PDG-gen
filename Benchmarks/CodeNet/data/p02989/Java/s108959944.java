import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main (String[] args) {
    Scanner in = new Scanner(System.in);

    while (in.hasNext()) {
      int N = in.nextInt();
      int[] d = new int[N];

      for (int i = 0; i < d.length; ++i) {
        d[i] = in.nextInt();
      }

      Arrays.sort(d);
      int mid1 = d[N / 2 - 1];
      int mid2 = d[N / 2];
      
      System.out.println(mid2 - mid1);
    }
  }
}