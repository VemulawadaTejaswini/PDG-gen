import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    int ans = 0;
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println(solve(arr));
    System.out.flush();
    sc.close();
  }

  private static int solve(int[] arr) {
    int ans = 0;
    boolean[] checked = new boolean[arr.length];
    Arrays.sort(arr);
    for (int i = arr.length - 1; i >= 0; i--) {
      boolean found = false;
      //      for (int j = 0; j < arr.length && !found; j++) {
      int j = 0;
      while (j < arr.length && arr[j] <= arr[i] && !found) {
        if (i != j && arr[i] % arr[j] == 0) {
          //          System.out.println(arr[i]+" "+arr[j]);
          found = true;
        }
        j++;
      }
      if (!found) {
        ans++;
      }
    }
    return ans;
  }
}
