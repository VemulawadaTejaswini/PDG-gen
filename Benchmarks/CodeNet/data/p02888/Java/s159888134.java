import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] sticks = new int[n];
    for (int i = 0; i < n; i++)
      sticks[i] = sc.nextInt();
    Arrays.sort(sticks);
    int count = 0;
    for (int i = 0; i < n - 2; i++) {
      int k = i + 2;
      for (int j = i + 1; j < n - 1; j++) {
        while (k < n && sticks[i] + sticks[j] > sticks[k])
          k++;
        count += k - 1;
      }
    }
    System.out.println(count);
  }
}