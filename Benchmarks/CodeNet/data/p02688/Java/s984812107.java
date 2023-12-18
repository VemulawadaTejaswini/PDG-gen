import java.util.*;
public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int k = sc.nextInt();

    int[] list = new int[n];

    for (int i = 0; i < k; i++) {
      int d = sc.nextInt();
      for (int j = 0; j < d; j++) {
        int ad = sc.nextInt();
        list[ad - 1]++;
      }
    }
    int count = 0;
    for (int i = 0; i < n; i++) {
      if (list[i] <= 0) {
        count++;
      }
    }
    System.out.println(count);

    sc.close();

  }
}