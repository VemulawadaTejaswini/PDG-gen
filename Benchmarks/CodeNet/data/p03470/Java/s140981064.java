import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[101];
    for (int i = 0; i < n; i++) {
      int d = sc.nextInt();
      arr[d] = 1;
    }
    int cnt = 0;
    for (int i = 0; i < 101; i++) {
      if (arr[i] == 1) {
        cnt += 1;
      }
    }
    System.out.println(cnt);
  }
}
