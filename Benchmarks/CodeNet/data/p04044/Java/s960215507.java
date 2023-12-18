import java.util.Arrays;
import java.util.Scanner;

public class Main {
  private static final Scanner in = new Scanner(System.in);

  public static void main(String[] args) {
    int n = in.nextInt();
    int l = in.nextInt();
    String[] arr = new String[n];
    for (int i = 0; i < n; i++) {
      arr[i] = in.next();
    }
    solve(arr);
  }

  private static void solve(String[] arr) {
    StringBuilder res = new StringBuilder();
    Arrays.sort(arr);
    for (String s : arr) {
      res.append(s);
    }
    System.out.println(res);
  }


}
