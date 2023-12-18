import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    int cnt = 0;
    for (int i = 0; i < n; i++) {
      int d = sc.nextInt();
      Boolean f = true;
      for (int ii = 0; ii < arr.length; ii++) {
        if (arr[ii] == d) {
          f = false;
          break;
        }
      }
      if (f) {
        arr[i] = d;
        cnt += 1;
      }
    }
    System.out.println(cnt);
  }
}
