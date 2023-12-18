import java.util.*;
public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int count = 0;
    long[] list = new long[n];
    for (int i = 0; i < n; i++) {
      list[i] = sc.nextLong();
      if (list[i] > i) {
        continue;
      }
      for (int j = i - 1; j >= 0; j--) {
        if ((i - j) == (list[i]+list[j])) {
          count++;
        }
      }
    }
    sc.close();

    System.out.println(count);
  }
}